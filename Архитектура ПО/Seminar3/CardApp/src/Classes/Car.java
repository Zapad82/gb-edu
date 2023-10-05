package Classes;
import java.awt.*;

import Enumerators.TypeOfGearBox;
import Enumerators.TypeOfBody;
import Enumerators.TypeOfFuel; 

public abstract class Car {
    private String make; 
    private String model;
    private Color color;
    private TypeOfBody typeOfBody;
    private int numOfWHeels;
    private TypeOfGearBox typeOfGearBox;
    private TypeOfFuel typeOfFuel;
    private float engineCapacity;

    public Car(String make, String model, Color color, TypeOfBody typeOfBody, int numOfWHeels,
            TypeOfGearBox typeOfGearBox, TypeOfFuel typeOfFuel, float enginCapacity) {
        this.make = make;
        this.model = model;
        this.color = color;
        this.typeOfBody = typeOfBody;
        this.numOfWHeels = numOfWHeels;
        this.typeOfGearBox = typeOfGearBox;
        this.typeOfFuel = typeOfFuel;
        this.engineCapacity = enginCapacity;
    }

    public void movement() {}
    public void maintenance() {}
    public boolean turnLight() {return true;}
    public boolean tirnWhapers() {return true;}




    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public Color getColor() {
        return color;
    }

    public TypeOfBody getTypeOfBody() {
        return typeOfBody;
    }

    public int getNumOfWHeels() {
        return numOfWHeels;
    }

    public TypeOfGearBox getTypeOfGearBox() {
        return typeOfGearBox;
    }

    public TypeOfFuel getTypeOfFuel() {
        return typeOfFuel;
    }

    public float getEngineCapacity() {
        return engineCapacity;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public void setTypeOfBody(TypeOfBody typeOfBody) {
        this.typeOfBody = typeOfBody;
    }

    public void setNumOfWHeels(int numOfWHeels) {
        this.numOfWHeels = numOfWHeels;
    }

    public void setTypeOfGearBox(TypeOfGearBox typeOfGearBox) {
        this.typeOfGearBox = typeOfGearBox;
    }

    public void setTypeOfFuel(TypeOfFuel typeOfFuel) {
        this.typeOfFuel = typeOfFuel;
    }

    public void setEngineCapacity(float engineCapacity) {
        this.engineCapacity = engineCapacity;
    }    

    
    
}