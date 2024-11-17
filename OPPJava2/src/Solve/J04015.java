package Solve;

public class J04015 {
    private String ID, Name;
    private long Level, Salary, Subsidy, Income;

    public J04015(String ID, String Name, long Salary)
    {
        this.ID = ID;
        this.Name = Name;
        this.Salary = Salary;
        if (ID.charAt(1) == 'T')
            this.Subsidy = 2000000;
        else if (ID.charAt(1) == 'P')
            this.Subsidy = 900000;
        else
            this.Subsidy = 500000;
        this.Level = 0;
        for (int i = 2; i < 4; ++i)
            this.Level = this.Level * 10 + (this.ID.charAt(i) - '0');
        this.Income = this.Salary * this.Level + this.Subsidy;
    }

    public String getID()
    {
        return ID;
    }

    public String getName()
    {
        return Name;
    }

    public long getLevel()
    {
        return Level;
    }

    public long getSalary()
    {
        return Salary;
    }

    public long getSubsidy()
    {
        return Subsidy;
    }

    public long getIncome()
    {
        return Income;
    }
}
