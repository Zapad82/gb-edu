<template>
  <div class="container">
    <div class="projectPage__projects-block">
      <div class="projectPage__projects">
        <div class="projectPage__categories">
          <div class="projectPage__categories-content">
            <div
              v-for="button in buttons"
              :key="button.id"
              class="projectPage__categories-button"
            >
              <label
                data-id="button.id"
              >
                <input
                  :data-id="button.id"
                  @click="filters"
                  class="blog-details__input"
                  type="radio"
                  name="radio"
                >
                {{ button.text }}
              </label>
            </div>
          </div>
        </div>
        <div class="projectPage__flexbox">
          <div
          class="projectPage__categories-flex"
          v-for="article in sortedArray"
          :key="article.id"
        >
          <div
            class="projectPage__projectBlock"
            v-for="item in article.arrayCard"
            :key="item.id"
          >
            <div v-if="item.id" class="projectPage__blocks">
              <div class="projectPage__projectBlock-img">
                <img
                  :src="item.src"
                  :alt="item.alt"
                >
              </div>
              <div class="projectPage__projectBlock-text">
                <div class="projectPage__projectBlock-subContent">
                  <h2 class="projectPage__projectBlock-title">
                    {{ item.title }}
                  </h2>
                  <div class="projectPage__projectBlock-subTitle">
                    {{ item.breadcrumbs }}
                  </div>
                </div>
                <div class="projectPage__projectBlock-link">
                  <a
                    :href="item.linlk"
                  >
                    <img
                      :src="item.linkImg"
                    >
                  </a>
                </div>
              </div>
            </div>
          </div>
        </div>
        <!-- <div
          class="projectPage__categories-flex"
          v-for="article in sortedArray"
          :key="article.id"
        >
          <div
            class="projectPage__projectBlock"
            v-for="item in article.arrayCard"
            :key="item.id"
          >
            <div v-if="item.id >= 5 && item.id < 9" class="flex">
              <div class="projectPage__projectBlock-img">
                <img
                  :src="item.src"
                  :alt="item.alt"
                >
              </div>
              <div class="projectPage__projectBlock-text">
                <div class="projectPage__projectBlock-subContent">
                  <h2 class="projectPage__projectBlock-title">
                    {{ item.title }}
                  </h2>
                  <div class="projectPage__projectBlock-subTitle">
                    {{ item.breadcrumbs }}
                  </div>
                </div>
                <div class="projectPage__projectBlock-link">
                  <a
                    :href="item.linlk"
                  >
                    <img
                      :src="item.linkImg"
                    >
                  </a>
                </div>
              </div>
            </div>
          </div>
        </div> -->
        </div>
        <div class="blogpage__pagination">
          <div class="blogpage__pagination-page">
            01
          </div>
          <div class="blogpage__pagination-page">
            02
          </div>
          <div class="blogpage__pagination-page">
            03
          </div>
          <div class="blogpage__pagination-page">
            <svg
              xmlns="http://www.w3.org/2000/svg"
              width="53"
              height="52"
              viewBox="0 0 53 52"
              fill="none"
            >
              <circle
                cx="26.5"
                cy="26"
                r="25.5"
                stroke="none"
              />
              <path
                d="M23.5571 32L29.5 25.3143L23.5571 18.6286"
                stroke="#292F36"
                stroke-width="2"
                stroke-linecap="round"
                stroke-linejoin="round"
              />
            </svg>
          </div>
        </div>
      </div>
    </div>
  </div>
</template>

<script>
import image1 from '@/assets/img/content/ProjectPhoto2.jpg'
import image2 from '@/assets/img/content/ProjectPhoto3.jpg'
import image3 from '@/assets/img/content/ProjectPhoto4.jpg'
import image4 from '@/assets/img/content/ProjectPhoto5.jpg'
import image5 from '@/assets/img/content/ProjectPhoto6.jpg'
import image6 from '@/assets/img/content/ProjectPhoto7.jpg'
import image7 from '@/assets/img/content/ProjectPhoto8.jpg'
import image8 from '@/assets/img/content/ProjectPhoto9.jpg'
import imageStar from '@/assets/img/content/Star3.png'
import imageToRight from '@/assets/img/logos/_toRight.svg'

