document.addEventListener('DOMContentLoaded', function() {
    const openModalBtn = document.querySelector('.open-modal-btn');
    const closeModalBtn = document.querySelector('.close-modal-btn');
    const modal = document.getElementById('modal');

    openModalBtn.addEventListener('click', function() {
        modal.style.display = 'flex';
        setTimeout(function() {
            modal.style.opacity = '1';
        }, 100);
    });

    closeModalBtn.addEventListener('click', function() {
        modal.style.opacity = '0';
        setTimeout(function() {
            modal.style.display = 'none';
        }, 500);
    });
});
