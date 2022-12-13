package hw_seminar6;

public class ProcessorNotebook {
    private String processorNname;
    private Integer power;
    
    public ProcessorNotebook(String processorNname, Integer power) {
        this.processorNname = processorNname;
        this.power = power;
    }

    public String getProcessorNname() {
        return processorNname;
    }

    public Integer getPower() {
        return power;
    }

    @Override
    public String toString() {
        return "[processorNname=" + processorNname + ", power=" + power + "мГц]";
    }

    



}