export default {
  name: 'ProjectCategories',

  data () {
    return {
      sortedArray: [
        {
          id: 'bathroom',
          arrayCard: [
            {
              id: '1',
              title: 'Minimal Bathroom',
              breadcrumbs: 'Decor / Artchitecture',
              src: image1,
              alt: 'photo',
              star: imageStar,
              linkImg: imageToRight,
              linlk: '#'
            },
            {
              id: '2',
              title: 'Minimal Bathroom',
              breadcrumbs: 'Decor / Artchitecture',
              src: image2,
              alt: 'photo',
              star: imageStar,
              linkImg: imageToRight,
              linlk: '#'
            },
            {
              id: '3',
              title: 'Minimal Bathroom',
              breadcrumbs: 'Decor / Artchitecture',
              src: image3,
              alt: 'photo',
              star: imageStar,
              linkImg: imageToRight,
              linlk: '#'
            },
            {
              id: '4',
              title: 'Minimal Bathroom',
              breadcrumbs: 'Decor / Artchitecture',
              src: image4,
              alt: 'photo',
              star: imageStar,
              linkImg: imageToRight,
              linlk: '#'
            },
            {
              id: '5',
              title: 'Minimal Bathroom',
              breadcrumbs: 'Decor / Artchitecture',
              src: image5,
              alt: 'photo',
              star: imageStar,
              linkImg: imageToRight,
              linlk: '#'
            },
            {
              id: '6',
              title: 'Minimal Bathroom',
              breadcrumbs: 'Decor / Artchitecture',
              src: image6,
              alt: 'photo',
              star: imageStar,
              linkImg: imageToRight,
              linlk: '#'
            },
            {
              id: '7',
              title: 'Minimal Bathroom',
              breadcrumbs: 'Decor / Artchitecture',
              src: image7,
              alt: 'photo',
              star: imageStar,
              linkImg: imageToRight,
              linlk: '#'
            },
            {
              id: '8',
              title: 'Minimal Bathroom',
              breadcrumbs: 'Decor / Artchitecture',
              src: image8,
              alt: 'photo',
              star: imageStar,
              linkImg: imageToRight,
              linlk: '#'
            }
          ]
        }
      ],
      articles: [
        {
          id: 'bathroom',
          arrayCard: [
            {
              id: '1',
              title: 'Minimal Bedroom',
              breadcrumbs: 'Decor / Artchitecture',
              src: image2,
              alt: 'photo',
              star: imageStar,
              linkImg: imageToRight,
              linlk: '#'
            },
            {
              id: '2',
              title: 'Minimal Bedroom',
              breadcrumbs: 'Decor / Artchitecture',
              src: image3,
              alt: 'photo',
              star: imageStar,
              linkImg: imageToRight,
              linlk: '#'
            },
            {
              id: '3',
              title: 'Minimal Bedroom',
              breadcrumbs: 'Decor / Artchitecture',
              src: image4,
              alt: 'photo',
              star: imageStar,
              linkImg: imageToRight,
              linlk: '#'
            },
            {
              id: '4',
              title: 'Minimal Bedroom',
              breadcrumbs: 'Decor / Artchitecture',
              src: image5,
              alt: 'photo',
              star: imageStar,
              linkImg: imageToRight,
              linlk: '#'
            },
            {
              id: '5',
              title: 'Minimal Bedroom',
              breadcrumbs: 'Decor / Artchitecture',
              src: image6,
              alt: 'photo',
              star: imageStar,
              linkImg: imageToRight,
              linlk: '#'
            },
            {
              id: '6',
              title: 'Minimal Bedroom',
              breadcrumbs: 'Decor / Artchitecture',
              src: image7,
              alt: 'photo',
              star: imageStar,
              linkImg: imageToRight,
              linlk: '#'
            },
            {
              id: '7',
              title: 'Minimal Bedroom',
              breadcrumbs: 'Decor / Artchitecture',
              src: image8,
              alt: 'photo',
              star: imageStar,
              linkImg: imageToRight,
              linlk: '#'
            },
            {
              id: '8',
              title: 'Minimal Bedroom',
              breadcrumbs: 'Decor / Artchitecture',
              src: image1,
              alt: 'photo',
              star: imageStar,
              linkImg: imageToRight,
              linlk: '#'
            }
          ]
        },
        {
          id: 'bedroom',
          arrayCard: [
            {
              id: '1',
              title: 'Minimal Bedroom',
              breadcrumbs: 'Decor / Artchitecture',
              src: image3,
              alt: 'photo',
              star: imageStar,
              linkImg: imageToRight,
              linlk: '#'
            },
            {
              id: '2',
              title: 'Minimal Bedroom',
              breadcrumbs: 'Decor / Artchitecture',
              src: image4,
              alt: 'photo',
              star: imageStar,
              linkImg: imageToRight,
              linlk: '#'
            },
            {
              id: '3',
              title: 'Minimal Bedroom',
              breadcrumbs: 'Decor / Artchitecture',
              src: image5,
              alt: 'photo',
              star: imageStar,
              linkImg: imageToRight,
              linlk: '#'
            },
            {
              id: '4',
              title: 'Minimal Bedroom',
              breadcrumbs: 'Decor / Artchitecture',
              src: image6,
              alt: 'photo',
              star: imageStar,
              linkImg: imageToRight,
              linlk: '#'
            },
            {
              id: '5',
              title: 'Minimal Bedroom',
              breadcrumbs: 'Decor / Artchitecture',
              src: image7,
              alt: 'photo',
              star: imageStar,
              linkImg: imageToRight,
              linlk: '#'
            },
            {
              id: '6',
              title: 'Minimal Bedroom',
              breadcrumbs: 'Decor / Artchitecture',
              src: image8,
              alt: 'photo',
              star: imageStar,
              linkImg: imageToRight,
              linlk: '#'
            },
            {
              id: '7',
              title: 'Minimal Bedroom',
              breadcrumbs: 'Decor / Artchitecture',
              src: image1,
              alt: 'photo',
              star: imageStar,
              linkImg: imageToRight,
              linlk: '#'
            },
            {
              id: '8',
              title: 'Minimal Bedroom',
              breadcrumbs: 'Decor / Artchitecture',
              src: image2,
              alt: 'photo',
              star: imageStar,
              linkImg: imageToRight,
              linlk: '#'
            }
          ]
        },
        {
          id: 'kitchen',
          arrayCard: [
            {
              id: '1',
              title: 'Minimal Kitchan',
              breadcrumbs: 'Decor / Artchitecture',
              src: image1,
              alt: 'photo',
              star: imageStar,
              linkImg: imageToRight,
              linlk: '#'
            },
            {
              id: '2',
              title: 'Minimal Kitchan',
              breadcrumbs: 'Decor / Artchitecture',
              src: image2,
              alt: 'photo',
              star: imageStar,
              linkImg: imageToRight,
              linlk: '#'
            },
            {
              id: '3',
              title: 'Minimal Kitchan',
              breadcrumbs: 'Decor / Artchitecture',
              src: image3,
              alt: 'photo',
              star: imageStar,
              linkImg: imageToRight,
              linlk: '#'
            },
            {
              id: '4',
              title: 'Minimal Kitchan',
              breadcrumbs: 'Decor / Artchitecture',
              src: image4,
              alt: 'photo',
              star: imageStar,
              linkImg: imageToRight,
              linlk: '#'
            },
            {
              id: '5',
              title: 'Minimal Kitchan',
              breadcrumbs: 'Decor / Artchitecture',
              src: image5,
              alt: 'photo',
              star: imageStar,
              linkImg: imageToRight,
              linlk: '#'
            },
            {
              id: '6',
              title: 'Minimal Kitchan',
              breadcrumbs: 'Decor / Artchitecture',
              src: image6,
              alt: 'photo',
              star: imageStar,
              linkImg: imageToRight,
              linlk: '#'
            },
            {
              id: '7',
              title: 'Minimal Kitchan',
              breadcrumbs: 'Decor / Artchitecture',
              src: image7,
              alt: 'photo',
              star: imageStar,
              linkImg: imageToRight,
              linlk: '#'
            },
            {
              id: '8',
              title: 'Minimal Kitchan',
              breadcrumbs: 'Decor / Artchitecture',
              src: image8,
              alt: 'photo',
              star: imageStar,
              linkImg: imageToRight,
              linlk: '#'
            }
          ]
        },
        {
          id: 'livingArea',
          arrayCard: [
            {
              id: '1',
              title: 'Minimal Living Area',
              breadcrumbs: 'Decor / Artchitecture',
              src: image4,
              alt: 'photo',
              star: imageStar,
              linkImg: imageToRight,
              linlk: '#'
            },
            {
              id: '2',
              title: 'Minimal Living Area',
              breadcrumbs: 'Decor / Artchitecture',
              src: image5,
              alt: 'photo',
              star: imageStar,
              linkImg: imageToRight,
              linlk: '#'
            },
            {
              id: '3',
              title: 'Minimal Living Area',
              breadcrumbs: 'Decor / Artchitecture',
              src: image6,
              alt: 'photo',
              star: imageStar,
              linkImg: imageToRight,
              linlk: '#'
            },
            {
              id: '4',
              title: 'Minimal Living Area',
              breadcrumbs: 'Decor / Artchitecture',
              src: image7,
              alt: 'photo',
              star: imageStar,
              linkImg: imageToRight,
              linlk: '#'
            },
            {
              id: '5',
              title: 'Minimal Living Area',
              breadcrumbs: 'Decor / Artchitecture',
              src: image8,
              alt: 'photo',
              star: imageStar,
              linkImg: imageToRight,
              linlk: '#'
            },
            {
              id: '6',
              title: 'Minimal Living Area',
              breadcrumbs: 'Decor / Artchitecture',
              src: image1,
              alt: 'photo',
              star: imageStar,
              linkImg: imageToRight,
              linlk: '#'
            },
            {
              id: '7',
              title: 'Minimal Living Area',
              breadcrumbs: 'Decor / Artchitecture',
              src: image2,
              alt: 'photo',
              star: imageStar,
              linkImg: imageToRight,
              linlk: '#'
            },
            {
              id: '8',
              title: 'Minimal Living Area',
              breadcrumbs: 'Decor / Artchitecture',
              src: image3,
              alt: 'photo',
              star: imageStar,
              linkImg: imageToRight,
              linlk: '#'
            }
          ]
        }

      ],

      buttons: [
        {
          id: 'bathroom',
          text: 'Bathroom'
        },
        {
          id: 'bedroom',
          text: 'Bedroom'
        },
        {
          id: 'kitchen',
          text: 'Kitchan'
        },
        {
          id: 'livingArea',
          text: 'Living Area'
        }
      ]
    }
  },

  mounted () {
  },

  methods: {
    // sortArticles (e) {
    //   console.log(e.target)
    //   if (document.querySelector('.blog-details__sidebar-button:active') !== null) {
    //     document.querySelector('.blog-details__sidebar-button:active').classList.remove('blog-details__sidebar-button')
    //   }
    //   const divButton = e.target.closest('.blog-details__sidebar-button:active')
    //   divButton.classList.add('blog-details__sidebar-button')
    // },
    filters (e) {
      this.sortedArray = this.articles.filter(article => article.id === e.target.dataset.id)
    }
  }
}
</script>

<style lang="scss" scoped>
</style>
