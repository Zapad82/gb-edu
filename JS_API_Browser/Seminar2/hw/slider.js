document.addEventListener("DOMContentLoaded", async function() {
    // Получаем необходимые элементы DOM
    const sliderImage = document.querySelector(".slider-image img");
    const prevButton = document.getElementById("prevBtn");
    const nextButton = document.getElementById("nextBtn");
    const dotsContainer = document.querySelector(".slider-dots");
  
    // Объект для хранения состояния слайдера
    const sliderState = {
      images: [],
      currentIndex: 0
    };
  
    // Функция для обновления отображаемого изображения
    const updateSlider = () => {
      sliderImage.src = sliderState.images[sliderState.currentIndex];
      updateDots();
    };
  
    // Функция для обновления точек навигации
    const updateDots = () => {
      dotsContainer.innerHTML = "";
      sliderState.images.forEach((image, index) => {
        const dot = document.createElement("span");
        dot.classList.add("dot");
        if (index === sliderState.currentIndex) {
          dot.classList.add("active");
        }
        dot.setAttribute("data-index", index);
        dotsContainer.appendChild(dot);
      });
    };
  
    // Функция для загрузки изображений
    const loadImages = async () => {
      try {
        // Загружаем HTML-контент страницы img
        const response = await fetch('img');
        const text = await response.text();
        const parser = new DOMParser();
        const htmlDoc = parser.parseFromString(text, 'text/html');
        // Получаем ссылки на изображения и фильтруем их
        const imageLinks = Array.from(htmlDoc.querySelectorAll('a')).map(a => a.href);
        sliderState.images = imageLinks.filter(link => link.match(/\.(jpeg|jpg|png|gif)$/i));
        updateSlider();
      } catch (error) {
        console.error('Ошибка при загрузке изображений', error);
      }
    };
  
    // Обработчики событий для кнопок навигации и точек
    prevButton.addEventListener("click", () => {
      sliderState.currentIndex = (sliderState.currentIndex - 1 + sliderState.images.length) % sliderState.images.length;
      updateSlider();
    });
  
    nextButton.addEventListener("click", () => {
      sliderState.currentIndex = (sliderState.currentIndex + 1) % sliderState.images.length;
      updateSlider();
    });
  
    dotsContainer.addEventListener("click", (event) => {
      if (event.target.classList.contains("dot")) {
        sliderState.currentIndex = parseInt(event.target.getAttribute("data-index"));
        updateSlider();
      }
    });
  
    // Загружаем изображения при загрузке страницы
    await loadImages();
  });
  