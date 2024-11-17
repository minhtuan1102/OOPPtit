package Solve;

public class J04007 {
    String name;
    String sex;
    String date;
    String add;
    String phone;
    String dateX;
    J04007(String name, String sex, String date, String add, String phone, String dateX){
        this.name = name;
        this.sex = sex;
        this.date = date;
        this.add = add;
        this.phone = phone;
        this.dateX = dateX;
    }
    public String getName(){
        return name;
    }
    public String getDate(){
        return date;
    }
    public String getSex(){
        return sex;
    }
    public String getAdd(){
        return add;
    }
    public String getPhone(){
        return phone;
    }
    public String getDateX(){
        return dateX;
    }
}
