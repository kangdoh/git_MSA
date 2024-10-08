<template>
  <div>
    <div class="login-container">
      <h2 class="login-title">로그인</h2>

      <form @submit.prevent="submitLogin">
        <div class="form-group">
          <label for="email" class="form-label">이메일</label>
          <input
            v-model="email"
            type="email"
            id="email"
            name="email"
            required
            class="form-input"
            placeholder="이메일을 입력하세요"
          />
        </div>
        <div class="form-group">
          <label for="password" class="form-label">비밀번호</label>
          <input
            v-model="password"
            type="password"
            id="password"
            name="password"
            required
            class="form-input"
            placeholder="비밀번호를 입력하세요"
          />
        </div>
        <button type="submit" class="login-button">로그인</button>
      </form>

      <p class="register-text">계정이 없으신가요? <a href="#" class="register-link">회원가입</a></p>
    </div>
  </div>
</template>

<script setup>
import { doLogin } from '@/api/loginApi';
import { ref } from 'vue';

const email = ref('');
const password = ref('');

const submitLogin = async () => {
    const data = {"email": email.value, "password": password.value};
    const res = await doLogin(data);

    console.log(res);
}






</script>


<style scoped>
.login-container {
  background-color: white;
  padding: 32px;
  border-radius: 8px;
  box-shadow: 0 4px 12px rgba(0, 0, 0, 0.1);
  width: 384px; /* 96 * 4 */
  margin: 0 auto; /* 중앙 정렬 */
}

.login-title {
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

.login-button {
  width: 100%;
  background-color: #2563eb; /* blue-600 */
  color: white;
  padding: 8px;
  border-radius: 4px;
  cursor: pointer;
}

.login-button:hover {
  background-color: #1d4ed8; /* blue-700 */
}

.register-text {
  margin-top: 16px;
  text-align: center;
  font-size: 0.875rem;
  color: #4b5563; /* gray-600 */
}

.register-link {
  color: #2563eb; /* blue-600 */
  text-decoration: underline;
}

.register-link:hover {
  text-decoration: none; /* 기본 스타일 */
}
</style>