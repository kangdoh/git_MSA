<template>
  <div>
    <h1 class="h1-red">FreeBoardUpdate</h1>
    <div class="p-5">
      <input
        type="text"
        v-model="title"
        placeholder="Enter your title here"
      />
      <textarea
        v-model="content"
        placeholder="Enter Content here"
      ></textarea>
      <div class="my-3">
        <input type="file" name="" id="" @change="onFileChange">
      </div>
      <button
        @click="save"
      >
        수정
      </button>
    </div>
  </div>
</template>

<script setup>
import axios from 'axios';
import { ref } from 'vue';
import { useRoute, useRouter } from 'vue-router';

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

const getfreeboard = ()=>{
  axios.get(`http://localhost:10000/freeboard/view/${route.query.idx}`)
    .then(res => {
      title.value = res.data.title;
      content.value = res.data.content;
      regDate.value = res.data.regDate;
      creAuthor.value = res.data.creAuthor;
      idx.value = res.data.idx;
    })
    .catch(e => {
      console.log(e);
      alert(e.response.data.message);
      router.push({ name: "freeboardlist" });
    })
}

const save = () => {
  const data = {
    idx: route.query.idx,
    title: title.value,
    content: content.value
  };

  const formData = new FormData();
  formData.append("data", new Blob(
                            [JSON.stringify(data)],
                            { type:'application/json'}
                          )
                        );
  formData.append("file", myfile.value);
  axios
    .post('http://localhost:10000/freeboard', formData)
    .then((res) => {
      console.log(res);
      alert('저장하였습니다.');
      router.push({ name: 'freeboardlist', params: { pagenum: 0 } });
    })
    .catch((e) => {
      console.log(e);
      alert('에러' + e.response.data.message);
    });
};

getfreeboard();


</script>

<style scoped></style>