package OOP.Seminars.seminar6.hw_seminar6.hw_task1;

public class FingerPrintUnlocker implements UnlockMethod {
    private String fingerprint;

    public FingerPrintUnlocker(String fingerprint) {
        this.fingerprint = fingerprint;
    }

    @Override
    public void unlock() {
        System.out.println("Телефон разблокирован с помощью отпечатка пальца.");// Код разблокировки по отпечатку пальца
    }
}
