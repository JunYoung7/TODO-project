import React from 'react';
import styled from 'styled-components';

interface Props extends TextProps {
  children: React.ReactChild;
}

interface TextProps {
  fontSize?: string;
  fontWeight?: string;
}

const defaultProps = {
  fontSize: '24px',
  fontWeight: 'normal',
};

const CenterLargeText: React.FC<Props> = ({
  fontSize,
  fontWeight,
  children,
}: Props) => {
  return (
    <Text fontSize={fontSize} fontWeight={fontWeight}>
      {children}
    </Text>
  );
};

const Text = styled.p<TextProps>`
  font-size: ${(props) => props.fontSize};
  background-color: transparent;
  color: ${(props) => props.color};
  fontweight: ${(props) => props.fontWeight};
  text-align: center;
`;

CenterLargeText.defaultProps = defaultProps;

export default CenterLargeText;
