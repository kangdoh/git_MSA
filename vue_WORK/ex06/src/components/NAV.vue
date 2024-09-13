<template>
  <div>
    <button class="dfddfs"><RouterLink to="/">home</RouterLink></button>
    <RouterLink to="/user">user</RouterLink>
    <RouterLink to="/freeboard">freeboards</RouterLink>
  </div>
</template>

<script setup>
import { RouterView, RouterLink } from 'vue-router';
import (RouterView)

</script>


<style scoped>
  .dfddfs{
    background-color: antiquewhite;
    border: solid 1px rgb(172, 160, 146);
    border-radius: 1.05rem;
    padding: 3px;
  }

</style>