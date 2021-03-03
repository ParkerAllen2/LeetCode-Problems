package MediumProblems;

public class GreaterSumTree {
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
    Runtime: 0ms 100%
    Memory: 36MB 65%
    */
    /**
    int sum = 0;
    public TreeNode bstToGst(TreeNode root) {
        if(root == null) return root;

        greaterSum(root.right);
        root.val += sum;
        sum = root.val;
        greaterSum(root.left);
        return root;
    }
     */
}
