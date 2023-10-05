package Fabric;

import Interface.iGameItem;
import Product.Money;

public class MoneyGenerator extends ItemGenerator {

    @Override
    public iGameItem createItem() {
       return new Money();
    }
    
}