package 剑指offer;

//变态跳青蛙
public class practice10_3 {

    public int JumpFloorII(int target) {

        int[] num = new int[100];

        int n = 0;
        num[2] = 2;
        if(target == 0) return 0;
        else if(target == 1) return 1;
        else if(target == 2) return 2;
        else if(target >=3) {
            for(int i = 3 ;i <= target ;i++){
                num[i] = num[i-1] + (int)Math.pow(2,i - 2);
            }
        }
        return num[target];
    }

    public static void main(String[] args) {

        System.out.println(new practice10_3().JumpFloorII(4));


    }


}
