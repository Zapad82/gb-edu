import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

// Выявите и реализуйте классы для следующей задачи. Пропишите необходимый минимум полей и методов. 
// Пока что оставьте методы пустыми.
// Торговый автомат содержит в себе набор товаров. 
// Покупатель вводит номер товара. Автомат высвечивает стоимость товара. 
// Покупатель его оплачивает. Из лотка выпадает заказанный товар.


public class Automat {
    private int money;

    
    public Automat() {
        Product water = new Product("Вода",10,15);
    Product eat = new Product("Плов",10,30);
    Product cake = new Product("Пирожок",10,30);
    Product limonFresh = new Product("Лимонад",10,20);
    this.automat.put(1,limonFresh);
    this.automat.put(2,eat);
    this.automat.put(3,water);
    this.automat.put(4,cake); 
    }

    Map <Integer, Product> automat = new TreeMap <>();
    

    public void showPrice(){
        System.out.println("Введите номер позиции ");
        Scanner sc = new Scanner(System.in);
        int position = sc.nextInt();
        Product product = automat.get(position);
        System.out.println("Цена товара" + product.getPrice());

    }


    @Override
    public String toString() {
        return "Automat ["+ automat + "]";
    }
    
}

    // public void choiceProduct (){//Sell

    // } 

    // public void moneyTransaction (){

    // }


