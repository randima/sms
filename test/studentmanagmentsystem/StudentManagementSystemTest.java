/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package studentmanagmentsystem;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author 100544V
 */
public class StudentManagementSystemTest {

    public StudentManagementSystemTest() {
    }

  
    /**
     * Test of listAllStudents method
     */
    @Test
    public void testListAllStudents() {
        System.out.println("listAllStudents");
        StudentManagementSystem instance = new StudentManagementSystem();
        instance.listAllStudents();
        
    }

    /**
     * Test of registerStudent method
     */
    @Test
    public void testRegisterStudent() {
        System.out.println("registerStudent");
        Student stu =new Student("kasun", "gunasekara", 101, "sagfdjahdkd");
        StudentManagementSystem instance = new StudentManagementSystem();
        instance.registerStudent(stu);
        
       
    }

}