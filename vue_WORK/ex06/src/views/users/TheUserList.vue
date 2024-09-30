<template>
  <div :class="{ Mode: setMode }">모달</div>
  <button @click="changeMode">클릭</button>

  <button>save</button>

  <div>
    <h1>user</h1>

    <div class="container">
      <div v-for="item in arr" :key="item.idx" @click="changeMode" class="userlist">
        <h1>idx = {{ item.idx }}</h1>
        <h1>name = {{ item.name }}</h1>
        <h1>email = {{ item.email }}</h1>
        <h1>가입날짜 = {{ item.wdate }}</h1>
        <h1>작성한글 = {{ item.list.length }}</h1>
      </div>
    </div>
  </div>
</template>

<script setup>
import { getUsers, saveUser } from '@/api/userApi';
import { ref, watchEffect } from 'vue';

const setMode = ref(false);

const changeMode = async (item) => {
  setMode.value = !setMode.value;
  if (item == 'save') {
    // saveUser({idx:idx.value, name:name.value}),
    const result = await saveUser({
      idx: idx.value,
      name: name.value
    });
    alert('수정' + result);
    return;
  }
  idx.value = item.idx;
  name.value = item.name;
  wdate.value = item.wdate;
  email.value = item.email;
};

const arr = ref([]);
const idx = ref();
const name = ref();
const wdate = ref();
const email = ref();

// watch 렌더링시 실행, 처음 로딩시 실행
watchEffect(async () => {
  const reValue = await getUsers();

  // 문자열 출력방법
  console.log(JSON.stringify(reValue));
  arr.value = reValue.data;
  console.log(arr.value);
});
</script>

<style scoped>
.Mode {
  display: none;
}

.container {
  display: flex;
  flex-wrap: wrap;
}
.userlist {
  cursor: pointer;
  background: slategrey;
  padding: 5;
  margin: 5;
  color: white;
}
</style>
