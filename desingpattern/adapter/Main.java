package desingpattern.adapter;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        StudentClient client = new StudentClient();
        List<Student> students = client.getStudentsList();
        System.out.println(students);
    }
}
