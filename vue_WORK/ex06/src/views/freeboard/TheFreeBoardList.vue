<template>
  <div>
    <h1 class="h1_red">FreeBoardList</h1>    

    <table class="tata">
      <thead>
        <tr>
          <th>IDX</th>
          <th>title</th>
          <th>content</th>
          <th>author</th>
          <th>redate</th>
          <th>viewcount</th>
        </tr>
      </thead>

      <tbody>
        <tr v-for="item in arr" :key="item.idx">
          <td>{{ item.idx }}</td>
          <td>{{ item.title }}</td>
          <td>{{ item.content }}</td>
          <td>{{ item.creAuthor }}</td>
          <td>{{ item.regDate }}</td>
          <td>{{ item.viewCount }}</td>
        </tr>
      </tbody>
    </table>
  </div>
</template>


<script setup>
import axios from 'axios';
import { ref } from 'vue';
import { useRoute } from 'vue-router';

// const title = ref('');
// const content = ref('');

const route = useRoute();
console.log("route.params.aa = "+route.params.aa);
console.log("route.params.bb = "+route.params.bb);

const arr = ref([]);
axios.get('http://localhost:8080/freeBoard')
.then(res => {
  console.log(res.data);
  arr.value = res.data;
})
.catch(e => {
  console.log(e);
})



</script>



<style scoped>
  .tata{
    border: 1px solid #000;
  }
</style>