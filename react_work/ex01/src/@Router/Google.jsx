import React, { useEffect, useState } from 'react';
import styled from 'styled-components';

const StyleDiv  = styled.button.attrs(props => ({
    type: 'button', // 기본 type 속성 설정
    primary: props.primary ? 'true' : undefined, // primary prop에 따라 속성 설정
}))`
  background: ${props => (props.$primary ? 'blue' : 'gray')};
  color: white;
  padding: 10px;
  border: none;
  border-radius: 5px;
  cursor: pointer;
`;

function Google() {
    const [isPrimary, setIsPrimary] = useState(() => {
        const saved = localStorage.getItem('isPrimary');
        return saved === 'true'; // 로컬 스토리지에서 불러오기
    });

    useEffect(() => {
        localStorage.setItem('isPrimary', isPrimary); // 상태 변경 시 로컬 스토리지에 저장
    }, [isPrimary]);

    const toggleColor = () => {
        setIsPrimary(prev => !prev); 
    };

    return (
        <div>
            <StyleDiv $primary={isPrimary} onClick={toggleColor}>구글검색해주세요.</StyleDiv>
        </div>
    );
}

export default Google;