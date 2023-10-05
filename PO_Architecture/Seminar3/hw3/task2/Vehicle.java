package PO_Architecture.Seminar3.hw3.task2;

public abstract class Vehicle {
    protected int maxSpeed;
    protected String type;

    public Vehicle(int maxSpeed, String type) {
        this.maxSpeed = maxSpeed;
        this.type = type;
    }

    public int getMaxSpeed() {
        return this.maxSpeed;
    }

    public String getType() {
        return this.type;
    }

    public abstract double calculateAllowedSpeed();
}