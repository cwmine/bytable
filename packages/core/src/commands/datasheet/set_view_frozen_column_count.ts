/**
 * APITable <https://github.com/apitable/apitable>
 * Copyright (C) 2022 APITable Ltd. <https://apitable.com>
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Affero General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Affero General Public License for more details.
 *
 * You should have received a copy of the GNU Affero General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */

import { IJOTAction } from 'engine/ot';
import { DatasheetActions } from 'model';
import { getActiveDatasheetId, getDatasheet } from '../../exports/store/selectors';
import { ResourceType } from 'types';
import { CollaCommandName } from 'commands';
import { ExecuteResult, ICollaCommandDef } from 'command_manager';

export interface ISetViewFrozenColumnCount {
  cmd: CollaCommandName.SetViewFrozenColumnCount;
  count: number;
  viewId: string;
}

export const setViewFrozenColumnCount: ICollaCommandDef<ISetViewFrozenColumnCount> = {
  undoable: true,

  execute: (context, options) => {
    const { state: state } = context;
    const { count, viewId } = options;
    const datasheetId = getActiveDatasheetId(state)!;
    const datasheet = getDatasheet(state, datasheetId);

    if (!state || !datasheet) {
      return null;
    }

    const actions: IJOTAction[] = [];
    const setViewFrozenColumnCountAction = DatasheetActions.setFrozenColumnCount2Action(datasheet.snapshot, { viewId, count });

    setViewFrozenColumnCountAction && actions.push(setViewFrozenColumnCountAction);
    if (actions.length === 0) {
      return null;
    }

    return {
      result: ExecuteResult.Success,
      resourceId: datasheetId,
      resourceType: ResourceType.Datasheet,
      actions,
    };
  },
};

