/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package School_management;

/**
 *
 * @author SKY
 */



import java.util.Date;
abstract class Person {

    String name;
    String address;
    Date birthDay;
    String sex;
    
    void setName(String name){
        this.name = name;
    }

    void setAddress(String address){
        this.address = address;
    }

    void setBirthDay(Date birthDay){
        this.birthDay = birthDay;
    }

    void setSex(String sex){
        this.sex = sex;
    }

    String getName(){
        return this.name;
    }

    String getAddress(){
        return this.address;
    }

    String getSex(){
        return this.sex;
    }

    Date getBirthDay(){
        return this.birthDay;
    }

    void calcAge(Date currYear){
        
    }
}
