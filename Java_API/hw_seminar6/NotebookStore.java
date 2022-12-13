// Подумать над структурой класса Ноутбук для магазина техники - выделить поля и методы. Реализовать в java.

// Создать множество ноутбуков.

// Написать метод, который будет запрашивать у пользователя критерий (или критерии) фильтрации и выведет ноутбуки, отвечающие фильтру. Критерии фильтрации можно хранить в Map. Например:

// “Введите цифру, соответствующую необходимому критерию:
// 1 - ОЗУ
// 2 - Объем ЖД
// 3 - Операционная система
// 4 - Цвет …

// Далее нужно запросить минимальные значения для указанных критериев - сохранить параметры фильтрации можно также в Map.

// Отфильтровать ноутбуки их первоначального множества и вывести проходящие по условиям.



package hw_seminar6;

import java.util.Scanner;

public class NotebookStore {
    private static Scanner input = new Scanner (System.in);
    public static void main(String[] args) {
        Notebooks asus512 = new Notebooks("Asus 512", 12, 512, "Windows 10", "white", 600.52f);
        asus512.addProcessorNotebook(new ProcessorNotebook("Intel Core I5", 32000));
        // System.out.println(asus512);

        Notebooks sony264 = new Notebooks("Sony 264", 4, 264, "Windows 10", "black", 200.10f);
        sony264.addProcessorNotebook(new ProcessorNotebook("Intel Core I3", 24000));
        // System.out.println(sony264);

        Notebooks htc512 = new Notebooks("HTC 512", 16, 512, "Windows 11", "black", 1200.99f);
        htc512.addProcessorNotebook(new ProcessorNotebook("Intel Core I9", 72000));
        // System.out.println(htc512);

        Notebooks hp = new Notebooks("HP 264", 4, 512, "Windows 11", "black", 550.99f);
        hp.addProcessorNotebook(new ProcessorNotebook("Intel Core I5", 48000));
        // System.out.println(hp);

        System.out.println("Хотите ли Вы искать ноутбук по объему ОЗУ? (y/n)");
        String userChoiceMemory = input.nextLine().toLowerCase().toString(); 
        if (userChoiceMemory == "y") {
            System.out.println("Сколько минимально памяти нужно?");
            int userChoiceMemorySize = input.nextInt();
            System.out.println(userChoiceMemorySize);
        }
        // else {
        //     continue;
        // }
        
        System.out.println("Вы хотите указать объем жёсткого диска? (y/n)");
        String userChoiceHarddisk = input.nextLine();
        if (userChoiceHarddisk == "y") {
            System.out.println("Какой минимальный объем жесткого диска должен быть?");
            String userChoiceHarddiskSize = input.nextLine();
            System.out.println(userChoiceHarddiskSize);
        }
        // else {
        //     continue;
        // }    
    }
}


