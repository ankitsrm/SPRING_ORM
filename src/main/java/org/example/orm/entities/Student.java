package org.example.orm.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="student_details")
public class Student {

    @Id
    @Column(name= "student_id")
    private int studentID;



    @Column(name="student_name")
    private String studentName;

    @Column(name="student_city")
    private String studentCity;

    @Column(name="pincode")
    private String pincode;

    public int getStudentID() {
        return studentID;
    }

    public void setStudentID(int studentID) {
        this.studentID = studentID;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getStudentCity() {
        return studentCity;
    }

    public void setStudentCity(String studentCity) {
        this.studentCity = studentCity;
    }
    public String getPincode() {
        return pincode;
    }

    public void setPincode(String pincode) {
        this.pincode = pincode;
    }

    public Student() {
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentID=" + studentID +
                ", studentName='" + studentName + '\'' +
                ", studentCity='" + studentCity + '\'' +
                ", pincode='" + pincode + '\'' +
                '}';
    }

    public Student(int studentID, String studentName, String studentCity, String pincode) {
        this.studentID = studentID;
        this.studentName = studentName;
        this.studentCity = studentCity;
        this.pincode = pincode;
    }
}
