<template>
	<div>
		<h1>메세지 보내기</h1>
		<input
			v-model="message"
			type="text"
			class="block w-full px-3 py-2 text-gray-700 border border-gray-300 rounded-md shadow-sm focus:outline-none focus:ring-blue-500 focus:border-blue-500"
			placeholder="메시지를 입력하세요."
		/>
		<button
			@click="sendMessage"
			class="inline-flex items-center px-4 py-2 text-sm font-medium text-white bg-blue-600 border border-transparent rounded-md shadow-sm hover:bg-blue-700 focus:outline-none focus:ring-2 focus:ring-offset-2 focus:ring-blue-500"
		>
			Send Message
		</button>
	</div>
</template>

<script setup>
import { msgSend } from '@/api/loginApi';
import { ref } from 'vue';

const message = ref('');
const sendMessage = async () => {
	console.log(message);
	await msgSend(message);
};
</script>

<style lang="scss" scoped></style>
