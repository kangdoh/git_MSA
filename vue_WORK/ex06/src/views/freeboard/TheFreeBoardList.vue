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
          <!-- 두개의 조건다 부합할시 -->
          <!-- arr가 true이면 -> 뒤에 것 실행 이런방향성으로 생각하자 -->
          <template v-if="arr && arr.length>0">

            <tr v-for="item in arr" :key="item.idx" @click="viewPage(item.idx)">

              <td>{{ item.idx }}</td>
              <td>{{ item.title }}</td>
              <td>{{ item.content }}</td>
              <td>{{ item.creAuthor }}</td>
              <td>{{ item.regDate }}</td>
              <td>{{ item.viewCount }}</td>

              <!-- <template v-if="item.list[0]">
                <td >
                  <img :src="`http:localhost:10000/file/download/${item.list[0].name}`" alt="" width="150">
                </td>
              </template> -->

            </tr>
          </template>
        </tbody>
      </table>
    </div>
    
    <div style="width: 100px; height: 20px;">
      <div v-if="temp">
        sdasdasd
      </div>
    </div>
    <button @click="dfads">클릭클릭</button>

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

const temp = ref(false);
const router = useRouter();
const arr = ref([]);
const totalPages = ref(10);
const pageNum = ref(0);

const dfads = () =>{
  temp.value = !temp.value
}

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
      //여기서 list는 데이터베이스의 실제 칼럼명
      console.log(res.data.list);
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