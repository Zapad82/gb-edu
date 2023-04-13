package ExceptionsAndErrors.Seminar_2.hw;

// Если необходимо, исправьте данный код 

//    public static void main(String[] args) throws Exception {
// try {
//     int a = 90;
//     int b = 3;
//     System.out.println(a / b);
//     printSum(23, 234);
//     int[] abc = { 1, 2 };
//     abc[3] = 9;
// } catch (Throwable ex) {
//     System.out.println("Что-то пошло не так...");
// } catch (NullPointerException ex) {
//     System.out.println("Указатель не может указывать на null!");
// } catch (IndexOutOfBoundsException ex) {
//     System.out.println("Массив выходит за пределы своего размера!");
// }
// public static void printSum(Integer a, Integer b) throws FileNotFoundException {
//     System.out.println(a + b);
// }

public class ext3_hw {

    public static void main(String[] args) {
        try {
            int a = 90;
            int b = 3;
            System.out.println(a / b);
            printSum(23, 234);
            int[] abc = { 1, 2 };
            abc[3] = 9; // изменен индекс элемента
        } catch (ArithmeticException ex) { // изменен тип исключения
            System.out.println("Ошибка в вычислениях: деление на ноль или переполнение");
        } // catch (FileNotFoundException ex) { // скрыто исключение
          // System.out.println("Файл не найден");}
        catch (ArrayIndexOutOfBoundsException ex) { // изменен тип исключения и исправлен индекс
            System.out.println("Выход за границы массива");
        } catch (Exception ex) { // добавлено общее исключение
            System.out.println("Что-то не так...");
        }
    }

    public static void printSum(Integer a, Integer b) {
        System.out.println(a + b);
    }
}
