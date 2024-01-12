    // Предположим, что у нас есть JSON-данные о расписании занятий
    const scheduleData = [
      {
        "name": "Йога",
        "time": "10:00",
        "maxParticipants": 15,
        "currentParticipants": 10
      },
      {
        "name": "Кроссфит",
        "time": "12:00",
        "maxParticipants": 20,
        "currentParticipants": 18
      }
      // Дополнительные данные о занятиях
    ];

    // Функция для отображения расписания занятий
    function displaySchedule(schedule) {
      const scheduleContainer = document.getElementById('schedule');
      scheduleContainer.innerHTML = '';
      schedule.forEach(item => {
        const card = document.createElement('div');
        card.classList.add('col-md-6', 'mb-4');

        const cardBody = document.createElement('div');
        cardBody.classList.add('card', 'p-3');

        const title = document.createElement('h3');
        title.textContent = item.name;

        const time = document.createElement('p');
        time.textContent = `Время: ${item.time}`;

        const participants = document.createElement('p');
        participants.textContent = `Участников: ${item.currentParticipants}/${item.maxParticipants}`;

        const buttonContainer = document.createElement('div');
        buttonContainer.classList.add('mt-3');

        const registerButton = document.createElement('button');
        registerButton.classList.add('btn', 'btn-primary', 'mr-2');
        registerButton.textContent = 'Записаться';
        if (item.currentParticipants === item.maxParticipants) {
          registerButton.disabled = true;
        }

        registerButton.addEventListener('click', () => {
          if (item.currentParticipants < item.maxParticipants) {
            item.currentParticipants++;
            participants.textContent = `Участников: ${item.currentParticipants}/${item.maxParticipants}`;
            if (item.currentParticipants === item.maxParticipants) {
              registerButton.disabled = true;
            }
            cancelRegisterButton.disabled = false;
          }
        });

        const cancelRegisterButton = document.createElement('button');
        cancelRegisterButton.classList.add('btn', 'btn-danger');
        cancelRegisterButton.textContent = 'Отменить запись';
        cancelRegisterButton.disabled = true;

        cancelRegisterButton.addEventListener('click', () => {
          if (item.currentParticipants > 0) {
            item.currentParticipants--;
            participants.textContent = `Участников: ${item.currentParticipants}/${item.maxParticipants}`;
            if (item.currentParticipants < item.maxParticipants) {
              registerButton.disabled = false;
            }
            if (item.currentParticipants === 0) {
              cancelRegisterButton.disabled = true;
            }
          }
        });

        buttonContainer.appendChild(registerButton);
        buttonContainer.appendChild(cancelRegisterButton);

        cardBody.appendChild(title);
        cardBody.appendChild(time);
        cardBody.appendChild(participants);
        cardBody.appendChild(buttonContainer);

        card.appendChild(cardBody);
        scheduleContainer.appendChild(card);
      });
    }

    // Отображаем расписание при загрузке страницы
    displaySchedule(scheduleData);