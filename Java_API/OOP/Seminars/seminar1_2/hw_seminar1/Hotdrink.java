package OOP.Seminars.seminar1_2.hw_seminar1;

class Hotdrink extends Goods {
    private String name;
    private int volume;
    private int temperature;

    public String getName() {
        return name;
    }

    public int getVolume() {
        return volume;
    }

    public int getTemperature() {
        return temperature;
    }

    public Hotdrink(String name, int artikl, float price, int amount, int volume, int temperature) {
        super(name, artikl, price, amount);
        this.volume = volume;
        this.temperature = temperature;
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return super.toString() + " { volume=" + volume +
                ", temperature=" + temperature +
                '}';
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = super.hashCode();
        result = prime * result + volume;
        result = prime * result + temperature;
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (!super.equals(obj))
            return false;
        if (getClass() != obj.getClass())
            return false;
        Hotdrink other = (Hotdrink) obj;
        if (volume != other.volume)
            return false;
        if (temperature != other.temperature)
            return false;
        return true;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
    }

}
