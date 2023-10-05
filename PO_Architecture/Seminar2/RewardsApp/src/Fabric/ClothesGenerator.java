package Fabric;

import Interface.iGameItem;
import Product.Clothes;

public class ClothesGenerator extends ItemGenerator {

    @Override
    public iGameItem createItem() {
        // TODO Auto-generated method stub
        return new Clothes();
    }
    
}
