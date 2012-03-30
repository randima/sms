/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package studentmanagmentsystem;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import java.util.List;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author 100544V
 */
public class SimpleStudentRepositoryTest {

    Student stu;
    SimpleStudentRepository instance;

    public SimpleStudentRepositoryTest() {
     stu=new Student("kasun", "gunasekara", 101, "sagfdjahdkd");
     instance= new SimpleStudentRepository();
    } 
 

    /**
     * Test of saveStudent method
     */
    @Test
    public void testSaveStudent() {
        System.out.println("saveStudent");        
        instance.saveStudent(stu);        
        
    }    

    /**
     * Test of findStudent method, of class SimpleStudentRepository.
     */
    @Test
    public void testFindStudent() {
        System.out.println("findStudent");
        long regNumber = 101;        
        instance.saveStudent(stu);
        Student result = instance.findStudent(regNumber);
        assertEquals(stu.getFirstName(), result.getFirstName());
        
    }

    /**
     * Test of updateStudent method, of class SimpleStudentRepository.
     */
    @Test
    public void testUpdateStudent() {
        System.out.println("updateStudent");        
        instance.saveStudent(stu);
        stu.setFirstName("sampath");
        instance.updateStudent(stu);
         Student result = instance.findStudent(101);
        assertEquals("sampath", result.getFirstName());
       
    }

    /**
     * Test of deleteStudent method
     */
    @Test
    public void testDeleteStudent() {
        System.out.println("deleteStudent");
        instance.saveStudent(stu);
        instance.deleteStudent(stu);        
        
    }

}