import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

import Fabric.ClothesGenerator;
import Fabric.FlowersGenerator;
import Fabric.GemGenerator;
import Fabric.GoldGenerator;
import Fabric.ItemGenerator;
import Fabric.SilverGenerator;
import Fabric.WaterGenerator;
import Fabric.MoneyGenerator;
import Fabric.ShoesGenerator;

public class App {
    /**
     * @param args
     * @throws Exception
     */
    public static void main(String[] args) throws Exception {
        ItemGenerator f1 = new GoldGenerator();
        f1.openReward();

        List<ItemGenerator> generators = new ArrayList<>();


        for (int i = 0; i < 10; i++) {
            generators.add(new GoldGenerator());
        }
        for (int i = 0; i < 5; i++) {
            generators.add(new GemGenerator());
        }
        for (int i = 0; i < 20; i++) {
            generators.add(new SilverGenerator());
        }
        for (int i = 0; i < 50; i++) {
            generators.add(new WaterGenerator());
        }
        for (int i = 0; i < 30; i++) {
            generators.add(new MoneyGenerator());
        }
        for (int i = 0; i < 30; i++) {
            generators.add(new FlowersGenerator());
        }
        for (int i = 0; i < 30; i++) {
            generators.add(new ClothesGenerator());
        }
        for (int i = 0; i < 20; i++) {
            generators.add(new ShoesGenerator());
        }

        Random random = ThreadLocalRandom.current();
        for (int i = 0; i < 10; i++) {
            int index = random.nextInt(195);
            generators.get(index).openReward();
        }

    }
}