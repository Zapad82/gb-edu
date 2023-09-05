<template>
  <div>
    <h1>
      Список пользователей
    </h1>
    <ul>
      <li
        v-for="user in users"
        :key="user.id">
        <user
          :user="user"
        >
        </user>
      </li>
    </ul>
  </div>
</template>
  
<script>
import User from '@/components/User.vue'
export default {
  name: 'UserList',
  data () {
    return {
    users: []
    }
  },
  mounted () {
    this.getUsers()
    },
  methods: {
    getUsers () {
      axios.get('/users')
      .then(response => {
      this.users = response.data
      })
    }
  }
}
</script>