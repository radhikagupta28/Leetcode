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
    public boolean flipEquiv(TreeNode root1, TreeNode root2) {
        return solve(root1,root2);
    }
    public boolean solve(TreeNode r1,TreeNode r2){
        if(r1==null && r2==null){
            return true;
        }
        if(r1==null || r2==null || (r1.val!=r2.val)){
            return false;
        }

        return (solve(r1.left,r2.left)&&solve(r1.right,r2.right)) || (solve(r1.left,r2.right)&& solve(r1.right,r2.left));
    }
}