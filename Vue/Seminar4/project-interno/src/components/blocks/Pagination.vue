<template>
    <div class="pagination">
        <ul class="pagination__box">
            <a href="#" class="pagination__item pagination__item_active">01</a>
            <a href="#" class="pagination__item">02</a>
            <a href="#" class="pagination__item">03</a>
            <a href="#" class="pagination__item">
                <svg class="pagination__image" width="9" height="16" viewBox="0 0 9 16" fill="none"
                    xmlns="http://www.w3.org/2000/svg">
                    <path d="M1.55714 15L7.5 8.31429L1.55714 1.62857" stroke="#292F36" stroke-width="2"
                        stroke-linecap="round" stroke-linejoin="round" />
                </svg>
            </a>
        </ul>
    </div>
</template>

<script>
export default {
    name: 'Pagination'
}
</script>