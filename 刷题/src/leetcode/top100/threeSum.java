package leetcode.top100;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class threeSum {
    public List<List<Integer>> threeSum(int[] nums) {

        List<List<Integer>> list = new ArrayList<>();
        Arrays.sort(nums);
        for(int k =0 ; k < nums.length-2 ;k++){
            if(nums[k] > 0) break;
            if(k>0 && nums[k] == nums[k-1]) continue;
            int i = k+1; int j = nums.length - 1; int sum=0;
            while(i < j){
                sum =nums[k]+nums[i]+nums[j];
                if(sum > 0){
                    while(i<j && nums[j]==nums[--j]);
                }else if(sum < 0){
                    while(i<j && nums[i]==nums[++i]);
                }else{
                    list.add(new ArrayList<Integer>(Arrays.asList(nums[k],nums[i],nums[j])));
                    while(i<j && nums[j]==nums[--j]);
                    while(i<j && nums[i]==nums[++i]);
                }
            }
        }
        return list;
    }
}
