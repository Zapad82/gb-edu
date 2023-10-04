package Classes;
import java.awt.Color;

import Enumerators.TypeGearBox;
import Enumerators.TypeOfBody;
import Enumerators.TypeOfFuel;

public abstract class Car {
    public Car(String make, String model, Color color, TypeOfBody typeOfBody, int numOfWheels, TypeGearBox typeGearBox,
            TypeOfFuel typeOfFuel, float engineCapacity) {
        this.make = make;
        this.model = model;
        this.color = color;
        this.typeOfBody = typeOfBody;
        this.numOfWheels = numOfWheels;
        this.typeGearBox = typeGearBox;
        this.typeOfFuel = typeOfFuel;
        this.engineCapacity = engineCapacity;
    }

    public void movement() {

    }

    public void maintenance() {

    }

    public boolean turnLight() {
        return true;
    }

    public boolean tirnWhrapers() {
        return true;
    }
    
    private String make;
    private String model;
    private Color color;
    private TypeOfBody typeOfBody;
    private int numOfWheels;
    private TypeGearBox typeGearBox;
    private TypeOfFuel typeOfFuel;
    private float engineCapacity;
    public String getMake() {
        return make;
    }
    public void setMake(String make) {
        this.make = make;
    }
    public String getModel() {
        return model;
    }
    public void setModel(String model) {
        this.model = model;
    }
    public Color getColor() {
        return color;
    }
    public void setColor(Color color) {
        this.color = color;
    }
    public TypeOfBody getTypeOfBody() {
        return typeOfBody;
    }
    public void setTypeOfBody(TypeOfBody typeOfBody) {
        this.typeOfBody = typeOfBody;
    }
    public int getNumOfWheels() {
        return numOfWheels;
    }
    public void setNumOfWheels(int numOfWheels) {
        this.numOfWheels = numOfWheels;
    }
    public TypeGearBox getTypeGearBox() {
        return typeGearBox;
    }
    public void setTypeGearBox(TypeGearBox typeGearBox) {
        this.typeGearBox = typeGearBox;
    }
    public TypeOfFuel getTypeOfFuel() {
        return typeOfFuel;
    }
    public void setTypeOfFuel(TypeOfFuel typeOfFuel) {
        this.typeOfFuel = typeOfFuel;
    }
    public float getEngineCapacity() {
        return engineCapacity;
    }
    public void setEngineCapacity(float engineCapacity) {
        this.engineCapacity = engineCapacity;
    }
}
