/*
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

package com.apitable.workspace.enums;

public enum NodePermissionEnum {
  MANAGER(0),
  EDITOR(1),
  UPDATE_ONLY(2),
  READ_ONLY(3);

  private int value;

  NodePermissionEnum(int value) {
    this.value = value;
  }

  public int getValue() {
    return value;
  }

  public static NodePermissionEnum toEnum(int value) {
    for (NodePermissionEnum e : NodePermissionEnum.values()) {
      if (e.getValue() == value) {
        return e;
      }
    }
    throw new RuntimeException("unknown node permission");
  }
}
