class Stopwatch {
    constructor() {
      this.startTime = null;
      this.pauseTime = null;
      this.totalPausedTime = 0;
      this.isRunning = false;
    }

    start() {
      if (!this.isRunning) {
        this.startTime = new Date();
        this.isRunning = true;
        document.getElementById("status").innerHTML = "Секундомер запущен";
      } else {
        document.getElementById("status").innerHTML = "Секундомер уже запущен";
      }
    }

    pause() {
      if (this.isRunning) {
        this.pauseTime = new Date();
        this.isRunning = false;
        document.getElementById("status").innerHTML = "Секундомер приостановлен";
      } else {
        document.getElementById("status").innerHTML = "Секундомер уже приостановлен";
      }
    }

    resume() {
      if (!this.isRunning && this.pauseTime) {
        const pauseDuration = new Date() - this.pauseTime;
        this.totalPausedTime += pauseDuration;
        this.startTime = new Date(this.startTime.getTime() + pauseDuration);
        this.pauseTime = null;
        this.isRunning = true;
        document.getElementById("status").innerHTML = "Секундомер возобновлен";
      } else {
        document.getElementById("status").innerHTML = "Секундомер не был приостановлен";
      }
    }

    stop() {
      if (this.isRunning) {
        const endTime = new Date();
        const totalTime = endTime - this.startTime - this.totalPausedTime;
        this.startTime = null;
        this.pauseTime = null;
        this.totalPausedTime = 0;
        this.isRunning = false;
        document.getElementById("status").innerHTML = `Секундомер остановлен. Прошло ${totalTime / 1000} секунд`;
      } else {
        document.getElementById("status").innerHTML = "Секундомер уже остановлен";
      }
    }
  }

  const stopwatch = new Stopwatch();

  function startStopwatch() {
    stopwatch.start();
  }

  function pauseStopwatch() {
    stopwatch.pause();
  }

  function resumeStopwatch() {
    stopwatch.resume();
  }

  function stopStopwatch() {
    stopwatch.stop();
  }

//   В данном коде создается класс Stopwatch, который имеет методы start, pause, resume и stop для управления секундомером. 
//   Методы pause и resume позволяют приостанавливать и возобновлять отсчет времени соответственно, 
//   а метод stop останавливает секундомер и выводит в консоль общее время, прошедшее с момента запуска.