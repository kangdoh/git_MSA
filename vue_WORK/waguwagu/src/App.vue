<template>
    <div>
        <NAV></NAV>

        <RouterView></RouterView>
    </div>
</template>


<script setup>
import {RouterView} from 'vue-router';
import NAV from './components/common/NAV.vue';

</script>

<style scoped>

</style>