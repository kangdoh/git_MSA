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

        <div>
          <input @change="onFileChange" type="file" name="" id="">
        </div>

        <button @click="save" type="button">게시</button>
      </form>
    </div>
  </div>
</template>

<script setup>
// import ComEditor from '@/components/ComEditor.vue';
import { ref } from 'vue';
import { useRouter } from 'vue-router';
import { saveFreeboard } from '@/api/freeboardApi';

const title = ref('');
const content = ref('');
const myfile = ref(null);
const router = useRouter();

const onFileChange = (e)=>{
  myfile.value = e.target.files[0];
}

const save = async () => {
  const data = {
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

  const res = await saveFreeboard(formData);
  if(res.status==200){
    alert('저장하였습니다.');
    router.push({name:'freeboardlist'});
    return;
  }
  alert('에러' + res.response.data.message);
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