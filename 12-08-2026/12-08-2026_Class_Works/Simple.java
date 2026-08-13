package javatrain;

abstract class Product {
    int productID;
    double price;
    String name;

    Product(int productID, double price, String name) {
        this.name = name;
        this.productID = productID;
        this.price = price;
    }

    // Abstract method
    abstract double Discount();

    // Concrete method
    double finalPrice() {
        return price - Discount();
    }

    void Display() {
        System.out.println("ProductID: " + productID);
        System.out.println("ProductName: " + name);
        System.out.println("Price: " + price);
        System.out.println("Discount: " + Discount());
        System.out.println("FinalPrice: " + finalPrice());
    }
}

class Electronics extends Product {
    Electronics(int productID, double price, String name) {
        super(productID, price, name);
    }

    // Implementing the abstract method correctly
    @Override
    double Discount() {
        return price * 0.10;
    }
}

public class Simple {
    public static void main(String[] args) {
        Product item = new Electronics(101, 50000.0, "Laptop");
        item.Display();
    }
}
