package OOP.Seminars.seminar6.hw_seminar6.hw_task1;

// Затем создайте реализации интерфейса UnlockMethod для каждого из способов разблокировки.

public class NoPasswordUnlocker implements UnlockMethod {
    @Override
    public void unlock() {
        System.out.println("Телефон разблокирован методом без пароля.");// Код разблокировки без пароля
    }
}
