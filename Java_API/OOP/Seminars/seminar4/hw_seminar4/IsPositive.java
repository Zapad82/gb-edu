package OOP.Seminars.seminar4.hw_seminar4;

public class IsPositive implements IsGood<Integer> {

    @Override
    public boolean isGood(Integer item) {
        return item > 0;
    }
}
