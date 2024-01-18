const photoContainer = document.getElementById('photo-container');
let page = 1;

async function fetchPhotos() {
    try {
        const response = await fetch(`https://api.unsplash.com/photos?page=${page}&per_page=9&client_id=PUBLIC_KEY`);
        const photos = await response.json();
        return photos;
    } catch (error) {
        console.error('Ошибка при загрузке фотографий:', error);
        return [];
    }
}

async function loadMorePhotos() {
    page++;
    const photos = await fetchPhotos();
    photos.forEach(photo => {
        const photoElement = document.createElement('div');
        photoElement.classList.add('photo');
        const img = document.createElement('img');
        img.src = photo.urls.regular;
        photoElement.appendChild(img);
        photoContainer.appendChild(photoElement);
    });
    page++;
}

window.addEventListener('scroll', () => {
    if (`window.innerHeight + window.scrollY >= document.body.offsetHeight`) {
        loadMorePhotos();
    }
});

// Загрузка первой партии фотографий при загрузке страницы
loadMorePhotos();
