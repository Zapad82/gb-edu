<template>
  <div id="app">
    <PaymentsDisplay :items="paymentList" />
    <AddList @AddNewPay="AddNewPay"/>
</div>
</template>

<script>
import AddList from './components/AddList.vue';
import PaymentsDisplay from './components/PaymentsDisplay.vue';


export default {
  name: 'App',
  components: {
    PaymentsDisplay,
    AddList
},

  data() {
    return {
      paymentList: [],
    };
  },

  methods: {
    fetchData() {
      return [
        {
          date: '12.03.2023',
          category: 'Food',
          value: 145,
        },
        {
          date: '19.03.2023',
          category: 'Transport',
          value: 455,
        },
        {
          date: '23.03.2023',
          category: 'Food',
          value: 777,
        },
      ]
    },
    AddNewPay(data) {
      this.paymentList.push(data)
    }
  },

  created() {
    this.paymentList = this.fetchData();
  }

}
</script>

<style lang="scss">
#app {
  font-family: Avenir, Helvetica, Arial, sans-serif;
  -webkit-font-smoothing: antialiased;
  -moz-osx-font-smoothing: grayscale;
  text-align: center;
  color: #2c3e50;
  margin-top: 60px;
}
</style>
