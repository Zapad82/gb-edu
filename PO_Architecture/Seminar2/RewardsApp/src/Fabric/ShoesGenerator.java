package Fabric;

import Interface.iGameItem;
import Product.Shoes;

public class ShoesGenerator extends ItemGenerator {

    @Override
    public iGameItem createItem() {
        // TODO Auto-generated method stub
        return new Shoes();
    }
    
}
