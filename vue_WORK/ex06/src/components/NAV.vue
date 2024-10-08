<template>
  <div>
    <ul class="gnb">
      <li><RouterLink to="/">home</RouterLink></li>

      <li><RouterLink to="/user">user</RouterLink></li>

      <li class="gkgkgk">
        freeBoard
        <ul class="ddfa">
          <li><RouterLink to="/freeboardinput">freeboardinput</RouterLink></li>
          <li><RouterLink to="/freeboardlist">freeboardlist</RouterLink></li>
        </ul>
      </li>

      <li><RouterLink to="/fileupload">fileupload</RouterLink></li>
      <li><RouterLink to="/test">test</RouterLink></li>

      <li><RouterLink to="/join">Join</RouterLink></li>
      <li><RouterLink to="/login">login</RouterLink></li>
    </ul>
  </div>
</template>

<script setup>
import { RouterLink } from 'vue-router'
// import (RouterView)
</script>

<style scoped>
.gnb {
  list-style-type: none;
  display: flex;
}
.gnb li {
  padding: 8px;
}
.gkgkgk {
  list-style-type: none;
  margin: 0;
  padding: 0;
  cursor: pointer;
}
.gkgkgk li {
  display: none;
}
.gkgkgk:hover li {
  display: block;
}
.ddfa{
  padding: 0;
  margin: 0;
}

</style>
