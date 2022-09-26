package Test_9_26;

import java.util.Arrays;

class TT{
    public static int HTTP_OK=200;
    public static int HTTP_ERROR=405;
}
public class Test05 {
    public static void main(String[] args){
        int a=200;
        if (a==TT.HTTP_OK){
            System.out.println("成功的访问");
        }else if (a==TT.HTTP_ERROR){
            System.out.println("无法访问404");
        }
        int[]arr ={1,4,2,5};
        Arrays.sort(arr);//sort排序的java自带方法
        System.out.println(Arrays.toString(arr));
        //MyArrays.sort2(arr);
        //System.out.println(Arrays.toString(arr));
    }
}
