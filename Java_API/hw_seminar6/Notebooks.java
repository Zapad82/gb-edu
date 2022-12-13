package hw_seminar6;

import java.util.ArrayList;
import java.util.List;

public class Notebooks {

    private String name;
    private Integer memory;
    private Integer harddisk;
    private String os;
    private List<ProcessorNotebook> processorsNotebooks;
    private String color;
    private Float price;
    public Notebooks(String name, Integer memory, Integer harddisk, String os, String color, Float price) {
        this.name = name;
        this.memory = memory;
        this.harddisk = harddisk;
        this.os = os;
        this.processorsNotebooks = new ArrayList<>();
        this.color = color;
        this.price = price;
    }
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((name == null) ? 0 : name.hashCode());
        result = prime * result + ((memory == null) ? 0 : memory.hashCode());
        result = prime * result + ((harddisk == null) ? 0 : harddisk.hashCode());
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
        Notebooks other = (Notebooks) obj;
        if (name == null) {
            if (other.name != null)
                return false;
        } else if (!name.equals(other.name))
            return false;
        if (memory == null) {
            if (other.memory != null)
                return false;
        } else if (!memory.equals(other.memory))
            return false;
        if (harddisk == null) {
            if (other.harddisk != null)
                return false;
        } else if (!harddisk.equals(other.harddisk))
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

    // public String getName() {
    //     return name;
    // }
    // public Integer getMemory() {
    //     return memory;
    // }
    // public Integer getHarddisk() {
    //     return harddisk;
    // }
    // public String getOs() {
    //     return os;
    // }
    // public List<ProcessorNotebook> getProcessorsNotebooks() {
    //     return processorsNotebooks;
    // }
    // public String getColor() {
    //     return color;
    // }
    // public Float getPrice() {
    //     return price;
    // }
    @Override
    public String toString() {
        return "Notebooks [name=" + name + ", memory=" + memory + " Гб, harddisk=" + harddisk + " Гб, os=" + os
                + ", processorsNotebooks=" + processorsNotebooks + ", color=" + color + ", price=" + price + "$]";
    }
    public void addProcessorNotebook(ProcessorNotebook pN) {
        processorsNotebooks.add(pN);
    }
    
    





    
}
