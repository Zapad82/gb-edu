<template>
  <div>
    <div class="container">
      <div class="projectPage">
        <div class="blogpage__banner projectPage__banner">
          <div class="projectPage__banner-img" />
          <div class="blogpage__banner-into projectPage__banner-into">
            <h1 class="blogpage__banner-intoHead projectPage__banner-title">
              Our Project
            </h1>
            <div class="blogpage__banner-breadcrumbs projectPage__banner-subtitle">
              Home / Project
            </div>
          </div>
        </div>
      </div>
    </div>
    <div class="container">
      <div class="projectPage__projects-block">
        <div class="projectPage__project">
          <ProjectCategories />
        </div>
      </div>
    </div>
  </div>
</template>

<script>
import ProjectCategories from '@/components/blocks/ProjectCategories.vue'

export default {
  name: 'ProjectView',
  data () {
    return {}
  },
  mounted () {
  },
  methods: {},
  components: { ProjectCategories }
}
</script>

<style lang="scss" scoped>

</style>
