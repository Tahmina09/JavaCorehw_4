import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Object [][] info = {
                {customers[0], products[2], 3},
                {customers[1], products[0], -15},
                {customers[0], products[3], 150},
                {customers[1], new Product ("Flower", 150), 20},
                {new Customer("Тамара",LocalDate.of(1981, 12, 23),
                        "+7 856 103 293 234" ), products[1], 5},
        };

        int capacity = 0;
        int i = 0;
        while(capacity != orders.length - 1 || i != info.length){
            try {
                orders[capacity] = makeOrder((Customer) info[i][0], (Product) info[i][1], (int) info[i][2]);
                capacity++;
            } catch (ProductException e) {
                e.printStackTrace();
            } catch (AmountException e) {
                orders[capacity] = makeOrder((Customer) info[i][0], (Product) info[i][1], 1);
            } catch (CustomerException e){
                throw new RuntimeException(e);
            } finally {
                System.out.println("Orders made: " + capacity);
            }
            ++i;
        }
    }

    private static final Customer[] customers = {
            new Customer("Константин",
                    LocalDate.of(1991, 9, 1),
                    "+7 882 789 98 34"),
            new Customer("Валентина",
                    LocalDate.of(1995, 11, 19),
                    "+7 985 561 30 95"),
    };

    private static final Product[] products = {
            new Product("Samsung Galaxy S23 Ultra", 100000),
            new Product("Samsung Galaxy S21", 40000),
            new Product("Xiaomi Redmi Note 12", 15000),
            new Product("Iphone 14 Pro", 130000),
            new Product("Huawei Nova Y61", 10000),
    };

    private static Order[] orders = new Order[5];

    public static class CustomerException extends RuntimeException {
        public CustomerException(String message) { super(message); }
    }

    public static class ProductException extends RuntimeException {
        public  ProductException(String message) { super(message); }
    }

    public static class AmountException extends RuntimeException {
        public AmountException(String message) { super(message); }
    }

    private static boolean exists(Object[] array, Object ob){
        for (int i = 0; i < array.length; i++) {
            if(array[i].equals(ob)) return true;
        }
        return false;
    }

    public static Order makeOrder(Customer c, Product p, int amount){
        if(!exists(customers, c)) {
            throw new CustomerException("There's no customer:" + c);
        }
        if(!exists(products, p)) {
            throw new ProductException("There's no product:" + p);
        }
        if(amount < 0 || amount > 100) {
            throw new AmountException("Incorrect amount:" + amount);
        }
        return new Order(c, p, amount);
    }





}