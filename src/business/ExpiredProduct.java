package business;

import java.time.LocalDate;

public class ExpiredProduct extends Product{

    private LocalDate expiredDate;
    private int discount;


    public ExpiredProduct(String name, double weight, double price, LocalDate expiredDate, int discount) {
        super(name, weight, price);
        this.expiredDate = expiredDate;
        this.discount = discount;
    }
}
