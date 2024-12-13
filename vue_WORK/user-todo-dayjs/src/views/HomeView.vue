<template>
	<div>
		<h1>Home view 입니다.</h1>

		<h1>{{ now.format('YYYY/MM/DD') }}</h1>
		<hr />
		<h2>- 빼기 -</h2>
		<h1>년 빼기 : {{ now.subtract(1, 'year').format('YYYY/MM/DD') }}</h1>
		<h1>월 빼기 : {{ now.subtract(1, 'month').format('YYYY/MM/DD') }}</h1>
		<h1>일 빼기 : {{ now.subtract(1, 'day').format('YYYY/MM/DD') }}</h1>
		<hr />
		<h2>- 더하기 -</h2>
		<h1>년 더하기 : {{ now.add(1, 'year').format('YYYY/MM/DD') }}</h1>
		<h1>월 더하기 : {{ now.add(1, 'month').format('YYYY/MM/DD') }}</h1>
		<h1>일 더하기 : {{ now.add(1, 'day').format('YYYY/MM/DD') }}</h1>
		<hr />
		<h1>이번달 기준</h1>
		<h1>첫째날 : {{ now.startOf('month') }}</h1>
		<h1>마지막날 : {{ now.endOf('month') }}</h1>
	</div>
</template>

<script setup>
import dayjs from 'dayjs';
const now = new dayjs();
</script>

<style scoped></style>
