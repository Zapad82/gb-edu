package OOP.Seminars.seminar6.hw_seminar6.hw_task1;

public class PinCodeUnlocker implements UnlockMethod {
    private int pin;

    public PinCodeUnlocker(int pin) {
        this.pin = pin;
    }

    @Override
    public void unlock() {
        System.out.println("Телефон разблокирован с помощью пин-кода");// Код разблокировки с пин-кодом
    }
}
