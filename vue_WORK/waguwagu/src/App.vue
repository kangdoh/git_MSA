<template>
  <div class="wrapper">
    <NAV class="gnb"></NAV>

    <RouterView></RouterView>
  </div>
</template>

<script setup>
import { RouterView } from 'vue-router';
import NAV from './components/common/NAV.vue';
import './assets/main.css';
</script>

<style scoped>
.wrapper {
  width: 100vw;
  height: 100vh;
  display: flex;
  justify-content: center;
  align-items: center;
}
.gnb {
  position: absolute;
  top: 0;
  right: 0;
}
</style>
