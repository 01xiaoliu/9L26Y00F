package Test_9_26;

class MyClass{
    int a;
}
public class Test1 {
    public static void main(String[] args) {
        MyClass L =new MyClass();
        L.a=10;
        MyClass L1 =new MyClass();
        L1.a=20;
        System.out.println(L.a+"---"+L1.a);
    }
}
