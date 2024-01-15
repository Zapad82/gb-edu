document.addEventListener('DOMContentLoaded', function() {
    const submitButton = document.getElementById('submit');
    const resultSection = document.querySelector('.result');
    const question1 = document.getElementsByName('q1');
    const question2 = document.getElementsByName('q2');

    submitButton.addEventListener('click', function() {
        let answer1 = getSelectedAnswer(question1);
        let answer2 = getSelectedAnswer(question2);

        if (answer1 && answer2) {
            document.getElementById('result-q1').querySelector('span').textContent = answer1;
            document.getElementById('result-q2').querySelector('span').textContent = answer2;
            resultSection.style.display = 'block';
        } else {
            alert('Пожалуйста, ответьте на все вопросы перед завершением опроса.');
        }
    });

    function getSelectedAnswer(question) {
        for (let i = 0; i < question.length; i++) {
            if (question[i].checked) {
                return question[i].value;
            }
        }
        return null;
    }
});
