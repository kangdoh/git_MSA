<template>
    <div>
      <h1>count = {{ count }}</h1>
      <button @click="addCount">증가</button>
    </div>
  </template>
  
  <script>
  //ref 화면을 자동을 바꿔주겠다.
  import {ref} from 'vue';
  
  export default {
    setup () {
      const count = ref(0);
      const addCount = ()=>{
        count.value = count.value+1;
        console.log('일로온다')
      }
      return {count, addCount}
    }
  }
  </script>
  
  <style lang="scss" scoped>
  
  </style>