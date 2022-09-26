package Test_9_26;

class cf{
    static int cct;
    public cf(){cct++;}
}
public class Test3 {
    public static void main(String[] args) {
        System.out.println("qian"+cf.cct);
        new cf();
        new cf();
        new cf();
        System.out.println("ho"+cf.cct);
    }
}
