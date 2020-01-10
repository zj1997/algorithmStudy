package 笔试题;

import java.util.Arrays;
import java.util.Scanner;

public class topK {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String[] strings = in.nextLine().replace("[","").
                replace("]","").split(",");
        int[] a = new int[strings.length];
        int n = a.length;

        for (int i=0;i<n;i++)
            a[i] = Integer.parseInt(strings[i]);

        topk1(a,n);


    }

    public static void topk1(int[] arr,int n){


        Arrays.sort(arr);  //排序

        //此部分是处理忽略重复数字的第k个数的思路
//        int count = 0;
//        int topk = 0;
//        for(int i = n-1;i>=0;i--){
//
//            if(count ==3){
//                break;
//            }
//
//            if(a[i] == a[i-1]){
//                continue;
//            }else {
//                count++;
//                topk =a[i];;
//            }
//
//        }
        System.out.println(arr[n-3]);
    }

    public static void topk2(int[] arr,int n){

    }

}
