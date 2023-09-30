package Fabric;

import Interface.iGameItem;
import Product.Flowers;

public class FlowersGenerator extends ItemGenerator {

    @Override
    public iGameItem createItem() {
        // TODO Auto-generated method stub
        return new Flowers();
    }
    
}
