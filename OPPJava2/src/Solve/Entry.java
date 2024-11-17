package Solve;

class Animal {
    public void sound(){
        System.out.println("some sound");
    }
}

class Dog extends Animal{
    public void sound(){
        System.out.println("bow wow");
    }
}
class Cat extends Animal{
    public void sound(){
        System.out.println("meow meow");
    }
}
class Duck extends Animal{
    public void sound(){
        System.out.println("quack quack");
    }
}
public class Entry {
    public static void main(String[] args) {
        Animal animal = new Animal();
        animal.sound();
        animal = new Dog();
        animal.sound();
        animal = new Cat();
        animal.sound();
        animal = new Duck();
        animal.sound();
    }
}

