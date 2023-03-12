import java.util.Arrays;
import java.util.HashSet;

public class lection6_071222_Client {

    public static void main(String[] args) {
        
        lection6_071222_Worker w1 = new lection6_071222_Worker();
        w1.firstName = "Имя_1";
        w1.lastName = "Фамилия_1";
        w1.salary = 100;
        w1.id = 1000;

        lection6_071222_Worker w4 = new lection6_071222_Worker();
        w4.firstName = "Имя_1";
        w4.lastName = "Фамилия_1";
        w4.salary = 100;
        w4.id = 1000;   
    
        lection6_071222_Worker w2 = new lection6_071222_Worker();
        w2.firstName = "Имя_2";
        w2.lastName = "Фамилия_2";
        w2.salary = 200;
        w2.id = 2000;

        lection6_071222_Worker w3 = new lection6_071222_Worker();
        w2.firstName = "Имя_3";
        w2.lastName = "Фамилия_3";
        w2.salary = 300;
        w2.id = 3000;


        System.out.println(w1 == w4);
        System.out.println(w1.equals(w4));
        var workers = new HashSet<lection6_071222_Worker>(Arrays.asList(w1, w2, w3));
        System.out.println(workers.contains(w4));

        System.out.println(w4);
        System.out.println(w1.toString());
    }
}