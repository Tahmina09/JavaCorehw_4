public class Order {
    private Object customer;
    private Object product;
    private int amount;

    Order (Object customer, Object product, int amount){
        this.customer = customer;
        this.product = product;
        this.amount = amount;
    }

    public void setCustomer(Object customer) { this.customer = customer; }

    public void setProduct(Object product) { this.product = product; }

    public void setAmount(int amount) { this.amount = amount; }

    public Object getCustomer() { return customer; }

    public Object getProduct() { return product; }

    public int getAmount() { return amount; }

    @Override
    public String toString() {
        return "Order {Customer = ' " + customer + '\'' +
                "Product = ' " + product + '\'' +
                "Amount = ' " + amount + "'}";
    }
}
