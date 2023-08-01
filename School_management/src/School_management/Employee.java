/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package School_management;

/**
 *
 * @author SKY
 */

class Employee extends Person{
    String id;
    float salary;
    String position;

    float getNetSalary(float taxRate){
        return this.salary - this.salary * taxRate;
    }
}
