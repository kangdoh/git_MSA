import { createRouter, createWebHistory } from 'vue-router';
import HomeView from '../views/HomeView.vue';
import AboutView from '@/views/AboutView.vue';
import MonthView from '@/views/MonthView.vue';
import TheLogin from '@/views/login/TheLogin.vue';
import OauthView from '@/views/login/OauthView.vue';
import MessageView from '@/views/login/MessageView.vue';

const loginRouter = [
	{
		path: '/login',
		name: 'login',
		component: TheLogin
	},
	{
		path: '/oauth',
		name: 'oauth',
		component: OauthView
	}
];

const router = createRouter({
	history: createWebHistory(import.meta.env.BASE_URL),
	routes: [
		...loginRouter,
		{
			path: '/',
			name: 'home',
			component: HomeView
		},
		{
			path: '/about',
			name: 'about',
			component: AboutView
		},
		{
			path: '/month',
			name: 'month',
			component: MonthView
		},
		{
			path: '/message',
			name: 'message',
			component: MessageView
		}

		// // route level code-splitting
		// // this generates a separate chunk (About.[hash].js) for this route
		// // which is lazy-loaded when the route is visited.
		// {
		//   path: '/about',
		//   name: 'about',
		//   component: () => import('../views/AboutView.vue')
		// }
	]
});

export default router;
