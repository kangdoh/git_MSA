<template>
  <div>
    <h1 class="h1h1h1">Free Board</h1>

    <div class="container">
      <h1>게시판</h1>
      <form id="postForm">
        <label for="title">제목:</label>
        <input v-model="title" type="text" id="title" required />

        <label for="content">내용:</label>
        <textarea v-model="content" id="content" rows="4" required></textarea>

        <button @click="save" type="button">게시</button>
      </form>
    </div>
  </div>
</template>

<script setup>
import axios from 'axios';
// ref는 반응형 생성데이터이다.
import { ref } from 'vue';
import { useRouter } from 'vue-router';

// const title = ref('');
// const content = ref('');
const router = useRouter();
// const route = useRoute();


const title = ref('');
const content = ref('');
// const regdate = ref('');
// const creAuthor = ref('');
// const idx = ref(0);

// const getFreeBoard = () =>{
//   axios.get(`http://localhost:8080/freeboard/view/${route.params.idx}`)
//     .then(res => {
//       title.value =res.data.title;
//       content.value =res.data.content;
//       regdate.value =res.data.regdate;
//       creAuthor.value =res.data.creAuthor;
//       idx.value =res.data.idx;
//     })
//     .catch(e => {
//       console.log(e);
//       alert(e.response.dat.message);
//       router.push({name:"freeboardlist"})
//     })
// }

const save = () => {
  const data = {
    // title:과 content:는 칼럼명입니다.
    title: title.value,
    content: content.value
  };

  // 여기서 freeBoard는 테이블 명이다. data는 객채의 변수명이다.
  axios
    .post('http://localhost:8080/freeBoard', data)
    .then((res) => {
      console.log(res);
      alert('저장');
      router.push({ name: 'freeboardlist', params:{aa:10, bb:"안녕하세요."} });
    })
    .catch((e) => {
      console.log(e);
      alert('에러' + e.response.data.message);
    });
};
</script>

<style scoped>
.h1h1h1 {
  margin-bottom: 30px;
}
.container {
  width: 80%;
  max-width: 800px;
  margin: 0 auto;
  padding: 20px;
  background-color: #fff;
  box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);
}
h1 {
  text-align: center;
}
form {
  margin-bottom: 20px;
}
label {
  display: block;
  margin: 10px 0 5px;
}
input[type='text'],
textarea {
  width: 100%;
  padding: 10px;
  border: 1px solid #ddd;
  border-radius: 4px;
  box-sizing: border-box;
}
button {
  display: block;
  width: 100%;
  padding: 10px;
  background-color: #28a745;
  border: none;
  border-radius: 4px;
  color: #fff;
  font-size: 16px;
  cursor: pointer;
}
button:hover {
  background-color: #218838;
}
.post {
  border-bottom: 1px solid #ddd;
  padding: 10px 0;
}
.post h2 {
  margin: 0 0 10px;
}
.post p {
  margin: 0;
}
</style>
