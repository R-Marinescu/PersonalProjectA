package Human;



public class Trainer extends Human {
    private String subject;

    public Trainer(String fName, String lName, String subject) {
        super(fName, lName);
        this.subject = subject;

    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    @Override
    public String toString() {
        return "\n" + "Name: " + getfName() + "\n" + "Lastname: " + getlName() +
                "\n" + "Class Subject: " + subject + "\n";
    }
}
