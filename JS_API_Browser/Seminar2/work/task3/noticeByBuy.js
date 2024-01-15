const buyButton = document.getElementById('buy-button');

buyButton.addEventListener('click', (event) => {
    if (event.isTrusted) {
        const originalText = buyButton.textContent;
        buyButton.textContent = 'Товар добавлен в корзину';
        setTimeout(() => {
            buyButton.textContent = originalText;
        }, 2000);
    }
});