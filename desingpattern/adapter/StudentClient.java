package desingpattern.adapter;

import java.util.*;

public class StudentClient {

    public List<Student> getStudentsList() {
        List<Student> students = new ArrayList();

        CollegeStudent collegeStudent = new CollegeStudent("deepak", "deep@gmail.com");
        students.add(collegeStudent);

        SchoolStudent schoolStudent = new SchoolStudent("ram", "ram@yahoo.com");

        // students.add(schoolStudent); this line is creating issue as schoolStudent is
        // not implementing student interface
        // but if we look closely both are compatible
        // Lets use adapter to convert this

        students.add(new SchoolStudentAdapter(schoolStudent));

        return students;
    }
}
