/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package School_management;

/**
 *
 * @author SKY
 */


import School_Management.*;

import java.util.Date;
import java.util.ArrayList;
import java.util.ListIterator;

public class Student extends Person {
    private String id;
    private float averageScore;
    private byte grade;
    private String clinicReport;
    private float paidFee;
    private float totalFee;
    private char section;
    private ArrayList<Course> courses;

    public Student(String name, String address, Date birthDay, String sex, String id, char section){
        this.name = name;
        this.address = address;
        this.birthDay = birthDay;
        this.id = id;
        this.section = section;
        this.sex = sex;
    }

    void setId(String id){
        this.id = id;
    }
    void setSection(char section){
        this.section = section;
    }

    void setSex(String sex){
        this.sex = sex;
    }

    String getId(){
        return this.id;
    }

    String getSex(){
        return this.sex;
    }

    char getSection(){
        return this.section;
    }
}

