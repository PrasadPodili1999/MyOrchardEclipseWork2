package com.mt.hibernate1;

import com.mt.hibernate1.dao.StudentDao;
import com.mt.hibernate1.model.Student;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        StudentDao studentDao=new StudentDao();
        Student student=new Student("prasad","prasad@gmail.com");
        studentDao.saveStudent(student);
        System.out.println(student.getId());
    }
}
