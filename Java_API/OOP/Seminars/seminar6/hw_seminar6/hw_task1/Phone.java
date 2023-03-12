package OOP.Seminars.seminar6.hw_seminar6.hw_task1;

public class Phone {
    private UnlockMethod unlockMethod;

    public Phone(UnlockMethod unlockMethod) {
        System.out.println("Разблокировка телефона:");
        this.unlockMethod = unlockMethod;
    }

    public UnlockMethod getPhoneUnlocker() {
        return unlockMethod;
    }
}
