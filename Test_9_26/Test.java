package Test_9_26;

import java.util.Scanner;

abstract class Animal{
    Scanner sc =new Scanner(System.in);
    public String name;
    private int age;

    public abstract void eat();

    public void sleep(){
        System.out.println("在睡觉");
    }
}
class Dog extends Animal{
    public void eat(){
        System.out.println("狗在吃骨头");
    }
}
class Cat extends Animal{
    public void eat(){
        System.out.println("猫在吃鱼");
    }
}
abstract class Bird extends Animal{}
public class Test {
    public static void main(String[] args) {
        Animal animal =new Dog();
        animal.eat();
        animal=new Cat();
        animal.eat();
    }
}
