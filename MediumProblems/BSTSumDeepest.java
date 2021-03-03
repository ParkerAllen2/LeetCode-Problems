package MediumProblems;

public class BSTSumDeepest {
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
    Memory: 40MB 35%
    */
    /**
    private int sum;
    private int maxLevel;

    public int deepestLeavesSum(TreeNode root) {
        if(root == null) return 0;
        SumLevel(root, 0);
        return sum;
    }

    private void SumLevel(TreeNode node, int level){
        if(node == null) return;
        if(level > maxLevel){
            sum = node.val;
            maxLevel = level;
        }
        else if(level == maxLevel){
            sum += node.val;
        }
        SumLevel(node.left, level + 1);
        SumLevel(node.right, level + 1);
    }
     */
}
