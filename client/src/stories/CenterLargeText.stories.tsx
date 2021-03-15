import React from 'react';
import CenterLargeText from './CenterLargeText';

interface Props {
  fontSize?: string;
  fontWeight?: string;
}

export default {
  title: 'Atoms/p/CenterLargeText',
  component: CenterLargeText,
  argTypes: {
    fontSize: { control: 'text' },
    fontWeight: { control: 'text' },
  },
};

export const centerLargeText = ({ ...args }: Props): JSX.Element => {
  return <CenterLargeText {...args}>Sample Text</CenterLargeText>;
};

centerLargeText.story = {
  name: 'CenterLargeText',
};

centerLargeText.args = {
  fontSize: '24px',
  fontWeight: 'normal',
};
