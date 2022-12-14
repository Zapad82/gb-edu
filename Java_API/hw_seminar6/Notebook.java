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
        return "?????? ????????????????: " + name +
                ", ?????????? ?????????????????????? ????????????: " + memory +
                "????, ?????????? ???????????????? ??????????: " + harddisk +
                "????, ???????????????????????? ??????????????: " + os +
                ", ??????????????????: " + processorsNotebooks +
                ", ????????: " + color +
                ", ????????:" + price +
                '$' + "\n";
    }

    public static ArrayList<String> filter() {
        TreeMap<Integer, String> filterParameter = new TreeMap<>();
        filterParameter.put(1, "?????????????????????????? ????????????????");
        filterParameter.put(2, "?????????????????????? ?????????? ?????????????????????? ????????????");
        filterParameter.put(3, "?????????????????????? ?????????? ???????????????????? ????????????");
        filterParameter.put(4, "???????????????????????? ??????????????");
        // filterParameter.put(5, "??????????????????");
        filterParameter.put(5, "????????");
        // filterParameter.put(7, "????????");

        ArrayList<String> userChoi??e = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        for (int i = 1; i <= filterParameter.size(); i++) {
            System.out
                    .println("?????????????? " + filterParameter.get(i) + " ?????? \"no\" ???????? ???????????????? ???? ???????????? ??????????????????????: ");
            userChoi??e.add(scanner.nextLine());
        }
        scanner.close();
        return userChoi??e;
    }

    public static HashSet<Notebook> filterNotebooks(ArrayList<String> userChoi??e, HashSet<Notebook> notebooks) {

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
            if (!userChoi??e.get(0).equals("no") && notebook.getName().equals(userChoi??e.get(0))) {
                nameNotebooks.add(notebook);
            }
            if (userChoi??e.get(0).equals("no")) {
                nameNotebooks.addAll(notebooks);
            }
        }
        for (Notebook notebook : notebooks) {
            if (!userChoi??e.get(1).equals("no") && notebook.getMemory() >= Integer.parseInt(userChoi??e.get(1))) {
                memoryNotebooks.add(notebook);
            }
            if (userChoi??e.get(1).equals("no")) {
                memoryNotebooks.addAll(notebooks);
            }
        }
        // for (Notebook notebook : notebooks) {
        // if (!userChoi??e.get(2).equals("no") && notebook.getMemory() >=
        // Integer.parseInt(userChoi??e.get(2))) {
        // memoryNotebooks.add(notebook);
        // }
        // if (userChoi??e.get(2).equals("no")) {
        // memoryNotebooks.addAll(notebooks);
        // }
        // }
        for (Notebook notebook : notebooks) {
            if (!userChoi??e.get(2).equals("no") && notebook.getHarddisk() >= Integer.parseInt(userChoi??e.get(2))) {
                harddiskNotebooks.add(notebook);
            }
            if (userChoi??e.get(2).equals("no")) {
                harddiskNotebooks.addAll(notebooks);
            }
        }
        for (Notebook notebook : notebooks) {
            if (!userChoi??e.get(3).equals("no") && notebook.getOs().equals(userChoi??e.get(3))) {
                osNotebooks.add(notebook);
            }
            if (userChoi??e.get(3).equals("no")) {
                osNotebooks.addAll(notebooks);
            }
        }
        // for (Notebook notebook : notebooks) {
        // if (!userChoi??e.get(4).equals("no") &&
        // notebook.getProcessorsNotebooks().equals(userChoi??e.get(4))) {
        // processorNotebooks.add(notebook);
        // }
        // if (userChoi??e.get(4).equals("no")) {
        // processorNotebooks.addAll(notebooks);
        // }
        // }
        for (Notebook notebook : notebooks) {
            if (!userChoi??e.get(4).equals("no") && notebook.getColor().equals(userChoi??e.get(4))) {
                colorNotebooks.add(notebook);
            }
            if (userChoi??e.get(4).equals("no")) {
                colorNotebooks.addAll(notebooks);
            }
        }
        // for (Notebook notebook : NotebookStore) {
        // if (!userChoi??e.get(7).equals("no") && notebook.getPrice() >=
        // Float.parseFloat(userChoi??e.get(7))) {
        // priceNotebooks.add(notebook);
        // }
        // if (userChoi??e.get(7).equals("no")) {
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
            System.out.println("?? ??????????????????, ?????????????????? ?? ???????????? ?????????????????????? ??????. ???????????????????? ???????????????? ???????????????? ????????????");
        }
        return tempNotebooks;
    }

}