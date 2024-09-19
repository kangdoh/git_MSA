import TheFreeboardInput from "@/views/freeboard/TheFreeboardInput.vue";
import TheFreeBoardList from "@/views/freeboard/TheFreeBoardList.vue";
import TheHome from "@/views/TheHome.vue";
import TheUser from "@/views/TheUser.vue";
import { createRouter, createWebHistory } from "vue-router";

const router = createRouter({
  history:createWebHistory(),
  routes:[
    {
      path:'/',
      name : 'home',
      component: TheHome
    },

    {
      path:'/user',
      name : 'user',
      component: TheUser
    },

    {
      path:'/freeboardinput',
      name : 'freeboardinput',
      component: TheFreeboardInput
    },

    {
      path:'/freeboardlist', 
      name :'freeboardlist',
      component: TheFreeBoardList
    }
  ]
});

export default router;


