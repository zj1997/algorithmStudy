package 剑指offer;

//跳青蛙
public class practice10_2 {

    public int JumpFloor(int target) {

        if(target == 1){
            return 1;
        }

        if(target == 2){
            return 2;
        }

        return JumpFloor(target -1) +JumpFloor(target -2);
    }



}
