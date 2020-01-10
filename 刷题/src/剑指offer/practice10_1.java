package 剑指offer;

//斐波拉切数列
public class practice10_1 {


    public Integer fibnate(int n){

        if(n == 0){
            return 0;
        }else if(n == 1 || n == 2){
            return 1;
        }
        return fibnate(n - 1) + fibnate(n - 2);
    }




}
