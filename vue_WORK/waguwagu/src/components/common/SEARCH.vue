<template>
  <div>
    <form>
      <div>
        <input type="text" id="search" placeholder="검색어를 입력하세요..." required />
      </div>
      <button type="submit">검색</button>
    </form>
  </div>
</template>

<script setup></script>

<style scoped>
/* 임시설정 입니다. */
body {
  font-family: Arial, sans-serif;
  background-color: #f4f4f4;
  display: flex;
  justify-content: center;
  align-items: center;
  height: 100vh;
  margin: 0;
}

form {
  display: flex;
  align-items: center;
}

input[type='text'] {
  width: 400px; /* 원하는 너비 설정 */
  padding: 15px; /* 패딩으로 입력 영역 확장 */
  border: 1px solid #ccc; /* 테두리 색 */
  border-radius: 24px; /* 둥근 모서리 */
  font-size: 16px; /* 글자 크기 */
  box-shadow: 0 2px 10px rgba(0, 0, 0, 0.1); /* 그림자 효과 */
  outline: none; /* 포커스 시 기본 윤곽선 제거 */
}

input[type='text']:focus {
  border-color: #007bff; /* 포커스 시 테두리 색상 변경 */
}

button {
  background-color: #007bff; /* 버튼 배경색 */
  color: white; /* 버튼 텍스트 색상 */
  padding: 15px 20px; /* 버튼 패딩 */
  border: none; /* 기본 테두리 제거 */
  border-radius: 24px; /* 둥근 모서리 */
  cursor: pointer; /* 커서 모양 변경 */
  margin-left: 10px; /* 입력 필드와 버튼 간격 */
  font-size: 16px; /* 글자 크기 */
}

button:hover {
  background-color: #0056b3; /* 버튼 호버 시 색상 변경 */
}
</style>
