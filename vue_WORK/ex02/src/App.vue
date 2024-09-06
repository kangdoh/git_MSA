<template>
  <div>
    <TheNav></TheNav>
    <TheCounter></TheCounter>
    <TheCounter></TheCounter>
    <TheCounter></TheCounter>

    <RouterView></RouterView>
  </div>
</template>

<script>
import { RouterView } from 'vue-router';
import TheCounter from './views/TheCounter.vue';
import TheNav from './views/TheNav.vue';
// import TheInsert from './views/TheInsert.vue';
// import TheSelect from './views/TheSelect.vue';
export default {
  components:{
    RouterView, TheCounter, TheNav
  },
  setup () {
    

    return {}
  }
}
</script>

<style lang="scss" scoped>

</style>