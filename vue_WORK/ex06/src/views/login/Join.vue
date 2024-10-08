<template>
  <div>
    <h2 class="signup-title">회원가입</h2>

    <form @submit.prevent="doSubmit">
      <div class="form-group">
        <label for="username" class="form-label">사용자 이름</label>
        <input
          type="text"
          id="username"
          name="username"
          required
          class="form-input"
          placeholder="사용자 이름을 입력하세요"
          value="김아영"
        />
      </div>
      <div class="form-group">
        <label for="email" class="form-label">이메일</label>
        <input
          type="email"
          id="email"
          name="email"
          required
          class="form-input"
          placeholder="이메일을 입력하세요"
          value="aaa@naver.com"
        />
      </div>
      <div class="form-group">
        <label for="password" class="form-label">비밀번호</label>
        <input
          type="password"
          id="password"
          name="password"
          required
          class="form-input"
          placeholder="비밀번호를 입력하세요"
          value="1234"
        />
      </div>
      <div class="form-group">
        <label for="confirm-password" class="form-label">비밀번호 확인</label>
        <input
          type="password"
          id="confirm-password"
          name="confirm-password"
          required
          class="form-input"
          placeholder="비밀번호를 다시 입력하세요"
          value="1234"
        />
      </div>
      <button type="submit" class="signup-button">회원가입</button>
    </form>

    <p class="login-text">이미 계정이 있으신가요? <a href="#" class="login-link">로그인</a></p>
  </div>
</template>

<script setup>
import { doJoin } from '@/api/loginApi';

const doSubmit = async () => {
    const res = await doJoin({
        "name" :"홍길동",
        "password" : "1234",
        "age": "11",
        "email" : "hong@naver.com"
    });
    console.log(res);
}


</script>



<style scoped>
.signup-container {
  background-color: white;
  padding: 32px;
  border-radius: 8px;
  box-shadow: 0 4px 12px rgba(0, 0, 0, 0.1);
  width: 384px; /* 96 * 4 */
  margin: 0 auto; /* 중앙 정렬 */
}

.signup-title {
  font-size: 2rem;
  font-weight: bold;
  margin-bottom: 24px;
  text-align: center;
}

.form-group {
  margin-bottom: 16px;
}

.form-label {
  display: block;
  font-size: 0.875rem;
  font-weight: medium;
  color: #4b5563; /* gray-700 */
}

.form-input {
  margin-top: 4px;
  padding: 8px;
  border: 1px solid #d1d5db; /* gray-300 */
  border-radius: 4px;
  width: 100%;
}

.signup-button {
  width: 100%;
  background-color: #2563eb; /* blue-600 */
  color: white;
  padding: 8px;
  border-radius: 4px;
  cursor: pointer;
}

.signup-button:hover {
  background-color: #1d4ed8; /* blue-700 */
}

.login-text {
  margin-top: 16px;
  text-align: center;
  font-size: 0.875rem;
  color: #4b5563; /* gray-600 */
}

.login-link {
  color: #2563eb; /* blue-600 */
  text-decoration: underline;
}

.login-link:hover {
  text-decoration: none; /* 기본 스타일 */
}
</style>