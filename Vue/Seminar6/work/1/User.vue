<template>
  <li>
    {{ user.name }}
    <a :href="`mailto:${user.email}`">{{ user.email }}</a>
  </li>
</template>
<script>
export default {
  props: {
    user: Object
    }
  }
</script>