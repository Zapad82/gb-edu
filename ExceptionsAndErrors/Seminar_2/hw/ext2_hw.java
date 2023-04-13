package ExceptionsAndErrors.Seminar_2.hw;

// Если необходимо, нужно исправить данный код

public class ext2_hw {
    public static void main(String[] args) {

        int[] intArray = {};

        try {
            int indexArray = 8;
            if (intArray.length < indexArray) {
                throw new ArrayIndexOutOfBoundsException("Указан индекс за пределам массива");
            }

            int d = 5;
            if (d == 0) {
                throw new ArithmeticException("На ноль делить нельзя!");
            }
            double catchedRes1 = intArray[indexArray] / d;
            System.out.println("catchedRes1 = " + catchedRes1);
        } catch (ArithmeticException e) {
            System.out.println("Catching exception: " + e);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Catching exception: " + e);
        }
    }
}
