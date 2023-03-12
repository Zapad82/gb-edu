package OOP.Seminars.seminar6.hw_seminar6.hw_task1;

public class Main {
    // Теперь при создании экземпляра Unlocker можно передать ему требуемый
    // метод разблокировки.
    // Это позволит нам легко добавлять новые способы разблокировки без изменения
    // уже имеющихся классов.

    // public static void main(String[] args) {
    // Unlocker noPasswordUnlocker = new Unlocker(new NoPasswordUnlocker());
    // //Unlocker pinCodeUnlocker = new Unlocker(new PinCodeUnlocker(1234));
    // Unlocker fingerprintUnlocker = new Unlocker(new
    // FingerprintUnlocker("1234567890"));
    // Unlocker faceIDUnlocker = new Unlocker(new FaceIDUnlocker("abcdefghij"));

    // noPasswordUnlocker.unlock();
    // //pinCodeUnlocker.unlock();
    // fingerprintUnlocker.unlock();
    // faceIDUnlocker.unlock();
    // }
    public static void main(String[] args) {

        UnlockMethod[] unlockMethods = { new FaceIDUnlocker(null), new PinCodeUnlocker(0),
                new FingerPrintUnlocker(null), new NoPasswordUnlocker() };

        for (UnlockMethod unlockMethod : unlockMethods) {
            new Phone(unlockMethod).getPhoneUnlocker().unlock();
            System.out.println("******************************");
        }
    }
}
