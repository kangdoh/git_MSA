<template>
  
  <div>
    <!-- 페이지가 '홈' 일때의 상황 -->
    <ul class="nav" v-if="isOnBoard">
      <li><RouterLink to="/board">게시판</RouterLink></li>
      <li><RouterLink to="login">로그인</RouterLink></li>
      <li><RouterLink to="/signup">회원가입</RouterLink></li>
    </ul>
    <!-- 페이지가 '홈'이 아닐때의 상황 -->
    <ul class="nav" v-else>
      <li><RouterLink to="/">홈</RouterLink></li>
      <li><RouterLink to="login">로그인</RouterLink></li>
      <li><RouterLink to="/signup">회원가입</RouterLink></li>
    </ul>
  </div>

</template>

<script setup>
import { computed } from 'vue';
import { useRoute } from 'vue-router';

const route = useRoute();
const isOnBoard = computed(() => {
  // path === '/' => 이것은 index.js의 경로
  // '/' 이 경로의 상태일때의 상황을, computed라는 명령어를 사용하여 isOnBoard라는 변수로 지정한것
  return route.path === '/';
});
</script>

<style scoped>
/* 임시설정 입니다. */
.nav {
  display: flex;
}
.nav li {
  padding: 10px;
  margin: 0 10px;
}
.nav li:hover {
  background: blue;
}
</style>
