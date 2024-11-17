/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package quanlylophoc;

/**
 *
 * @author ASUS
 */
public class Student extends Person {

    private double gpa;

    public Student( String name, int age, String address,double gpa) {
        super(name, age, address);
        setGpa(gpa);
    }

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        if (gpa < 0 || gpa > 4) {
            this.gpa = 0;
        } else {
            this.gpa = gpa;
        }
    }
}
