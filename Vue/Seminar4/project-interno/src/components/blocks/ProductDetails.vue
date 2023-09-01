<template>
  <div>
    <h2>{{ product.name }}</h2>
    <p>{{ formattedPrice }}</p>
    <p>{{ availability }}</p>
  </div>
</template>

<script>
export default {
  name: 'ProductDetails',
  data () {
    return {
      product: {
        name: 'Product Name',
        price: 99.99,
        available: false
      }
    }
  },
  computed: {
    formattedPrice () {
      return '$' + this.product.price.toFixed(2)
    },
    availability () {
      if (this.product.available) {
        return 'Available'
      } else {
        return 'Out of stock'
      }
    }
  }
}
</script>
