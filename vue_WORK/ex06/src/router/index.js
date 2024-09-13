import TheFreeboard from "@/views/TheFreeboard.vue";
import TheHome from "@/views/TheHome.vue";
import TheUser from "@/views/TheUser.vue";
import { createRouter, createWebHashHistory } from "vue-router";

const router = createRouter({
  history:createWebHashHistory(),
  routes:[
    {path:'/', component: TheHome},
    {path:'/freeboard', component: TheFreeboard},
    {path:'/user', component: TheUser}
  ]
});

export default router;


