/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package quanlylophoc;

import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class QuanLyLopHoc {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            String name = sc.nextLine();
            int tuoi = sc.nextInt();
            sc.nextLine();
            String address = sc.nextLine();
            double gpa = sc.nextDouble();
            Student st = new Student( name, tuoi, address,gpa);
            st.display();
            int salary = sc.nextInt();
            Teacher tc = new Teacher(name, tuoi, address,salary);
            tc.display();
    }
    
}
