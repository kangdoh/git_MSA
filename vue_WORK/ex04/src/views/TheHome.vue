<template>
  <div>
    <!-- for(String temp :stlist){ } -->
    <!-- v-for 구문 : 향상된 for구문이다. -->
    <h1>Home</h1>
    <!-- <ul>
        <li v-for="user in list" v-bind:key="user.idx">
            idx = {{ user.idx }} / 
            name = {{ user.name }}
        </li>
    </ul> -->
    <!-- <ul>
        <li v-for="num in list" v-bind:key="num">
            {{ num }}
        </li>
    </ul> -->

    <h1>데이터 출력</h1>
    <tr v-for="user in list" v-bind:key="user.idx">
      <td>{{ user.idx }}</td>
      <td>{{ user.name }}</td>
      <td>{{ user.age }}</td>
      <td>{{ user.password }}</td>
      <td>{{ user.wdate }}</td>
    </tr>

    <h1>데이터 전송</h1>
    <div>
      name = <input type="text" name="name" id="name" v-model="name" /> <br />
      age = <input type="text" name="number" id="age" v-model="age" /> <br />
      email = <input type="text" name="name" id="email" v-model="email" /> <br />
      password = <input type="text" name="name" id="password" v-model="password" /> <br />
    </div>
    <button @click="insert">select</button>
  </div>
</template>

<script>
import { ref } from 'vue'

export default {
  setup() {
    const list = ref([])

    const name = ref('')
    const age = ref('')
    const email = ref('')
    const password = ref('')
    const wdate = ref('')

    // const select = () => {
    //   fetch('http://localhost:8080/user/select')
    // }

    const insert = () => {
      const data = {
        name: name.value,
        age:  parseInt(age.value),
        email: email.value,
        password: password.value
      }
      fetch('http://localhost:8080/user/insert', {
        method: 'POST',
        headers: {
          'Content-Type': 'application/json' // JSON 형식으로 보낼 때의 헤더 설정
        },
        body: JSON.stringify(data)
      })
        .then((res) => {
          if (!res.ok) {
            throw new Error(`HTTP error! Status: ${res.status}`)
          }
          return res.json()
        })
        .then((data) => {
          console.log(data)
        })
        .catch((e) => {
          console.error('Fetch error:', e)
        })
    }
    return { ref, insert, name, age, password, wdate, email, list }
  }
}
</script>

<style lang="scss" scoped></style>
