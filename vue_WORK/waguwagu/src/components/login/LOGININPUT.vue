<template>
  <div>
    <form>
      <div>
        <label for="username">아이디</label>
        <input type="text" id="username" required />
      </div>

      <div>
        <label for="password">비밀번호</label>
        <input type="password" id="password" required />
      </div>

      <div>
        <input type="checkbox" id="remember" />
        <label for="remember">아이디 저장</label>
      </div>

      <button type="submit">로그인</button>
    </form>
  </div>
</template>

<script setup></script>

<style scoped>
/* 임시설정 입니다. */
body {
  font-family: Arial, sans-serif;
  background-color: #f4f4f4;
  margin: 0;
  padding: 20px;
}
form {
  background-color: #fff;
  padding: 20px;
  border-radius: 5px;
  box-shadow: 0 2px 10px rgba(0, 0, 0, 0.1);
  max-width: 400px;
  margin: auto;
}
div {
  margin-bottom: 15px;
}
label {
  display: block;
  margin-bottom: 5px;
  font-weight: bold;
}
input[type='text'],
input[type='password'] {
  width: 100%;
  padding: 10px;
  border: 1px solid #ccc;
  border-radius: 4px;
  box-sizing: border-box;
}
input[type='text']:focus,
input[type='password']:focus {
  border-color: #007bff;
  outline: none;
}
button {
  background-color: #007bff;
  color: white;
  padding: 10px;
  border: none;
  border-radius: 4px;
  cursor: pointer;
  width: 100%;
  font-size: 16px;
}
button:hover {
  background-color: #0056b3;
}
</style>
