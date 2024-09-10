<template>
  <div>
<!-- for(String temp :stlist){ } -->
<!-- v-for 구문 : 향상된 for구문이다. -->
    <h1>Home</h1>
    <ul>
        <li v-for="user in list" v-bind:key="user.idx">
            idx = {{ user.idx }} / 
            name = {{ user.name }}
        </li>
    </ul>
    <ul>
        <li v-for="num in list" v-bind:key="num">
            {{ num }}
        </li>
    </ul>

  </div>
</template>

<script>
import { ref } from 'vue'

export default {
  setup() {
    const num = [];
    const list = ref([
      {
        idx: 1,
        name: '바꿔바꿔바꿔바꿔바꿔',
        age: 100,
        email: '바꿔@naver.com',
        password: '1234',
        wdate: '2024-09-06T11:18:32.729596'
      },
      {
        idx: 2,
        name: '이게되네',
        age: 25,
        email: 'asdf@yahoo.com',
        password: 'qwer',
        wdate: '2024-09-06T11:32:44.718893'
      },
      {
        idx: 3,
        name: '홍길동',
        age: 100,
        email: 'qwer@naver.com',
        password: '1234',
        wdate: '2024-09-06T11:18:32.729596'
      }
    ])

    // fetch(`192.168.0.291.8080/user/select`)
    return { list, num }
  }
}
</script>

<style lang="scss" scoped></style>
