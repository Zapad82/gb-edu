import Vue from 'vue'
import VueRouter from 'vue-router'
import HomeView from '../views/HomeView.vue'
// import BlogView from '../views/BlogView.vue'
// import BlogDetailsView from '../views/BlogDetailsView.vue'
Vue.use(VueRouter)

const routes = [
  {
    path: '/',
    name: 'home',
    component: HomeView
  },
  {
    path: '/blog',
    name: 'blog',
    // route level code-splitting
    // this generates a separate chunk (about.[hash].js) for this route
    // which is lazy-loaded when the route is visited.
    component: () => import(/* webpackChunkName: "about" */ '../views/BlogView.vue')
    // component: BlogView
  },
  {
    path: '/blog-details',
    name: 'blog-details',
    component: () => import(/* webpackChunkName: "about" */ '../views/BlogDetailsView.vue')
    // component: BlogDetailsView
  }
]

const router = new VueRouter({
  routes
})

export default router
