package Fabric;

import Interface.iGameItem;
import Product.Water;

public class WaterGenerator extends ItemGenerator {

    @Override
    public iGameItem createItem() {
        // TODO Auto-generated method stub
        return new Water();
    }
    
}
