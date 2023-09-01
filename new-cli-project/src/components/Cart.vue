<template>
  <div>
    <h1>Корзина товаров</h1>
    <div v-for="(item, index) in cartItems" :key="index" class="item-container">
      <div class="item">
        <span>{{ item.name }}</span>
        <span>{{ item.price }} руб.</span>
      </div>
      <div>
        <input type="number" v-model="item.quantity" min="1" @change="updateCartItem(item)" />
        <span>Итого: {{ item.total }} руб.</span>
      </div>
      <button @click="removeItem(index)">Удалить</button>
    </div>
    <div>
      <h3>Общая сумма покупки: {{ totalPrice }} руб.</h3>
    </div>
  </div>
</template>

<script>
export default {
  name: "Cart",
  data() {
    return {
      cartItems: [
        { name: 'Товар 1', price: 100, quantity: 1, total: 100 },
        { name: 'Товар 2', price: 200, quantity: 1, total: 200 },
        { name: 'Товар 3', price: 300, quantity: 1, total: 300 },
      ]
    }
  },
  computed: {
    totalPrice() {
      return this.cartItems.reduce((total, item) => total + item.total, 0);
    }
  },
  methods: {
    updateCartItem(item) {
      item.total = item.price * item.quantity;
    },
    removeItem(index) {
      this.cartItems.splice(index, 1);
    }
  }
}
</script>

<style lang="scss" scoped>

</style>
