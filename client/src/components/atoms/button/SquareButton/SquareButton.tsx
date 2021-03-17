import React from 'react';
import styled from 'styled-components';

interface Props {
  backgroundColor?: string;
  color?: string;
  children: React.ReactChild;
  onClick?: () => void;
}

const defaultProps = {
  backgroundColor: 'blue',
  color: 'black',
};

const Button = styled.button<Props>`
  width: 65px;
  height: 50px;
  background-color: ${(props) => props.backgroundColor};
  color: ${(props) => props.color};
  cursor: pointer;
  border: 0px;
`;

const SquareButton: React.FC<Props> = ({ backgroundColor, color, children }: Props) => {
  return (
    <Button backgroundColor={backgroundColor} color={color}>
      {children}
    </Button>
  );
};

SquareButton.defaultProps = defaultProps;

export default SquareButton;
