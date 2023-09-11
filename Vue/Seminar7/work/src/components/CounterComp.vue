<template>
    <div>
        <p> {{ counter }}</p>
        <button @click="increase">+</button>
        <button @click="decrease">-</button>
    </div>
</template>

<script>
export default {
    name: 'CounterComp',

    computed: {
        counter () {
            return this.$store.state.count
        }
    },

    data () {
        return {
            
        }
    },

    mounted () {
        increase () {
            this.$store.commit('increment')
        },
        decrease () {
            this.$store.commit('decrement')
        }
    },

    methods: {
        
    }
}
</script>

<style lang="scss" scoped>

</style>