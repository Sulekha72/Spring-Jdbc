package com.spring.jdbc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

import com.spring.jdbc.dao.StudentDao;
import com.spring.jdbc.entities.Student;


public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "My program has just started........" );
     ApplicationContext context = new ClassPathXmlApplicationContext("com/spring/jdbc/config.xml");
     StudentDao studentDao =context.getBean("StudentDao",StudentDao.class);
    // Student student= new Student();
     //student.setId(123);
     //student.setName("Haseen");
     //student.setCity("Patna");
     
     
   //int result=  studentDao.insert(student);
   //System.out.println("Student added "+result);
     
    // Student student =new Student();
     //student.setId(113);
     //student.setName("Anchal Kumari");
    // student.setCity("Delhi");
     //int result = studentDao.change(student);
     //System.out.println("data changed" +result);
     
     //DELETE
     int result = studentDao.delete(123);
     System.out.println("Deleted " +result);
     
     
      
     
    }
}
