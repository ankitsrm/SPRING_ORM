package org.example.orm.dao;

import org.example.orm.entities.Student;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

public class StudentDao {
    private HibernateTemplate hibernateTemplate;

    public HibernateTemplate getHibernateTemplate() {
        return hibernateTemplate;
    }

    public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
        this.hibernateTemplate = hibernateTemplate;
    }

   @Transactional
    public int insert (Student student){

         //INSERT
         Integer i = (Integer) this.hibernateTemplate.save(student);
         return i;
     }

     //get the single student

    public Student getStudent(int studentid){
       Student student =  this.hibernateTemplate.get(Student.class, studentid);
        return student;
    }

    //get All student

    public List<Student> getallStudent(){
       List<Student> students = this.hibernateTemplate.loadAll(Student.class);
        return students;
    }

    @Transactional
    public void deleteStudent(int studentid){
        Student student = this.hibernateTemplate.get(Student.class, studentid);
        this.hibernateTemplate.delete(student);
    }

    @Transactional
    public void updateStudent(Student student){
        this.hibernateTemplate.update(student);
    }
}
