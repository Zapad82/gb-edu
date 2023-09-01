<template>
  <div>
    <div class="container">
      <div class="blog-details__banner" />
    </div>
    <BlogDetails />
  </div>
</template>

<script>
import BlogDetails from '../components/blocks/BlogDetails.vue'
export default {
  name: 'BlogDetailsView',
  components: {
    BlogDetails
  },
  data () {
    return {

    }
  },

  mounted () {
  },

  methods: {
  }
}
</script>

<style lang="scss" scoped>

</style>
