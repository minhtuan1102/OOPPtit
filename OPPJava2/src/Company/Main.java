package Company;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Employee em = new Employee("Thang", 2000);
        em.display();
        Manager mn = new Manager("Quang",2000,1000);
        mn.display();
    }
}
