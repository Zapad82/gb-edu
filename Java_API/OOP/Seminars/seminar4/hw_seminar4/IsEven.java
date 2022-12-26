package OOP.Seminars.seminar4.hw_seminar4;

/*
• IsEven — ему дают целое число, он одобряет его, если оно чётное
 */
public class IsEven implements IsGood<Integer> {

    @Override
    public boolean isGood(Integer item) {
        // TODO Auto-generated method stub
        return item % 2 == 0;
    }

}
