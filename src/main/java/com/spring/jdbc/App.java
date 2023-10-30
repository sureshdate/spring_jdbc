package com.spring.jdbc;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

import com.spring.jdbc.Entity.Student;
import com.spring.jdbc.dao.StudentDao;


public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext context=new ClassPathXmlApplicationContext("com/spring/jdbc/config.xml");
    	StudentDao studentdao=context.getBean("StudentDao",StudentDao.class);
    	
    	//this is for insert operation
    	/*Student student=new Student();
    	student.setId(666);
    	student.setName("john");
    	student.setCity("Lucknow");
    	
       int r=studentdao.insert(student);
       System.out.println("student added" +r);
        */
    	
    	//this is for update operation		
    	/*Student student=new Student();
    	student.setId(666);
    	student.setName("suresh");
    	student.setCity("mumbai");
        int r= studentdao.change(student);
        System.out.println("student updated" +r);*/
        
        //this is for delete operation
       /* int result= studentdao.delete(456);
        System.out.println("student deleted" +result);*/
        
        //this is for single result
    	//Student student=studentdao.getStudent(222);
        //System.out.println(student);
        
        List<Student> students=studentdao.getAllStudent();        
        
        for(Student s:students) {
        	System.out.println(s);
        }
        
        
        
        
    }
}
