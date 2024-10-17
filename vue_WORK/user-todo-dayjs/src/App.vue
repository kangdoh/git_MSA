<template>
  <div>
    <nav>
      <RouterLink to="/">Home</RouterLink>
      <RouterLink to="/about">About</RouterLink>
      <RouterLink to="/month">Month</RouterLink>
      <!-- <RouterLink to="/day">Day</RouterLink> -->
    </nav>
    
    <br>
    
    <RouterView />
  </div>
</template>

<script setup>
  import dayjs from 'dayjs';

  const now = new dayjs();
  console.log(now);
  console.log(now.format('YYYY년MM월DD일 hh시mm분ss초'));

  const firstday = dayjs().startOf('month');
  const lastday = dayjs().endOf('month');

  console.log(dayjs().day());
  console.log("첫날 : "+firstday.day());
  console.log("마지막날 : "+lastday.day());

  // 10월 17일 -> 9월 17일
  const beforeMonth = dayjs().subtract(1,'month').format('YYYY/MM/DD');
  // 9월 마지막날
  const sepLastday = dayjs(beforeMonth).endOf('month');
  console.log("sepLastday : "+sepLastday.format('YYYY/MM/DD'));

  // 현재달과 9월달을 비교
  console.log(dayjs().isSame(sepLastday, 'month'));
  // 
  console.log(dayjs().isSame(dayjs().startOf('month'), 'month'));
  console.log(dayjs().isSame(dayjs().endOf('month'), 'month'));


</script>

<style scoped>

</style>