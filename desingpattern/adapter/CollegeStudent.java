package desingpattern.adapter;

public class CollegeStudent implements Student {
    private String name;
    private String email;

    public CollegeStudent(String name, String email) {
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
