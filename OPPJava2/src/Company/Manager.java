package Company;

public class Manager extends Employee {
    private int Bonus;


    public int getBonus() {
        return Bonus;
    }

    public void setBonus(int bonus) {
        if(bonus < 0) this.Bonus = 0;
        else this.Bonus = bonus;
    }

    public Manager(String name, int salary, int Bonus) {
        super(name, salary);
        setBonus(Bonus);
    }
    public void display(){
        super.display();
        System.out.println("salary" + getSalary() + Bonus);
    }
}
