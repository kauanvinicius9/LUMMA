import { createRouter, createWebHistory } from 'vue-router'
import HomeView from '../pages/home.vue/index.js'

const router = createRouter({
  history: createWebHistory(import.meta.env.BASE_URL),
  routes: [
    {
      path: '/',
      name: 'home',
      component: HomeView,
    },
    {
      path: '/about',
      name: 'about',
      component: () => import('../pages/login.vue/index.js'),
    },
  ],
})

export default router
