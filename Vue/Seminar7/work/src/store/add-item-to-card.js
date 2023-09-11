const store = new Vuex.Store({
    state: {
      cartItems: []
    },
    mutations: {
      ADD_ITEM_TO_CART(state, item) {
        const find = state.cartItem.find((currentItem):boolean => currentItem.id === item.id);
        state.cartItems.push(item);

        if(find) {
            find.
        }
      }
    },
    getters: {
      cartItems(state) {
        return state.cartItems;
      },
      totalItems(state) {
        let total = 0;
        state.cartItems.forEach(item => {
          total += item.quantity;
        });
        return total;
      },
      totalPrice(state) {
        let total = 0;
        state.cartItems.forEach(item => {
          total += item.price * item.quantity;
        });
        return total;
      }
    },
    actions: {
      addToCart({ commit }, item) {
        commit('ADD_ITEM_TO_CART', item);
      }
    }
  })