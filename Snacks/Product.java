
class Product {
    private String name;
    private int quantity;
    private double unitPrice;

    public Product(String name, int quantity, double unitPrice) {
        this.name = name;
        this.quantity = quantity;
        this.unitPrice = unitPrice;
    }

    public double getTotalPrice() {
        return quantity * unitPrice;
    }

    @Override
    public String toString() {
        return String.format("%-10s %-5d %-10.2f %-10.2f", name, quantity, unitPrice, getTotalPrice());
    }
}
