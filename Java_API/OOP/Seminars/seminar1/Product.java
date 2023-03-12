public class Product {
    private String productName;
    private int count;
    private int price;


    public Product(String productName, int count, int price) {
        this.productName = productName;
        this.count = count;
        this.price = price;
    }
    public String getProductName() {
        return productName;
    }
    public void setProductName(String productName) {
        this.productName = productName;
    }
    public int getCount() {
        return count;
    }
    public void setCount(int count) {
        this.count = count;
    }
    public int getPrice() {
        return price;
    }
    public void setPrice(int price) {
        this.price = price;
    }
    @Override
    public String toString() {
        return "Product [productName=" + productName + ", count=" + count + ", price=" + price + "]";
    }
    
    
}
