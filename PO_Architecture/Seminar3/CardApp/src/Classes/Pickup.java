package Classes;

import java.awt.Color;

import Enumerators.TypeOfBody;
import Enumerators.TypeOfFuel;
import Enumerators.TypeOfGearBox;
import Interfaces.IFuelStation;
import Interfaces.IWipingCar;

public class Pickup extends Car implements IFuelStation, IWipingCar{

    /**
     *
     */
    private float loadCapacity;

    public Pickup(String make, String model, Color color, int numOfWHeels,
            TypeOfGearBox typeOfGearBox, TypeOfFuel typeOfFuel, float enginCapacity, float loadCapacity) {
                
        super(make, model, color, TypeOfBody.PICKUP , numOfWHeels, typeOfGearBox, typeOfFuel, enginCapacity);
        this.loadCapacity = loadCapacity;

    }

    @Override
    public void fuel() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'fuel'");
    }

    @Override
    public void wipWindShilde() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'wipWindShilde'");
    }

    @Override
    public void wipHeadLights() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'wipHeadLights'");
    }

    @Override
    public void wipMirrows() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'wipMirrows'");
    }



}






















































