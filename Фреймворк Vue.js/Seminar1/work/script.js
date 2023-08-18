new Vue({
    el: '#app',
    data: {
      cartCounter: 0,
      items: [
        { id: 1, label: 'Купить' },
        { id: 2, label: 'Купить' },
        { id: 3, label: 'Купить' },
        { id: 4, label: 'Купить' }
      ]
    },
    methods: {
      addToCart(item) {
        if (item.label !== 'Товар в корзине') {
          this.cartCounter += 1;
          item.label = 'Товар в корзине';
        }
      }
    }
  });