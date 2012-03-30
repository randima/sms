package studentmanagmentsystem;

import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

public class SmsStarter {

    public static void main(String[] args) {

        XmlBeanFactory beanFactory = new XmlBeanFactory(new ClassPathResource(
"sms.xml"));        
        Student stu1 = (Student)beanFactory.getBean("stu1");
        Student stu2 = (Student)beanFactory.getBean("stu2");
        Student stu3 = (Student)beanFactory.getBean("stu3");
        Student stu4 = (Student)beanFactory.getBean("stu4");

        StudentManagementSystem sms = (StudentManagementSystem)beanFactory.getBean("sms");
        sms.listAllStudents();
        sms.registerStudent(stu1);
        sms.registerStudent(stu2);
        sms.registerStudent(stu3);
        sms.registerStudent(stu4);
        sms.listAllStudents();        
    }
}
