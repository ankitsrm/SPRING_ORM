package org.example;


import org.example.orm.dao.StudentDao;
import org.example.orm.entities.Student;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.List;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext context = new ClassPathXmlApplicationContext("orm_config.xml");
        StudentDao studentDao = context.getBean("studentDao", StudentDao.class);

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));


        new App().getData(br, studentDao);




        /*Student student = new Student(2326,"Nandhini_Sarvanakumar","Paderborn", "33041");
        int r = studentDao.insert(student);

        System.out.println( "done" + r);*/
    }

    public void getData(BufferedReader br, StudentDao studentDao){
        System.out.println("Processing your input...");

        boolean go = true ;

        while(go){
            System.out.println("PRESS 1 for add new student");
            System.out.println("PRESS 2 for display all student");
            System.out.println("PRESS 3 for get detail of single student");
            System.out.println("PRESS 4 for delete students");
            System.out.println("PRESS 5 for update student");
            System.out.println("PRESS 6 for exit");

            try{
                int inputToken = Integer.parseInt(br.readLine());
                switch (inputToken){

                    case 1 :
                        //add a new student
                        System.out.println("Enter user id : ");
                        int uid=Integer.parseInt(br.readLine());

                        System.out.println("Enter user name : ");
                        String userName = br.readLine();

                        System.out.println("Enter user city : ");
                        String userCity = br.readLine();

                        System.out.println("Enter user pincode : ");
                        String pincode = br.readLine();

                        Student s = new Student(uid,userName,userCity,pincode);
                        studentDao.insert(s);

                        System.out.println("**************************************");

                        break;
                    case 2 :
                        //display all students

                        List<Student> allStudent = studentDao.getallStudent();

                        for (Student sa : allStudent){
                            System.out.println(sa);
                        }
                        break;

                    case 3 :

                        System.out.println("Enter student ID : " );
                        int studentId = Integer.parseInt(br.readLine());
                        Student stu = studentDao.getStudent(studentId);
                        System.out.println("Student detail : " + stu);
                        break;
                    case 4 :
                        System.out.println("Enter Student ID ");
                        Integer studentid = Integer.parseInt(br.readLine());
                        studentDao.deleteStudent(studentid);
                        break;

                    case 5 :

                        break;

                    case 6 :
                        //exit

                        go = false;
                        break;

                }
            }catch (Exception e){
                System.out.println("Invalid input kindly provide input from given token... ");
                System.out.println(e.getMessage());
            }
        }
        System.out.println("Process finished and exited : ");


    }
}



























