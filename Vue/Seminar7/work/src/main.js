import Vue from 'vue'
import App from './App.vue'
import router from './router'
import store from './store'

Vue.use(Vuex)

Vue.config.productionTip = false

const store = new Vuex.Store({
  state: {
    count: 0
  },
  mutations: {
    increment (state) {
      state.count++
    },
    decrement (state) {
      state.count--
    }
  }
})

new Vue({
  router,
  store,
  render: h => h(App)
}).$mount('#app')
