package desingpattern.adapter;

public class SchoolStudent {
    private String name;
    private String email;

    public SchoolStudent(String name, String email) {
        this.name = name;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }
}
