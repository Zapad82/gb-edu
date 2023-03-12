package OOP.Seminars.seminar6.hw_seminar6.hw_task1;

public class FaceIDUnlocker implements UnlockMethod {
    private String faceID;

    public FaceIDUnlocker(String faceID) {
        this.faceID = faceID;
    }

    @Override
    public void unlock() {
        System.out.println("Произошла разблокировка телефона по лицу.");// Код разблокировки по распознаванию лица
    }
}
