/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package quanlylophoc;

/**
 *
 * @author ASUS
 */
public class Teacher extends Person {

    private int salary;
    
     public Teacher(String name, int age, String address,int salary) {
        super(name, age, address);
        setSalary(salary);
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        if (salary < 0) {
            this.salary = 0;
        } else {
            this.salary = salary;
        }
    }

   

}
