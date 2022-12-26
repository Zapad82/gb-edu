package OOP.Seminars.seminar4.hw_seminar4;

// BeginsWith — в конструкторе запоминает строку. Ему дают строку, он проверяет, что она начинается с того, что он запомнил
public class BeginsWith implements IsGood<String> {

    private String elementsBeginner;

    public BeginsWith(String elementsBeginner) {
        this.elementsBeginner = elementsBeginner;
    }

    @Override
    public boolean isGood(String item) {
        return item.startsWith(elementsBeginner);
    }

}
