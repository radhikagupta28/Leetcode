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
    public int goodNodes(TreeNode root) {
        if(root==null){
            return 0;
        }
        int ans=solve(root,root.val);
        return ans;
    }

    public int solve(TreeNode root,int x){
        if(root==null){
            return 0;
        }

        int cnt=(x<=root.val)?1:0;
        cnt+=solve(root.left,Math.max(x,root.val));
        cnt+=solve(root.right,Math.max(x,root.val));

        return cnt;

    }
}