<template>
  <b-carousel
      id="carousel1"
      class="carousel slide"
      :v-model="slide"
      :interval="4000"
      controls
      indicators
      style='
        width: 1201px;
        height: 799px flex-shrink: 0; border-radius: 70px; background: #C4C4C4;
        background: lightgray 50% / cover no-repeat;'
    >
      <b-carousel-slide
        v-for="(image, index) in sliderPictures"
        :key="index"
        :img-src="image.src"
        :caption="image.caption"
        :zoom="true"
        style='
          width: 1201px;
          height: 799px;
          border-radius:"70px";
          flex-shrink: 0;
          border-radius: 70px;
          background: #C4C4C4;'
      >
      </b-carousel-slide>
    </b-carousel>
  <!-- <swiper
    :style="{
      '--swiper-navigation-color': '#CDA274',
      '--swiper-pagination-color': '#CDA274',
    }"
    :zoom="true"
    :navigation="true"
    :pagination="{
      clickable: true,
    }"
    :modules="modules"
    class="mySwiper" -->
  <!-- > -->
    <!-- <b-carousel
      v-for="picture in sliderPictures"
      :key="picture"
    >
      <div class="swiper-zoom-container">
        <img
          class="swiper-slide__img"
          :src="picture.src"
          :alt="picture.alt"
        />
      </div>
    </b-carousel> -->
  <!-- </swiper> -->
</template>

<script>

import { BCarousel, BCarouselSlide } from 'bootstrap-vue'
import { mapState } from 'vuex'

export default {
  data () {
    return {
      slide: 0
      // images: [
      //   {
      //     src: 'http://192.168.0.123:8080/img/Photo1Block2.jpg',
      //     caption: 'First slide'
      //   },
      //   {
      //     src: 'http://192.168.0.123:8080/img/Photo1Block2.jpg',
      //     caption: 'Second slide'
      //   },
      //   {
      //     src: 'http://192.168.0.123:8080/img/Photo1Block2.jpg',
      //     caption: 'Third slide'
      //   }
      // ]
    }
  },
  name: 'SliderBlock',

  components: {
    BCarousel,
    BCarouselSlide
  },
  setup () {
    return {
    }
  },
  computed: {
    ...mapState(['projectInfo', 'sliderPictures'])
  }

  // data () {
  //   return {
  //     slide: 0,
  //     images: [
  //       {
  //         src: 'https://picsum.photos/id/237/600/400',
  //         caption: 'First slide'
  //       },
  //       {
  //         src: 'https://picsum.photos/id/238/600/400',
  //         caption: 'Second slide'
  //       },
  //       {
  //         src: 'https://picsum.photos/id/239/600/400',
  //         caption: 'Third slide'
  //       }
  //     ]
  //   }
  // },

  // props: {
  // }
}
</script>
