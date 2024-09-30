<template>
  <div>
    <h1 class="h1-red">TheFreeBoardUpdate</h1>
    <div class="p-5">
      <input type="text" v-model="title" placeholder="Enter your title here" />
      <textarea v-model="content" placeholder="Enter Content here"></textarea>
    </div>
    <div>
      <input type="file" @change="onFileChange">
    </div>
  </div>
  <div>
    <button @click="save">수정</button>
  </div>
</template>

<script setup>
import { ref } from 'vue';
import { useRoute, useRouter } from 'vue-router';
import axios from 'axios';

const title = ref('');
const content = ref('');
const regDate = ref('');
const creAuthor = ref('');
const idx = ref(0);
const router = useRouter();
const route = useRoute();

const myfile = ref(null);

const onFileChange = (e)=>{
  myfile.value = e.target.files[0];
}

// 자동으로 리스트에 데이터를 불러오는 함수
const getfreeboard = () => {
  axios
    .get(`http://localhost:10000/freeboard/view/${route.query.idx}`)
    .then((res) => {
      title.value = res.data.title;
      content.value = res.data.content;
      regDate.value = res.data.regDate;
      creAuthor.value = res.data.creAuthor;
      idx.value = res.data.idx;
    })
    .catch((e) => {
      console.log(e);
      alert(e.response.data.message);
      router.push({ name: 'freeboardlist' });
    });
};

// 클릭시 변경사항의 데이터를 보내는 함수
const save = () => {
  const data = {
    idx: route.query.idx,
    title: title.value,
    content: content.value
  };

  const formDate = new FormData();
  formDate.append("data",new Blob([ JSON.stringify(data)], {type:'application/json'}));
  formDate.append('file', myfile.value);
  axios
    .post('http://localhost:10000/freeboard', formDate)
    .then((res) => {
      console.log(res);
      alert('저장');
      router.push({ name:'freeboardlist', params:{pageNum:0} });
    })
    .catch((e) => {
      console.log(e);
      alert('에러' + e.response.data.message);
    });
};

getfreeboard();

</script>

<style scoped></style>
