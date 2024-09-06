<template>
  <div>
    <h1>안녕 Vue</h1>
    <MyAA :name="김길동"></MyAA>
    <MyAA :name="강길동"></MyAA>
    <MyAA :name="박길동"></MyAA>
    <MyAA :name="최길동"></MyAA>
  </div>
</template>



<script>
import MyAA from '@/components/MyAA.vue'
export default {
  components:{
    MyAA
  },
  setup () {
    return {MyAA}
  }
}
</script>



<style lang="scss" scoped>

</style>

   