<template>
  <div id="app">
    <user-list :users="users"></user-list>
  </div>
</template>

<script>
  new Vue({
    name: '#app',
    data: {
    users: [
    {
    id: 1,
    name: 'John Doe',
    email: 'john.doe@example.com'
    },
    {
    id: 2,
    name: 'Jane Smith',
    email: 'jane.smith@example.com'
    }
    ]
    }
    })
    </script>