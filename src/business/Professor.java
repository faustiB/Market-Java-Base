package business;

public class Professor extends Client {

    private int experience;

    public Professor(String login, int experience) {
        super(login);
        this.experience = experience;
    }

    public double calculatePriceDiscount(double price) {
        if (experience > 2) {
            return (price * 0.5);
        } else {
            return price;
        }
    }
}
