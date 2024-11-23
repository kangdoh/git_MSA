<template>
	<h1>Login</h1>
	<div class="flex flex-col items-center justify-center gap-4 p-6 rounded-lg shadow-lg min-height-80">
		<a id="custom-login-btn" @click="kakaoLogin()" class="transition-transform transform hover:scale-105">
			<img
				src="https://k.kakaocdn.net/14/dn/btroDszwNrM/I6efHub1SN5KCJqLm1Ovx1/o.jpg"
				width="222"
				alt="카카오 로그인 버튼"
				class="rounded-lg shadow-md"
			/>
		</a>
		<div
			@click="kakaoLogout()"
			class="px-4 py-2 text-sm text-white bg-red-500 rounded-full cursor-pointer hover:bg-red-600 transition-all"
		>
			로그아웃
		</div>
	</div>
</template>

<script setup>
const kakaoLogin = () => {
	window.Kakao.Auth.authorize({
		redirectUri: 'http://localhost:5173/oauth',
		scope: 'account_email,friends,talk_calender,talk_calender_task'
	});
	// 	scope는 로그인 요청 시 사용자가 허용해야 할 권한을 정의합니다. 이 경우:
	// account_email: 사용자 이메일 접근 권한
	// friends: 친구 목록 접근 권한
	// talk_calender: 카카오톡 일정 접근 권한
	// talk_calender_task: 카카오톡 일정 작업 접근 권한
};

const kakaoLogout = () => {
	// window.Kakao.Auth.logout();

	localStorage.removeItem('token');
	alert('로그아웃 성공');

	// localStorage.removeItem('kakao_access_token');
	// localStorage.removeItem('kakao_refresh_token');
	// localStorage.removeItem('kakao_id');
};
</script>

<style lang="scss" scoped></style>
