package Classes;

import java.awt.Color;

import Enumerators.TypeGearBox;
import Enumerators.TypeOfBody;
import Enumerators.TypeOfFuel;
import Interfaces.IFuelStation;
import Interfaces.IWippingCar;

public class Pickup extends Car implements IFuelStation, IWippingCar{
    
    private float loadCapacity;

    public Pickup(String make, String model, Color color, int numOfWheels,
            TypeGearBox typeGearBox, TypeOfFuel typeOfFuel, float engineCapacity, float loadCapacity) {
        super(make, model, color, TypeOfBody.PICKUP, numOfWheels, typeGearBox, typeOfFuel, engineCapacity);
        this.loadCapacity = loadCapacity;
    }

    @Override
    public void fuel() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'fuel'");
    }

    @Override
    public void wipWindShield() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'wipWindShield'");
    }

    @Override
    public void wipHeadLights() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'wipHeadLights'");
    }

    @Override
    public void wipMirrors() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'wipMirrors'");
    }
}
