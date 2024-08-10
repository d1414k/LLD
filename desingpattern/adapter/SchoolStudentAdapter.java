package desingpattern.adapter;

public class SchoolStudentAdapter implements Student {
    private SchoolStudent schoolStudent;

    public SchoolStudentAdapter(SchoolStudent schoolStudent) {
        this.schoolStudent = schoolStudent;
    }

    public String getName() {
        return schoolStudent.getName();
    }

    public String getEmail() {
        return schoolStudent.getEmail();
    }
}
