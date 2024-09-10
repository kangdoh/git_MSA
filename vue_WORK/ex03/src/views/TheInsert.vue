<template>
    <div>
        <h1>Insert</h1>

        <label for="email">email</label>
        <input type="text" placeholder="입력" v-model="email" id="email">
        <button @click="doInsert">전송</button>
    </div>
</template>

<script>
import {ref} from "vue";
export default {
    setup () {
        const email = ref('')
        const doInsert = () => {
            console.log(email.value);
            // fetch('http://localhost:8080/user/insert')
        }
        return {doInsert, email}
    }
}
</script>


<style lang="scss" scoped>

</style>