abstract public class Product {

    public String productName;
    public double price;
    public double id;
    public boolean inStock;
    public String tag;

    public Product(String productName, double price, double id, boolean inStock, String tag) {
        this.productName = productName;
        this.price = price;
        this.id = id;
        this.inStock = inStock;
        this.tag = tag;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getId() {
        return id;
    }

    public void setId(double id) {
        this.id = id;
    }

    public boolean isInStock() {
        return inStock;
    }

    public void setInStock(boolean inStock) {
        this.inStock = inStock;
    }

    public String getTag() {
        return tag;
    }

    public void setTag(String tag) {
        this.tag = tag;
    }

    @Override
    public String toString() {
        return "Product{" +
                "productName='" + productName + '\'' +
                ", price=" + price +
                ", id=" + id +
                ", inStock=" + inStock +
                ", tag='" + tag + '\'' +
                '}';
    }

}
