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
                  <img :src="`${GLOBAL_URL}/file/download/${item.list[0].name}`" 
                  alt="" width="150">
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
    <button @click="changeTemp">클릭클릭</button>

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
import { ref, watchEffect } from 'vue';
import { useRouter } from 'vue-router';
// import { GLOBAL_URL } from '@/api/util';
import { getFreeBoard } from '@/api/freeboardApi';

const temp = ref(null);
const changeTemp = ()=>{ temp.value = !temp.value }

const router = useRouter();
const arr = ref([]);
const totalPages = ref(10);
const pageNum = ref(0);

const setPageNum = async(num) => {
  pageNum.value = num;
  const res = await getFreeBoard(num);
  arr.value = res.data.list;
  totalPages.value = res.data.totalPages;
};

const viewPage = (idx) => {
  const data = { name: 'freeboardview', params: { idx } };
  router.push(data);
};

watchEffect(async()=>{
  const res = await getFreeBoard();
  arr.value = res.data.list;
  totalPages.value = res.data.totalPages;
})
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