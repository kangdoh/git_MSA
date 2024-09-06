<template>
  <div>
    <h1>The Insert</h1>
    <button @click="userSend">전송</button>
  </div>
</template>

<script>
export default {
  setup() {
    const mydata = {
      name: '천재야',
      age: 500,
      email: 'dfafs@navcmef.com',
      password: 'fasdfadf',
      wdate: '2024-09-06'
    }
    const userSend = () => {
      fetch('http://localhost:8080/user/insert', {
        method: 'post',
        headers: { 'Content-Type': 'application/json' },
        body: JSON.stringify(mydata)
      }).then((res) => {
        console.log(res)
      })
    }

    return { userSend }
  }
}
</script>

<style lang="scss" scoped></style>
