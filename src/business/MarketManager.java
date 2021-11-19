package business;


import java.time.LocalDate;
import java.util.ArrayList;

public class MarketManager {

    private ArrayList<Product> products;
    private ArrayList<Client> clients;

    public MarketManager() {
        this.products = new ArrayList<>();
        this.clients = new ArrayList<>();
    }

    public void createProduct(String name, double weight, double price) {
        Product p = new Product(name, weight, price);
        products.add(p);
    }

    public void createExpiringProduct(String name, double weight, double price, LocalDate expirationDate, int discount) {
        ExpiredProduct p = new ExpiredProduct(name, weight, price, expirationDate, discount);
        products.add(p);
    }

    public void registerProfessor(String login, int experienceYears) {
        Professor p = new Professor(login, experienceYears);
        clients.add(p);
    }

    public void registerStudent(String login, String area) {
        Student s = new Student(login, area);
        clients.add(s);
    }

    public double calculatePrice(String name, String login) {
        // Assume name and login are unique and exist
        double price = 0.0;

        for (Product product : products) {

            if (product.hasName(name)) {
                price = product.getPrice();
            }
        }


        for (Client client : clients) {

            if (client.hasLogin(login)) {
                price = client.calculatePriceDiscount(price);
            }
        }


        return price;
    }
}
