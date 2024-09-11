<template>
  <div class="join-container">
    <h1>회원가입</h1>
    <form @submit.prevent="submitForm">
      <div>
        <label for="username">사용자 이름:</label>
        <input v-model="username" id="name" type="text" required />
      </div>
      <div>
        <label for="password">비밀번호:</label>
        <input v-model="password" id="password" type="password" required />
      </div>
      <div>
        <label for="email">이메일:</label>
        <input v-model="email" id="email" type="email" required />
      </div>
      <div>
        <label for="age">나이:</label>
        <input v-model="age" id="age" type="text" required />
      </div>
      <button @click="save" type="submit">가입하기</button>
    </form>
  </div>
</template>

<script setup>
import axios from 'axios';
import { ref } from 'vue';

const name = ref('');
const age = ref('');
const email = ref('');
const password = ref('');

const submitForm = () => {
  console.log('Form Submitted:', form.value);
  // 실제 제출 로직을 여기에 추가합니다.
  
};

const save = ()=>{
  const data = {
    name:name.value,
    age:age.value,
    email:email.value,
    password:password.value
  };
  alert(JSON.stringify(data));
  axios.post('http://localhost:8080/user/insert' , data)
  .then(res=>{console.log(res)})
  .catch(e =>{console.log(e)});  
}
</script>


<style scoped>
.join-container {
  max-width: 400px;
  margin: auto;
  padding: 20px;
  border: 1px solid #ccc;
  border-radius: 5px;
}

form div {
  margin-bottom: 15px;
}

label {
  display: block;
  margin-bottom: 5px;
}

input {
  width: 100%;
  padding: 8px;
  box-sizing: border-box;
}

button {
  padding: 10px 15px;
  border: none;
  background-color: #007bff;
  color: white;
  cursor: pointer;
}
</style>
