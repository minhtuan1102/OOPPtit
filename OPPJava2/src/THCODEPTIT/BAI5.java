package THCODEPTIT;

public class BAI5 implements Comparable<BAI5> {
    String code;
    String name;
    String Class;
    String mail;
    String nb;
    public BAI5(String code, String name, String Class, String mail, String nb) {
        this.code = code;
        this.name = name;
        this.Class = Class;
        this.mail = mail;
        this.nb = setNb(nb);
    }
    public String setNb(String nb) {
        return "0" + nb;
    }
    @Override
    public String toString() {
        return String.format("%s %s %s %s %s", code, name, Class, mail, nb);
    }
    @Override
    public int compareTo(BAI5 o) {
        if(this.Class.compareTo(o.Class) != 0) return o.Class.compareTo(this.Class);
        return this.code.compareTo(o.code);
    }

}
