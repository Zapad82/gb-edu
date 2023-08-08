/*
****** Задача необязательная для выполнения:

Это расширенная версия задачи с банком, которую мы решлали на семинаре:

Создайте класс "Банк", который будет иметь следующие свойства: название банка, список клиентов и список счетов. Класс должен иметь методы для добавления нового клиента, открытия нового счета для клиента, пополнения счета, снятия денег со счета и проверки баланса.

Пример работы:

const bank = new Bank("Мой Банк");

const client1 = new Client("Иван", 25);
const client2 = new Client("Мария", 30);

bank.addClient(client1);
bank.addClient(client2);

bank.openAccount(client1, 1000);
bank.openAccount(client2, 500);

bank.deposit(123456789, 200);
bank.withdraw(987654321, 100);
bank.checkBalance(123456789);
bank.checkBalance(987654321);
*/

class Bank {
    constructor(bankName) {
        this.bankName = bankName;
        this.clients = [];
        this.accounts = [];
    }

    // Метод `addClient()` добавляет нового клиента в банк. Он принимает имя клиента и добавляет его в список клиентов банка.
    addClient(clientName) {
        this.clients.push(clientName);
        this.accounts.push([]);
        console.log(`Клиент ${clientName} был добавлен в банк.`);
    }

    // Метод `openAccount()` открывает новый счет для клиента. Он принимает имя клиента и необязательный параметр `initialBalance`, который устанавливает начальный баланс счета. Метод генерирует случайный номер счета и добавляет новый объект счета с номером и начальным балансом в список счетов клиента.
    openAccount(clientName, initialBalance = 0) {
        const clientIndex = this.clients.indexOf(clientName);

        if (clientIndex !== -1) {
            const accountNumber = Math.floor(Math.random() * 1000000);
            this.accounts[clientIndex].push({
                accountNumber,
                balance: initialBalance
            });
            console.log(`Номер счёта ${accountNumber} был открыт для клиента ${clientName} с балансом ${initialBalance}.`);
        } else {
            console.log(`Клиент ${clientName} не найден в базе данных.`);
        }
    }

    // Метод `deposit()` позволяет пополнить счет клиента. Он принимает имя клиента, номер счета и сумму для пополнения. Метод находит соответствующий счет и увеличивает его баланс на сумму пополнения.
    deposit (clientName, accountNumber, amount) {
        const clientIndex = this.clients.indexOf(clientName);
        if (clientIndex !== -1) {
            const account = this.accounts[clientIndex].find(acc => acc.accountNumber === accountNumber);
            if(account) {
                account.balance += amount;
                console.log((`Сумма ${amount} была добавлена к счёту ${accountNumber}. Новый баланс ${account.balance}.`));
            } else {
                console.log(`Счёт с номером ${accountNumber} не был найден у клиента ${clientName}`);
            }
        } else {
            console.log(`Клиент ${clientName} не был найден`);
        };
    }

    // Метод `withdraw()` позволяет снять деньги со счета клиента. Он принимает имя клиента, номер счета и сумму для снятия. Метод проверяет наличие достаточного баланса на счете, и если сумма для снятия не превышает баланс, то уменьшает баланс на указанную сумму.
    withdraw (clientName, accountNumber, amount) {
        const clientIndex = this.clients.indexOf(clientName);

        if (clientIndex !== -1) {
            const account = this.accounts[clientIndex].find(acc => acc.accountNumber === accountNumber);
            if (account) {
                if (account.balance >= amount) {
                    account.balance -= amount;
                    console.log(`Сумма в размере ${amount} была списана со счёта ${accountNumber}. Новый баланс ${account.balance}`);
                } else {
                    console.log (`Недостаточно средств на счете с номером ${accountNumber}`);
                }
            } else {
                console.log(`Номер счёта ${accountNumber} не был найден у клиента ${accountNumber}`);
            }
        } else {
            console.log(`Клиент ${clientName} не был найден.`);
        }
    }

    // Метод `checkBalance()` позволяет проверить баланс счета клиента. Он выводит информацию о номере счета, клиенте и текущем балансе.
    checkBalance (clientName, accountNumber) {
        const clientIndex = this.clients.indexOf(clientName);
        if (clientIndex !== -1) {
            const account = this.accounts[clientIndex].find(acc => acc.accountNumber === accountNumber);
            if (account) {
                console.log(`Номер счёта: ${accountNumber}`);
                console.log(`Клиент: ${clientName}`);
                console.log(`Баланс: ${account.balance}`);
            } else {
                console.log(`Номер счёта ${accountNumber} у клиента ${clientName} не был найден.`);
            }
        } else {
            console.log(`Клиент ${clientName} не найден.`);
        }
    }
}


// const bank = new Bank("MyBank");

// // Добавляем клиент
// bank.addClient("John Doe");

// // Открываем новый счет для клиента
// bank.openAccount("John Doe", 1000);

// // Пополняем счет клиента
// bank.deposit("John Doe", 191142, 500);

// // Снимаем деньги со счета клиента
// bank.withdraw("John Doe", 123456, 200);

// // Проверяем баланс счета клиента
// bank.checkBalance("John Doe", 123456);

const bank = new Bank("Мой Банк");

const client1 = "Иван";
const client2 = "Мария";

bank.addClient(client1);
bank.addClient(client2);

bank.openAccount(client1, 1000);
bank.openAccount(client2, 500);

bank.deposit(123456789, 200);
bank.withdraw(987654321, 100);
bank.checkBalance(123456789);
bank.checkBalance(987654321);
// Проверяем баланс счета клиента
bank.checkBalance("Иван", 455);