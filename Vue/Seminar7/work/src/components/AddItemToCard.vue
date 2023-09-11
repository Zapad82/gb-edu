<template>
    <div>
      <h2>Список товаров</h2>
      <ul>
        <li v-for="item in items" :key="item.id">
          {{ item.name }} - {{ item.price }} руб.
          <button @click="addToCart(item)">Добавить в корзину</button>
        </li>
      </ul>
      <h2>Корзина покупок</h2>
      <ul>
        <li v-for="item in cartItems" :key="item.id">
          {{ item.name }} - {{ item.price }} руб. x {{ item.quantity }}
        </li>
      </ul>
      <p>Общее количество товаров: {{ totalItems }}</p>
      <p>Общая стоимость: {{ totalPrice }} руб.</p>
    </div>
  </template>
  
  <script>
  export default {
    computed: {
      items() {
        // Здесь должен быть список товаров
        return [
          { id: 1, name: 'Товар 1', price: 100 },
          { id: 2, name: 'Товар 2', price: 200 },
          { id: 3, name: 'Товар 3', price: 300 }
        ];
      },
      cartItems() {
        return this.$store.getters.cartItems;
      },
      totalItems() {
        return this.$store.getters.totalItems;
      },
      totalPrice() {
        return this.$store.getters.totalPrice;
      }
    },
    methods: {
      addToCart(item) {
        this.$store.dispatch('addToCart', item);
      }
    }
  };
  </script>