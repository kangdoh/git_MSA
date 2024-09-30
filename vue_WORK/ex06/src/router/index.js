import Fileupload from "@/views/files/FileUpLoad.vue";
import TheFreeboardInput from "@/views/freeboard/TheFreeBoardInput.vue";
import TheFreeBoardList from "@/views/freeboard/TheFreeBoardList.vue";
import TheFreeBoardUpdate from "@/views/freeboard/TheFreeBoardUpdate.vue";
import TheFreeBoardView from "@/views/freeboard/TheFreeBoardView.vue";
import Test from "@/views/Test.vue";
import TheHome from "@/views/TheHome.vue";
import TheUserList from "@/views/users/TheUserList.vue";
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
      component: TheUserList
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
    },
    {
      path: '/freeboardview/:idx',
      name: 'freeboardview',
      component: TheFreeBoardView
    },
    {
      path: '/freeboardupdate/:idx',
      name: 'freeboardupdate',
      component: TheFreeBoardUpdate
    },
    {
      path: '/fileupload',
      name: 'fileupload',
      component: Fileupload
    },
    {
      path: '/test',
      name: 'test',
      component: Test
    }

  ]
});

export default router;


// router -> 페이지이동
// route ->
// param : http://localhost
// query : 