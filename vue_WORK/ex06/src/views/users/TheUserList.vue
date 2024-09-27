<template>
  <div>
    <h1>user</h1>

    <div v-for="item in arr" :key="item.idx" @click="modalUser">
      <h1>idx = {{ item.idx }}</h1>
      <h1>name = {{ item.name }}</h1>
      <h1>email = {{ item.email }}</h1>
      <h1>가입날짜 = {{ item.reg_date }}</h1>
      <h1>작성한글 = {{ item.list.length }}</h1>
    </div>


  </div>
</template>

<script setup>
import { getUsers } from '@/api/userApi';
import { ref, watchEffect } from 'vue';


const arr = ref([]);
const modalUser = ()=>{
  console.log("test");
}


// watch 렌더링시 실행, 처음 로딩시 실행
watchEffect( async()=>{
  const reValue = await getUsers();

  // 문자열 출력방법
  console.log(JSON.stringify(reValue))
  arr.value = reValue.data;
  console.log(arr.value);

});
</script>  


<style scoped>

</style>
