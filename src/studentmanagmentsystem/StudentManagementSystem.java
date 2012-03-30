package studentmanagmentsystem;

import java.util.AbstractList;
import java.util.List;

public class StudentManagementSystem {

    private StudentRepository repo;

    public StudentManagementSystem() {
        this.repo = new SimpleStudentRepository();
    }

    public void listAllStudents() {
        List a;
        a = repo.findAllStudents();
        for (int i = 0; i < a.size(); i++) {
            Student stu = (Student) a.get(i);
            System.out.println(stu.getFirstName() + " " + stu.getLastName() + " " + stu.getAddress() + " " + stu.getRegNumber());
        }

    }

    public void registerStudent(Student stu) {
        repo.saveStudent(stu);
    }



}
