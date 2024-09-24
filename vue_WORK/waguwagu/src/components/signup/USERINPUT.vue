<template>
  <div>
    <form>
      <div>
        <label for="username">아이디 (필수)</label>
        <input type="text" id="username" required />
      </div>

      <div>
        <label for="password">비밀번호 (필수)</label>
        <input type="password" id="password" required />
      </div>

      <div>
        <label for="name">이름 (필수)</label>
        <input type="text" id="name" required />
      </div>

      <div>
        <label for="age">나이 (필수)</label>
        <input type="number" id="age" required />
      </div>

      <div>
        <label>성별 (필수)</label>
        <select required>
          <option value="" disabled selected>선택하세요</option>
          <option value="male">남성</option>
          <option value="female">여성</option>
          <option value="other">기타</option>
        </select>
      </div>

      <div>
        <label for="phone">폰번호 (필수)</label>
        <input type="tel" id="phone" required />
      </div>

      <div>
        <label for="email">이메일 (선택)</label>
        <input type="email" id="email" />
      </div>

      <button type="submit">가입하기</button>
    </form>
  </div>
</template>

<script setup></script>

<style scoped>
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
input[type='password'],
input[type='number'],
input[type='tel'],
input[type='email'],
select {
  width: 100%;
  padding: 10px;
  border: 1px solid #ccc;
  border-radius: 4px;
  box-sizing: border-box;
}
input[type='text']:focus,
input[type='password']:focus,
input[type='number']:focus,
input[type='tel']:focus,
input[type='email']:focus,
select:focus {
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
