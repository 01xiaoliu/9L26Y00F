package Test_9_26;

class A{
    public static void test1(){
        System.out.println("test1");
        test2();
    }
    public static void test2(){
        System.out.println("test2");
    }
}
public class Test04 {
    public static void test(){
        System.out.println("test");
    }
    public static void main(String[] args) {
        test();
        A.test1();
    }
}
