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
class Solution {
    public int sum=0;
    public int findTilt(TreeNode root)
    {
        if(root==null){
            return 0;
        }

        solve(root);
        return sum;
    }
    public int solve(TreeNode root) {
        if(root==null)
        {
            return 0;
        }
        
        
        int left=solve(root.left);
        int right=solve(root.right);
        sum+=Math.abs(left-right);
        return left+right+root.val;
    }
}