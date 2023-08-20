public class Product {
    private String name;
    private int price;

    Product (String name, int price){
        this.name = name;
        this.price = price;
    }

    public String getName() { return name; }

    public int getPrice() { return price; }

    public void setPrice(int price) { this.price = price; }

    public void setName(String name) { this.name = name; }

    @Override
    public String toString() {
        return "Order {Name = ' " + name + '\'' +
                "Price = ' " + price + "'}";
    }
}
