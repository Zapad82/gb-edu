<template>
  <div class="book">
    <h3>{{ book.title }}</h3>
    <p>Автор: {{ book.author }}</p>
    <p>Год издания: {{ book.year }}</p>
    <button @click="toggleDetails">{{ showDetails ? 'Скрыть подробности' : 'Показать подробности' }}</button>
    <div v-if="showDetails">
      <p v-if="book.description">Описание: {{ book.description }}</p>
      <p v-if="book.publisher">Издательство: {{ book.publisher }}</p>
      <!-- добавьте здесь любую другую информацию о книге, которую хотите отобразить -->
    </div>
  </div>
</template>

<script>
export default {
  props: {
    book: {
      type: Object,
      required: true
    }
  },
  data() {
    return {
      showDetails: false
    }
  },
  methods: {
    toggleDetails() {
      this.showDetails = !this.showDetails;
    }
  }
}
</script>


<style lang="scss" scoped>

</style>
