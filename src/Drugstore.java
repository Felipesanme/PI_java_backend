public class Drugstore extends Product implements ProductActionI{
    private double prescriptionId;

    public Drugstore(String productName, double price, double id, boolean inStock, String tag, double prescriptionId) {
        super(productName, price, id, inStock, tag);
        this.prescriptionId = prescriptionId;
    }

    public double getPrescriptionId() {
        return prescriptionId;
    }

    public void setPrescriptionId(double prescriptionId) {
        this.prescriptionId = prescriptionId;
    }

    private void ageVerification(){

    }

    @Override
    public String toString() {
        return "Drugstore{" +
                "prescriptionId=" + prescriptionId +
                ", productName='" + productName + '\'' +
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
