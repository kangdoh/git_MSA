<template>
    <div>
        <ul class="gnb">
            <li><RouterLink to="/">HOME</RouterLink></li>
            <li><RouterLink to="/select">SELECT</RouterLink></li>
            <li><RouterLink to="/insert">INSERT</RouterLink></li>
            <li><RouterLink to="/update">UPDATE</RouterLink></li>
            <li><RouterLink to="/delete">DELETE</RouterLink></li>
        </ul>
    </div>
</template>

<script>
export default {
    setup () {
        return {}
    }
}
</script>

<style lang="css" scoped>
    .gnb{
        list-style-type: none;
        display: flex;
    }
    .gnb li{
        margin: 0 10px;
    }
    a{
        text-decoration: none;
        color: brown;
        font-weight: bold;
    }
</style>