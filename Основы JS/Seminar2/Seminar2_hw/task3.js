function getRandomIntInclusive(min, max) {
    min = Math.ceil(min);
    max = Math.floor(max);
    return Math.floor(Math.random() * (max - min + 1)) + min; //Максимум и минимум включаются
  }

let day = getRandomIntInclusive(1, 31);
console.log(`Рандом всемогущий показал число ${day}`)
console.log((day <= 10) ? `Это первая декада месяца`
            : (day > 10 & day <= 20) ? `Это вторая декада месяца`
            : `Это третья декада месяца`);
            