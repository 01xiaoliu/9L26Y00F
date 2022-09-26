package Test_9_26;

import java.util.Scanner;

public class Y26_F {
    public static void main(String[] args) {
        //System.out.println("请输入0——10表示自己的时髦程度:");
        Scanner sc =new Scanner(System.in);
        System.out.println("请输入0——10表示自己的时髦程度:");
        int myfashion =sc.nextInt();
        System.out.println("请输入0——10表示她的时髦程度:");
        int hefashion =sc.nextInt();
        boolean duibi =myfashion>hefashion;
        if (duibi==false){
            System.out.println("相亲大概率失败了！");
        }else
        System.out.println("相亲大概率成功，还需努力！");
    }
}
