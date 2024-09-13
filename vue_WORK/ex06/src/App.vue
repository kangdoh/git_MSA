<template>
  <div>
    <NAV></NAV>

    <router-view>

      
    </router-view>
  </div>
</template>

<script setup>
import { RouterView } from 'vue-router';
import NAV from './components/NAV.vue';

</script>

<style lang="scss" scoped>

</style>