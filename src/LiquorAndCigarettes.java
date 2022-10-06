public class LiquorAndCigarettes extends Product implements ProductActionI{
    public LiquorAndCigarettes(String productName, double price, double id, boolean inStock, String tag) {
        super(productName, price, id, inStock, tag);
    }

    private void ageVerification(){

    }

    @Override
    public String toString() {
        return "LiquorAndCigarettes{" +
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
