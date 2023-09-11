import Vue from 'vue'
import Vuex from 'vuex'
import ImageSlide1 from '@/assets/img/content/Photo1Block2.jpg'
import ImageSlide2 from '@/assets/img/content/Photo1Block3.png'
import ImageSlide3 from '@/assets/img/content/Photo3Block3.png'

Vue.use(Vuex)

export default {
  props: ['slide'],

  state: {
    projectInfo: [
      {
        heading: 'Minimal Look Bedrooms',
        firstparagraph: 'Lorem ipsum dolor sit amet, consectetur adipiscing elit. Aliquamsem vitae turpis dignissim maximus. Aliquam sollicitudin tellumassa, vbel maximus purus posuere in. Dojrices gravida dignissim. Praesent at nibh in mi fringilla mattis. Phasellus ut dolor odio. Aenean in the ipsum vel lectus bibendum commodo.',
        secondparagraph: 'In nec sem suscipit, convallis leo vitae, lacinia nibh. Cras amet tellus lectus. Vivamus ipsum nunc, mattis quis nibh id, pellentesque arcu. Donec a pellentesque Cras erat enim, gravida non ante vitae,elequis convallis elit, in viverra felis. Donec ultrices tellus vitae iaculisvd porta. Proin tincidunt ligula id purus porttitor.'
      }
    ],
    //     sliderPictures: [
    //   { id: '1', src: '@/assets/img/content/Photo1Block2.jpg', caption: 'slider pic' },
    //   { id: '2', src: '@/assets/img/content/Photo1Block3.png', caption: 'slider pic' },
    //   { id: '3', src: '@/assets/img/content/Photo3Block3.png', caption: 'slider pic' }
    // ],
    slide: 0,
    sliderPictures: [
      {
        src: ImageSlide1,
        caption: 'First slide'
      },
      {
        src: ImageSlide2,
        caption: 'Second slide'
      },
      {
        src: ImageSlide3,
        caption: 'Third slide'
      }
    ]
  },

  getters: {
    project: (state) => state.projectInfo,
    image: (state) => state.sliderPictures
  },

  mutations: {
    // SET_PROJECT (state, project)
  },

  actions: {
  },

  modules: {
  }
}
