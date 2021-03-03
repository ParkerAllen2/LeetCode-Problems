package EasyProblems;

public class BSTRangeSum {
    /**
     * Definition for a binary tree node.
     * public class TreeNode {
     *     int val;
     *     TreeNode left;
     *     TreeNode right;
     *     TreeNode() {}
     *     TreeNode(int val) { this.val = val; }
     *     TreeNode(int val, TreeNode left, TreeNode right) {
     *         this.val = val;
     *         this.left = left;
     *         this.right = right;
     *     }
     * }
     */
    /*
    Attempt 1
    Runtime: 1ms 52%
    Memory: 46MB 92%
     */
    /**
    public int rangeSumBST(TreeNode root, int low, int high) {
        if(root == null){
            return 0;
        }
        int value = root.val;
        if(value < low || high < value){
            value = 0;
        }
        return value + rangeSumBST(root.left, low, high) + rangeSumBST(root.right, low, high);
    }
     */
    /*
    Attempt 2
    Runtime: 0ms 100%
    Memory: 47 66%
     */
    /**
    public int rangeSumBST(TreeNode root, int low, int high) {
        if(root == null){
            return 0;
        }
        int value = root.val;
        if(value < low)
            return rangeSumBST(root.right, low, high);
        if(value > high)
            return rangeSumBST(root.left, low, high);
        return value + rangeSumBST(root.left, low, high) + rangeSumBST(root.right, low, high);
    }
     */
}
