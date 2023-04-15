package ExceptionsAndErrors.Seminar_3.hw;

public class MyArrayDataException extends Exception {

    public int i;
    public int j;

    MyArrayDataException(int i, int j) {
        this.i = i;
        this.j = j;

    }

}
