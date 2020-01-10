package 剑指offer;
import java.util.*;
public class practice11 {

//    public int minNumberInRotateArray(int [] array) {
//
//        int l = 0,h=array.length-1;
//
//        if(array.length == 0){
//            return 0;
//        }
//
//        while(l <h){
//            int mid = (l+h)/2;
//
//            if(array[l] == array[mid] && array[mid] == array[h]){
//                return minNumber(array,l,h);
//            }else if(array[mid] <=array[h]){
//                h = mid;
//            }else {
//                l = mid +1;
//            }
//        }
//          return array[l];
//    }
//
//    private int minNumber(int[] array, int l, int h) {
//        for(int i = l;i < h;i++){
//            if(array[i] > array[i+1]){
//                return array[i+1];
//            }
//        }
//              return array[l];
//    }

    //小米笔试题
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int m = 0;
            int[] array = new int[1000000];
            while(sc.hasNext()) {
                array[m ++] = sc.nextInt();
            }

            int l = 0,h=m-1;

            while(l <h){
                int mid = (l+h)/2;

                if(array[l] == array[mid] && array[mid] == array[h]){
                    h=h-1;
                }else if(array[mid] <=array[h]){
                    h = mid;
                }else {
                    l = mid +1;
                }
            }
            System.out.println(array[l]);
        }
}
