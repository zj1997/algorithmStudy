package leetcode.tree;

public class maxDepth {

    class TreeNode2 {
        int val;
       TreeNode2 left;
        TreeNode2 right;
        TreeNode2(int x) { val = x; }
    }

    public int maxDepth(TreeNode2 root) {

        if(root == null){
            return 0;
        }

        return Math.max( maxDepth(root.left) , maxDepth(root.right))+1;
    }

}
