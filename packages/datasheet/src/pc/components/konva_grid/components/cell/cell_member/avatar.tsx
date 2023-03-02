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

import dynamic from 'next/dynamic';
import { AvatarSize, AvatarType, getAvatarRandomColor, getFirstWordFromString } from 'pc/components/common';
import { Icon, IconType, Image, Rect, Text } from 'pc/components/konva_components';
import { KonvaGridContext, KonvaGridViewContext } from 'pc/components/konva_grid';
import { createAvatarRainbowColorsArr } from 'pc/utils/color_utils';
import { getEnvVariables } from 'pc/utils/env';
import { FC, memo, useContext } from 'react';

const Group = dynamic(() => import('pc/components/gantt_view/hooks/use_gantt_timeline/group'), { ssr: false });
const Circle = dynamic(() => import('pc/components/gantt_view/hooks/use_gantt_timeline/circle'), { ssr: false });

interface IAvatarProps {
  x?: number;
  y?: number;
  /**
   * The component generates random colors based on id,
   * in general, members, departments, space avatars pass memberId, teamId, spaceId respectively to ensure that
   * the background generated by each place calling this component is the same.
   */
  id: string;
  // Get the first character of the title as the avatar when there is no image.
  title: string;
  src?: string;
  size?: AvatarSize;
  bgColor?: number | null;
  isGzip?: boolean;
  children?: JSX.Element;
  type?: AvatarType;
  isDefaultIcon?: boolean;
}

export const Avatar: FC<React.PropsWithChildren<IAvatarProps>> = memo((props) => {
  const ratio = Math.max(window.devicePixelRatio, 2);
  const {
    x = 0,
    y = 0,
    src,
    title,
    isGzip = true,
    id,
    bgColor,
    size = AvatarSize.Size32,
    type = AvatarType.Member,
    isDefaultIcon,
  } = props;
  const { theme } = useContext(KonvaGridContext);
  const { cacheTheme } = useContext(KonvaGridViewContext);
  const colors = theme.color;
  if (title == null || id == null) return null;

  const avatarSrc = isGzip && src && !getEnvVariables().DISABLED_QINIU_COMPRESSION_PARAMS ? `${src}?imageView2/1/w/${size * ratio}/q/100!` : (src || '');
  const firstWord = getFirstWordFromString(title.trim());
  const avatarBg = (
    avatarSrc ?
      colors.defaultBg :
      (bgColor != null ? createAvatarRainbowColorsArr(cacheTheme)[bgColor] : getAvatarRandomColor(id))
  );

  const renderer = () => {
    switch (type) {
      case AvatarType.Team: {
        if (!src) {
          return (
            <Icon
              type={IconType.TeamAvatar}
              size={size}
              scaleX={0.6}
              scaleY={0.6}
              fill={colors.defaultBg}
              cornerRadius={4}
              background={getAvatarRandomColor(id)}
              transformsEnabled={'all'}
            />
          );
        }
        return (
          <Image
            url={src}
            width={size}
            height={size}
            fill={getAvatarRandomColor(id)}
          />
        );
      }
      case AvatarType.Space: {
        if (!avatarSrc) {
          return (
            <>
              <Rect
                width={size}
                height={size}
                cornerRadius={4}
              />
              <Text
                width={size}
                height={size}
                align={'center'}
                text={firstWord.toUpperCase()}
              />
            </>
          );
        }
        return (
          <Image
            url={avatarSrc}
            width={size}
            height={size}
            fill={avatarBg}
          />
        );
      }
      case AvatarType.Member: {
        if (!avatarSrc && isDefaultIcon) {
          <Icon
            type={IconType.MemberAvatar}
            shape="circle"
            size={size}
            background={colors.rc01}
          />;
        }
        if (!avatarSrc && !isDefaultIcon) {
          const radius = size / 2;
          return (
            <>
              <Circle
                x={radius}
                y={radius}
                radius={radius}
                fill={avatarBg}
              />
              <Text
                width={size}
                height={size}
                align={'center'}
                text={getFirstWordFromString(title)}
                fill={colors.textStaticPrimary}
              />
            </>
          );
        }
        return (
          <Image
            url={avatarSrc}
            shape={'circle'}
            width={size}
            height={size}
            fill={avatarBg}
          />
        );
      }
    }
  };

  return (
    <Group
      x={x}
      y={y}
      listening={false}
    >
      {renderer()}
    </Group>
  );
});
