package OOP.Seminars.seminar6.hw_seminar6.hw_task1;

// Затем создайте абстрактный класс Unlocker, который будет использоваться для хранения всех вариантов разблокировки.

public abstract class Unlocker {
    private UnlockMethod unlockMethod;

    public Unlocker(UnlockMethod unlockMethod) {
        this.unlockMethod = unlockMethod;
    }

    public void unlock() {
        unlockMethod.unlock();
    }
}
