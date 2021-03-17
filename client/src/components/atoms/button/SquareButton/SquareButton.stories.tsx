import React from 'react';
import SquareButton from './SquareButton';

interface Props {
  backgroundColor?: string;
  color?: string;
  onClick?: () => void;
}

export default {
  title: 'Atoms/button/SquareButton',
  component: SquareButton,
  argTypes: {
    backgroundColor: { control: 'color' },
    color: { control: 'color' },
  },
};

export const squareButton = ({ ...args }: Props): JSX.Element => {
  return <SquareButton {...args}>test</SquareButton>;
};

squareButton.story = {
  name: 'SquareButton',
};

squareButton.args = {
  backgroundColor: 'red',
  color: 'black',
};
