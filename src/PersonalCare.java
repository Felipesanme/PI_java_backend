public class PersonalCare extends Product implements ProductActionI{
    public PersonalCare(String productName, double price, double id, boolean inStock, String tag) {
        super(productName, price, id, inStock, tag);
    }

    @Override
    public String toString() {
        return "PersonalCare{" +
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
