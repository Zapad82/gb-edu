<template>
  <div>
    <div class="container">
      <div class="project-details">
        <div class="project-details__text">
          <!-- <div class="project-details__content">
            <h1 class="project-details__title">
              Minimal Look Bedrooms
            </h1>
            <div class="project-details__subtitle">
              Lorem ipsum dolor sit amet, consectetur adipiscing elit. Aliquamsem vitae turpis dignissim maximus. Aliquam sollicitudin tellumassa, vbel maximus purus posuere in. Dojrices gravida dignissim. Praesent at nibh in mi fringilla mattis. Phasellus ut dolor odio. Aenean in the ipsum vel lectus bibendum commodo.<br><br>In nec sem suscipit, convallis leo vitae, lacinia nibh. Cras amet tellus lectus. Vivamus ipsum nunc, mattis quis nibh id, pellentesque arcu. Donec a pellentesque Cras erat enim, gravida non ante vitae,elequis convallis elit, in viverra felis. Donec ultrices tellus vitae iaculisvd porta. Proin tincidunt ligula id purus porttitor.
            </div>
          </div> -->
          <div
          v-for="(info, index) in projectInfo"
          :key="index"
          class="project-details__content"
        >
          <h2 class="project-details__title">
            {{ info.heading }}
          </h2>
          <div class="project-details__text-box">
            <p class="project-details__subtitle">
              {{ info.firstparagraph }}
            </p><br><br>
            <p class="project-details__subtitle">
              {{ info.secondparagraph }}
            </p>
          </div>
        </div>
        <div class="project-details__slider">
          <SliderBlock />
        </div>
        </div>
      </div>
    </div>
  </div>
</template>

<script>
import { mapState } from 'vuex'
import SliderBlock from '@/components/blocks/SliderBlock.vue'
export default {
  name: 'ProjectDetails',

  data () {
    return {
    }
  },

  components: {
    SliderBlock
  },

  computed: {
    ...mapState(['projectInfo', 'sliderPictures'])
  },

  mounted () {
  },

  methods: {
  }
}
</script>

<style lang="scss" scoped>
</style>
