let pass;
let count = 0;
do {
    pass = Number(prompt('Enter password:'));
    count++;
    if (count >= 3) {
        alert('Wrong password!')
    }
} while (pass !== 234);