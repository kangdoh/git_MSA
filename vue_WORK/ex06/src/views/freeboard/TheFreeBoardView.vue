<template>
  <div>
    <h1 class="h1-red">TheFreeBoardView</h1>
      <div>
        <h1>제목 : {{ title }}</h1>
        <hr>
        <p>내용 : {{ content }}</p>
        <p>작성일자 : {{ regdate }}</p>
        <p>작성자 : {{ creAuthor }}</p>
      </div>

      <div>
        <button @click="pageMove(idx)">수정</button>
        <button @click="deletee(idx)">삭제</button>
      </div>
    </div>
</template>

<script setup>
import { ref } from 'vue';
import { useRoute, useRouter } from 'vue-router';
import axios from 'axios';


const route = useRoute();
const router = useRouter();

const title = ref('초기값');
const content = ref('초기값');
const regdate = ref('초기값');
const creAuthor = ref('초기값');
const idx = ref(0);

const deletee = (idx) =>{
  axios.delete(`http://localhost:8080/freeboard/delete/${idx}`)
  .then(res =>{
    if(res.status == '200'){
      router.push({name : "freeboardlist"})
    }
  })
  .catch(e => console.log(e));
}

const pageMove = ()=>{
  router.push({name:"freeboardinput", query:{idx:idx.value}});
}


const getFreeBoard = () =>{
  axios.get(`http://localhost:8080/freeboard/view/${route.params.idx}`)
    .then(res => {
      title.value =res.data.title;
      content.value =res.data.content;
      regdate.value =res.data.regdate;
      creAuthor.value =res.data.creAuthor;
      idx.value =res.data.idx;
    })
    .catch(e => {
      console.log(e);
      alert(e.response.dat.message);
      router.push({name:"freeboardlist"})
    })
}
getFreeBoard();

</script>

<style lang="scss" scoped>

</style>