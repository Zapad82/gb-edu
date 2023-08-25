<template>
    <div>
        <div class="calc">
            <input type="text">
            <button v-for="num in nums" :key="num.id">
                 {{  num  }}
            </button>
        </div>
    </div>
</template>

<script>
export default {
    name: 'CalcComponent',

    data() {
        return {
            nums: [1, 2, 3, 4, 5, 6, 7, 8, 9, 0]
        };
    },

    mounted() {
        
    },

    methods: {
        
    },
};
</script>

<style lang="scss" scoped>

</style>