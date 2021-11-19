package business;

public class Professor extends Client{

    private int experience;

    public Professor(String login, int experience) {
        super(login);
        this.experience = experience;
    }
}
