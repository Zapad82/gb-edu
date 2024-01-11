// Определение текущего размера окна браузера:
// Напишите функцию, которая будет выводить текущую ширину и высоту окна браузера при его изменении.

function printWindowDimensions() {
    console.log("Ширина окна: " + window.innerWidth);
    console.log("Высота окна: " + window.innerHeight);
  }
  
  window.addEventListener("resize", printWindowDimensions);