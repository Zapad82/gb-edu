// Создайте унаследованный класс ГорячийНапиток с дополнительным полем int температура.

// Создайте класс АвтоматГорячихНапитков, реализующий интерфейс ТорговыйАвтомат и реализуйте перегруженный метод getProduct(int name, int volume, int temperature), выдающий продукт, соответствующий имени, объему и температуре.

// В main проинициализируйте несколько ГорячихНапитков и АвтоматГорячихНапитков и позвольте покупателю купить товар.

package OOP.Seminars.seminar1_2;

public class Main {
    public static void main(String[] args) {
        VkusVillWenderMachin wenderMachin = new VkusVillWenderMachin();
        wenderMachin.addProduct(1, new Goods("Lays", 12345, 49, 20));
        wenderMachin.addProduct(2, new Goods("Cola", 11111, 299, 1));
        wenderMachin.addProduct(3, new Goods("Lipton", 22222, 99, 10));
        wenderMachin.addProduct(4, new Goods("Milka", 15643, 150, 5));
        HotDrinkWenderMaschine wenderMaschin = new HotDrinkWenderMaschine();
        wenderMachin.addProduct(5, new Hotdrink("Capuccino", 125350, 120, 60, 200, 80));
        wenderMachin.addProduct(6, new Hotdrink("Dark Coffee", 125890, 150, 60, 100, 90));
        wenderMachin.addProduct(7, new Hotdrink("Americano", 125891, 150, 60, 100, 90));
        wenderMachin.addProduct(8, new Hotdrink("Milk Coffee", 25660, 100, 60, 200, 80));

        int number = wenderMachin.enterNumber();
        Goods goods = wenderMachin.showGoods(number);
        wenderMachin.goodsBuy(goods);
    }
}
