package business;

public class Client {

    protected String login;

    public Client(String login) {
        this.login = login;
    }

    public String getLogin() {
        return login;
    }

    public double calculatePriceDiscount(double price){
        return price;
    }

    public boolean hasLogin(String login) {
        return this.login.equals(login);
    }
}
