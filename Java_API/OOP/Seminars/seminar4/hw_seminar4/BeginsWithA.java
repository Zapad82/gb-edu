package OOP.Seminars.seminar4.hw_seminar4;
// • IsPositive — ему дают целое число, он одобряет его, если оно положительное

public class BeginsWithA implements IsGood<String> {

    @Override
    public boolean isGood(String item) {
        return item.startsWith("А");
    }

}
