import './assets/main.css';

import { createApp } from 'vue';
import { createPinia } from 'pinia';

import App from './App.vue';
import router from './router';

const app = createApp(App);

app.use(createPinia());
app.use(router);

window.Kakao.init('56ffce65aca74d83f8822979bcf885fb'); // 사용하려는 앱의 JavaScript 키 입력

app.mount('#app');
