package leetcode.tree;

public class isBalanced {

    private boolean flag = true;

    public boolean isBalanced(TreeNode root) {
        MaxDepth(root);
        return flag;
    }

    public int MaxDepth(TreeNode treeNode){

        if(treeNode == null){
            return 0;
        }

        int left = MaxDepth(treeNode.left);

        int right = MaxDepth(treeNode.right);

        if(Math.abs(left - right) >1){
            flag=false;
        }

        return Math.max(left,right) + 1;
    }

}
