import { createRouter, createWebHistory } from 'vue-router'

import MainView from '@/views/MainView.vue'

import list from '@/components/main/list.vue'
import search from '@/components/main/search.vue'

const router = createRouter({
  history: createWebHistory(import.meta.env.BASE_URL),
  routes: [
    {
      path: '/',
      name: 'main',
      component: MainView,
      children: [
        {
          path: "",
          name: "list",
          component: list
        },
        {
          path: "",
          name: "search",
          component: search

        },
      ]
    },

  ]
})

export default router
