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
    int cnt=0;
    public int pathSum(TreeNode root, int targetSum) {
        helper(root,targetSum,new ArrayList<>());
        return cnt;
    }

    public void helper(TreeNode root,int target , ArrayList<Integer>path)
    {
        if(root==null)
        {
            return;
        }

        path.add(root.val);
        long sum=0;
        for(int i=path.size()-1;i>=0;i--)
        {
            sum+=path.get(i);
            if(sum==target) cnt++;
        }

        helper(root.left,target,path);
        helper(root.right,target,path);

        path.remove(path.size()-1);//backtrack
        
    }
}