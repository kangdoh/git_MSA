<template>
  <div>
    <h1>{{ myVar }}</h1>

    <TheWelcome></TheWelcome>
    <RouterView></RouterView>
  </div>
</template>

<script setup>
import { RouterLink, RouterView } from 'vue-router';
import TheWelcome from './components/TheWelcome.vue';
import TheHome from './views/TheHome.vue';
import TheJoin from './views/TheJoin.vue';
  const myVar = "안녕하세요";



</script>

<style lang="scss" scoped>

</style>