<template>
  <div>
    <div class="container">
      <div class="project-details__banner" />
    </div>
    <ProjectDetails />
  </div>
</template>

<script>
import ProjectDetails from '../components/pages/ProjectDetails.vue'
export default {
  name: 'ProjectDetailsView',

  components: {
    ProjectDetails
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
