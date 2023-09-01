<template>
    <div class="book-list">
      <h2>Список книг</h2>
      <Book v-for="book in books" :key="book.id" :book="book" />
    </div>
  </template>
  
  <script>
  import Book from './Book.vue';
  
  export default {
    components: {
      Book
    },
    props: {
      books: {
        type: Array,
        required: true
      }
    }
  }
  </script>