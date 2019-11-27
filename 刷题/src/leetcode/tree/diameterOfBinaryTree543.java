package leetcode.tree;

public class diameterOfBinaryTree543 {

    int max = 0;

    public int diameterOfBinaryTree(TreeNode root) {
        depth(root);
        return max;
    }

    private int depth(TreeNode treeNode){

        if(treeNode == null){
            return 0;
        }

        int left = depth(treeNode.left);
        int right = depth(treeNode.right);

        max = Math.max(left + right,max);    //注意每次max都需要与当前的max更新
        return Math.max(left,right) + 1;    //注意返回值需要+1
    }




}
