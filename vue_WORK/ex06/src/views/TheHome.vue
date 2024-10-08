<template>
  <div>
    <h1>HOME</h1>

    <div class="s">
      <router-view>여기로 불러asdasdsdfsdfd온다</router-view>
    </div>

    
  </div>
</template>

<script setup>
import { RouterView } from 'vue-router';

</script>

<style  scoped>
  .s{
      background-color: aqua;
      width: 100%;
      height: 300px;
      border: solid 1px #000;
  }

</style>