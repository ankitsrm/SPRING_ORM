package org.example;


import org.example.orm.dao.StudentDao;
import org.example.orm.entities.Student;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.BufferedReader;
import java.io.File;
import java.io.InputStreamReader;

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


        new App().getData(br);




        /*Student student = new Student(2326,"Nandhini_Sarvanakumar","Paderborn", "33041");
        int r = studentDao.insert(student);

        System.out.println( "done" + r);*/
    }

    public void getData(BufferedReader br){
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
                        break;
                    case 2 :
                        //display all students
                        break;

                    case 3 :
                        // get detail of student
                        break;
                    case 4 :
                        //delete student
                        break;

                    case 5 :
                        //update student details
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



























