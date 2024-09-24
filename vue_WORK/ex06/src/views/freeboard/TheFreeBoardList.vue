<template>
  <div>
    <h1 class="h1_red">FreeBoardList</h1>
    
    <div>
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
        <tbody class="sss">
          <tr v-for="item in arr" :key="item.idx">
            <td>{{ item.idx }}</td>
            <td @click="viewPage(item.idx)">{{ item.title }}</td>
            <td>{{ item.content }}</td>
            <td>{{ item.creAuthor }}</td>
            <td>{{ item.regDate }}</td>
            <td>{{ item.viewCount }}</td>
          </tr>
        </tbody>
      </table>
    </div>
    
    <div>
      <ul class="dfasdf">
        <li v-for="num in totalPages" v-bind:key="num" @click="setPageNum(num-1)">
          {{ num }}
        </li>
      </ul>
    </div>

  </div>
</template>


<script setup>
import axios from 'axios';
import { ref } from 'vue';
import { useRouter } from 'vue-router';


const router = useRouter();
const arr = ref([]);
const totalPages = ref(10);
const pageNum = ref(0);

const setPageNum = (num) => { 
  pageNum.value = num;
  getFreeBoard(num);
}
const viewPage = (idx) => {
  const data = { name: 'freeboardview', params: { idx } };
  router.push(data);
}
const getFreeBoard = (pageNum) => {
  if (pageNum == undefined) pageNum = 0;
  // url?변수 방식이 쿼리 파라미터라고 함
  axios.get(`http://localhost:10000/freeboard?pageNum=${pageNum}`)
    .then(res => {
      arr.value = res.data.list;
      totalPages.value = res.data.totalPages;
    })
    .catch(e => {
      console.log(e);
    })
}
// page 호출되자 마자 자동실행
getFreeBoard();

</script>


<style scoped>
  .tata{
    border: 1px solid #000;
  }
  .dfasdf{
    list-style: none;
    display: flex;
  }
  .dfasdf li{
    margin: 10px;
    cursor: pointer;
    padding: 5px
  }
  .sss tr:hover{
    background-color: aliceblue;
  }
</style>