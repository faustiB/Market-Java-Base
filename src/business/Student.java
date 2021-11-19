package business;

public class Student extends Client{

    private String area;

    public Student(String login, String area) {
        super(login);
        this.area = area;
    }
}
