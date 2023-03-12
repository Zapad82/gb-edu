import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.io.IOException;
import java.util.logging.*;


// Дано четное число N (>0) и символы c1 и c2. // Написать метод, который вернет строку длины N, которая состоит из чередующихся символов c1 и c2, начиная с c1. 
public class seminar2_251122 { public static void main(String[] args) { 
    System.out.println(alternatingCharacters(9, 'A', '_')); 
} 
private static String alternatingCharacters (int length, char c1, char c2) { 
    StringBuilder builder = new StringBuilder(); 
    for (int i = 0; i < length; i++) if (i % 2 == 0) builder.append(c1); 
    else builder.append(c2); return builder.toString(); 
    } 
} 


// Напишите метод, который сжимает строку. 
// Пример: aaaabbbcdd → a4b3cd2

class seminar2Task2 {
    public static void main(String[] args) {
        String str = "aaaabbbcdd";
        System.out.println(compress(str));
        }
        
        private static String compress(String str){
        int count = 1;
        StringBuilder builder = new StringBuilder();
        for (int i = 1; i < str.length(); i++) {
        if (str.charAt(i) == str.charAt(i - 1)) {
        count++;
        } else {
        
        builder.append(Character.toString(str.charAt(i - 1)) + count);
        count = 1;
        }
        
        }
        builder.append(Character.toString(str.charAt(str.length() - 1)) + count);
        return builder.toString();
        } 
}



//Напишите метод, который принимает на вход строку (String) и определяет является ли строка палиндромом (возвращает boolean значение).

class polindrom {
    public static void main(String[] args) {
        Scanner wordScanner = new Scanner(System.in);
        System.out.printf("Введите слово: ");
        String word = wordScanner.next();
        System.out.println(isPalindrome(word));
    }

    private static boolean isPalindrome(String word) {
        for (int i = 0; i < word.length()/2; i++) {
            if (word.charAt(i) != word.charAt(word.length()-1-i)){
                return false;
            }
        }
        return true;
    }
}


// Напишите метод, который составит строку, состоящую из 100 повторений слова TEST и метод, который запишет эту строку в простой текстовый файл, обработайте исключения.

class multiply {
    public static void main(String[] args) {
        System.out.println(multiplyString("TEST"));
        writeFile(multiplyString("TEST"));
    }
    private static String multiplyString( String str){
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < 100; i++){
            builder.append(str);
        }
        return builder.toString();
    }

    private static void writeFile(String str){
        try(FileWriter writer = new FileWriter("notes3.txt", false))
        {
           // запись всей строки
           
            writer.write(str);

            writer.flush();
        }
        catch(IOException ex){
             
            System.out.println(ex.getMessage());
        }
    }
}


// Напишите метод, который вернет содержимое текущей папки в виде массива строк. 
// Напишите метод, который запишет массив, возвращенный предыдущим методом в файл. 
// Обработайте ошибки с помощью try-catch конструкции. В случае возникновения исключения, оно должно записаться в лог-файл.
class filesPathReader {
    public static void main(String[] args) throws SecurityException, IOException {
        String[] fileList = dirList("./");
        Logger logger = Logger.getLogger(lection2_241122.class.getName());
        try {
            writeFile(fileList);
        }
        catch (IOException ex){
            logger.log(Level.SEVERE, "Error", ex);
            FileHandler fh = new FileHandler("logger2.txt");
        }
        catch (NullPointerException npe){
            logger.log(Level.SEVERE, "Error", npe); 
            FileHandler fh = new FileHandler("logger2.txt");          
        }

    }
    private static String[] dirList(String dir) {
        File file = new File(dir);
        String[] fileList = file.list();

        return fileList;
    }
    private static void writeFile(String[] str) throws IOException {
        try(FileWriter writer = new FileWriter("filesList.txt", false)) {
           // запись всей строки
            for (int i=0; i <str.length; i++)
            writer.write(str[i] + "\n");
            writer.flush();
        } 
        catch(IOException ex){
            System.out.println(ex.getMessage());
        }
        catch(NullPointerException ex){
            System.out.println(ex.getMessage());
        }
    }

}
