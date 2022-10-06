public class Groceries extends Product implements ProductActionI{
    public Groceries(String productName, double price, double id, boolean inStock, String tag) {
        super(productName, price, id, inStock, tag);
    }

    @Override
    public String toString() {
        return "Groceries{" +
                "productName='" + productName + '\'' +
                ", price=" + price +
                ", id=" + id +
                ", inStock=" + inStock +
                ", tag='" + tag + '\'' +
                '}';
    }

    @Override
    public void addToCar() {

    }

    @Override
    public void purchase() {

    }

    @Override
    public void withdraw() {

    }
}
