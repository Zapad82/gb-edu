package hw_seminar6;

import java.util.*;

public class Notebook {

    private String name;
    private int memory;
    private int harddisk;
    private String os;
    private String processorsNotebooks;
    private String color;
    private Float price;

    public Notebook(String name, int memory, int harddisk, String os, String processorsNotebooks, String color,
            Float price) {
        this.name = name;
        this.memory = memory;
        this.harddisk = harddisk;
        this.os = os;
        this.processorsNotebooks = processorsNotebooks;
        this.color = color;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public int getMemory() {
        return memory;
    }

    public int getHarddisk() {
        return harddisk;
    }

    public String getOs() {
        return os;
    }

    public String getProcessorsNotebooks() {
        return processorsNotebooks;
    }

    public String getColor() {
        return color;
    }

    public Float getPrice() {
        return price;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((name == null) ? 0 : name.hashCode());
        result = prime * result + memory;
        result = prime * result + harddisk;
        result = prime * result + ((os == null) ? 0 : os.hashCode());
        result = prime * result + ((processorsNotebooks == null) ? 0 : processorsNotebooks.hashCode());
        result = prime * result + ((color == null) ? 0 : color.hashCode());
        result = prime * result + ((price == null) ? 0 : price.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Notebook other = (Notebook) obj;
        if (name == null) {
            if (other.name != null)
                return false;
        } else if (!name.equals(other.name))
            return false;
        if (memory != other.memory)
            return false;
        if (harddisk != other.harddisk)
            return false;
        if (os == null) {
            if (other.os != null)
                return false;
        } else if (!os.equals(other.os))
            return false;
        if (processorsNotebooks == null) {
            if (other.processorsNotebooks != null)
                return false;
        } else if (!processorsNotebooks.equals(other.processorsNotebooks))
            return false;
        if (color == null) {
            if (other.color != null)
                return false;
        } else if (!color.equals(other.color))
            return false;
        if (price == null) {
            if (other.price != null)
                return false;
        } else if (!price.equals(other.price))
            return false;
        return true;
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return "Вам подойдёт: " + name +
                ", Объем оперативной памяти: " + memory +
                "Гб, Объем жесткого диска: " + harddisk +
                "Гб, Операционная система: " + os +
                ", Процессор: " + processorsNotebooks +
                ", Цвет: " + color +
                ", Цена:" + price +
                '$' + "\n";
    }

    public static ArrayList<String> filter() {
        TreeMap<Integer, String> filterParameter = new TreeMap<>();
        filterParameter.put(1, "производителя ноутбука");
        filterParameter.put(2, "минимальный объем оперативной памяти");
        filterParameter.put(3, "минимальный объем встроенной памяти");
        filterParameter.put(4, "операционную систему");
        // filterParameter.put(5, "процессор");
        filterParameter.put(5, "цвет");
        // filterParameter.put(7, "цену");

        ArrayList<String> userChoiсe = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        for (int i = 1; i <= filterParameter.size(); i++) {
            System.out
                    .println("Укажите " + filterParameter.get(i) + " или \"no\" если параметр не должен учитываться: ");
            userChoiсe.add(scanner.nextLine());
        }
        scanner.close();
        return userChoiсe;
    }

    public static HashSet<Notebook> filterNotebooks(ArrayList<String> userChoiсe, HashSet<Notebook> notebooks) {

        HashSet<Notebook> tempNotebooks = new HashSet<>();
        tempNotebooks.addAll(notebooks);
        HashSet<Notebook> nameNotebooks = new HashSet<>();
        HashSet<Notebook> memoryNotebooks = new HashSet<>();
        HashSet<Notebook> harddiskNotebooks = new HashSet<>();
        HashSet<Notebook> osNotebooks = new HashSet<>();
        // HashSet<Notebook> processorNotebooks = new HashSet<>();
        HashSet<Notebook> colorNotebooks = new HashSet<>();
        // HashSet<Notebook> priceNotebooks = new HashSet<>();

        for (Notebook notebook : notebooks) {
            if (!userChoiсe.get(0).equals("no") && notebook.getName().equals(userChoiсe.get(0))) {
                nameNotebooks.add(notebook);
            }
            if (userChoiсe.get(0).equals("no")) {
                nameNotebooks.addAll(notebooks);
            }
        }
        for (Notebook notebook : notebooks) {
            if (!userChoiсe.get(1).equals("no") && notebook.getMemory() >= Integer.parseInt(userChoiсe.get(1))) {
                memoryNotebooks.add(notebook);
            }
            if (userChoiсe.get(1).equals("no")) {
                memoryNotebooks.addAll(notebooks);
            }
        }
        // for (Notebook notebook : notebooks) {
        // if (!userChoiсe.get(2).equals("no") && notebook.getMemory() >=
        // Integer.parseInt(userChoiсe.get(2))) {
        // memoryNotebooks.add(notebook);
        // }
        // if (userChoiсe.get(2).equals("no")) {
        // memoryNotebooks.addAll(notebooks);
        // }
        // }
        for (Notebook notebook : notebooks) {
            if (!userChoiсe.get(2).equals("no") && notebook.getHarddisk() >= Integer.parseInt(userChoiсe.get(2))) {
                harddiskNotebooks.add(notebook);
            }
            if (userChoiсe.get(2).equals("no")) {
                harddiskNotebooks.addAll(notebooks);
            }
        }
        for (Notebook notebook : notebooks) {
            if (!userChoiсe.get(3).equals("no") && notebook.getOs().equals(userChoiсe.get(3))) {
                osNotebooks.add(notebook);
            }
            if (userChoiсe.get(3).equals("no")) {
                osNotebooks.addAll(notebooks);
            }
        }
        // for (Notebook notebook : notebooks) {
        // if (!userChoiсe.get(4).equals("no") &&
        // notebook.getProcessorsNotebooks().equals(userChoiсe.get(4))) {
        // processorNotebooks.add(notebook);
        // }
        // if (userChoiсe.get(4).equals("no")) {
        // processorNotebooks.addAll(notebooks);
        // }
        // }
        for (Notebook notebook : notebooks) {
            if (!userChoiсe.get(4).equals("no") && notebook.getColor().equals(userChoiсe.get(4))) {
                colorNotebooks.add(notebook);
            }
            if (userChoiсe.get(4).equals("no")) {
                colorNotebooks.addAll(notebooks);
            }
        }
        // for (Notebook notebook : NotebookStore) {
        // if (!userChoiсe.get(7).equals("no") && notebook.getPrice() >=
        // Float.parseFloat(userChoiсe.get(7))) {
        // priceNotebooks.add(notebook);
        // }
        // if (userChoiсe.get(7).equals("no")) {
        // priceNotebooks.addAll(notebooks);
        // }
        // }
        tempNotebooks.retainAll(nameNotebooks);
        tempNotebooks.retainAll(memoryNotebooks);
        tempNotebooks.retainAll(harddiskNotebooks);
        tempNotebooks.retainAll(osNotebooks);
        // tempNotebooks.retainAll(processorNotebooks);
        tempNotebooks.retainAll(colorNotebooks);
        // tempNotebooks.retainAll(priceNotebooks);

        if (tempNotebooks.size() == 0) {
            System.out.println("К сожалению, ноутбуков с такими параметрами нет. Попробуйте изменить критерии поиска");
        }
        return tempNotebooks;
    }

}