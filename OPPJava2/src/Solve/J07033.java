package Solve;

public class J07033 implements Comparable<J07033>{
    String code;
    String name;
    String Class;
    String mail;
    public J07033(String code, String name, String Class, String mail) {
        this.code = code;
        this.name = chuanhoa(name);
        this.Class = Class;
        this.mail = mail;
    }

    private String chuanhoa(String name) {
        String[] s = name.trim().toLowerCase().split("\\s+");
        String z = "";
        for (String i : s) {
            z += Character.toUpperCase(i.charAt(0)) + i.substring(1) + " ";
        }
        return z.trim();
    }

    @Override
    public String toString() {
        return String.format("%s %s %s %s", code, name, Class, mail);
    }

    @Override
    public int compareTo(J07033 o) {
        return code.compareTo(o.code);
    }
}
