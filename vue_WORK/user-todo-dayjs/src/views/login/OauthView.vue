<template>
	<div>
		<h1>Oauth</h1>

		<template if="loginCheck">
			<div>
				<h1>로그인에 성공하셧습니다.</h1>
				<router-link to="/">홈으로</router-link>
			</div>
		</template>
	</div>
</template>

<!-- 로그인 되면 이 페이지로 이동해서 watchEffect 작동 -->
<!-- login를 통해서 'loginApi'에서 벡과 통신한다. -->

<!-- 백엔드로 코드 보내기 -->
<script setup>
import { ref, watchEffect } from 'vue';
import { useRoute } from 'vue-router';
import { login } from '@/api/loginApi';

const route = useRoute();
const loginCheck = ref(false);

watchEffect(async () => {
	console.log('code = ', route.query.code);
	if (route.query.code) {
		const data = await login(route.query.code);
		console.log('data =', data);

		localStorage.setItem('token', data);
		loginCheck.value = true; // 로그인 성공
	} else {
		console.log('값없음');
	}
});
</script>

<style lang="scss" scoped></style>
