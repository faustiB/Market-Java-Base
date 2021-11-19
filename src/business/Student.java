package business;

public class Student extends Client{

    private String area;

    public Student(String login, String area) {
        super(login);
        this.area = area;
    }

    @Override
    public double calculatePriceDiscount(double price){

        if (area.equals("Enginyeria") ||
            area.equals("Arquitectura") ||
            area.equals("Animació") ||
            area.equals("Empresa") ){
            return price*0.9;
        } else {
            return price*1.1;
        }

    }


}
