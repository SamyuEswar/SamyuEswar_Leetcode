class Solution {
    public int minDepth(TreeNode root) {
        int ml,mr;
        if(root==null) return 0;
        if(root.right==null && root.left==null) return 1;
        if(root.left==null) 
        {
            return minDepth(root.right)+1;
        }
        if(root.right==null){
            return minDepth(root.left)+1;
        }
        ml=minDepth(root.left);
        mr=minDepth(root.right);
        return Math.min(mr,ml)+1;
    }
}