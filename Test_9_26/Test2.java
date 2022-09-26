package Test_9_26;

class MyClass1{
    static int b;
}
public class Test2 {
    public static void main(String[] args) {
        MyClass1.b=30;
        MyClass1.b=37;
        System.out.println(MyClass1.b);
    }
}
