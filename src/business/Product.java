package business;

public class Product {

    protected String name;
    protected double weight;
    protected double price;


    public Product(String name, double weight, double price) {
        this.name = name;
        this.weight = weight;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public boolean hasName(String name) {
        return this.name.equals(name);
    }
}
