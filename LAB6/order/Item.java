package pjatk.order;

public class Item {
    private final String product;
    private final double price;
    private final int quantity;
    double all = 0;
    public Item(String product, double price, int quantity) {
        this.product = product;
        this.price = price;
        this.quantity = quantity;
    }

    public double fullPrice()
    {

        all = all + this.quantity * this.price;
        return  all;
    }

    @Override
    public String toString() {
        return "name='" + product + ',' +
                ", price=" + price +
                ", quantity=" + quantity +
                ", total=" + fullPrice() +
                '}';

    }
}
