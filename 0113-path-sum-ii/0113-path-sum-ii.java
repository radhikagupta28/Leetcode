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
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        List<List<Integer>>ans=new ArrayList<>();
        List<Integer>res=new ArrayList<>();

        dfs(root,targetSum,ans,res);
        return ans;
        
    }
    public void dfs(TreeNode root,int targetSum,List<List<Integer>>ans,List<Integer>res){
        if(root==null){
            return;
        }

        res.add(root.val);
        targetSum-=root.val;
        if(root.left==null && root.right==null && targetSum==0)
        {
            ans.add(new ArrayList<>(res));
        }
        else
        {
            dfs(root.left,targetSum,ans,res);
            dfs(root.right,targetSum,ans,res);
        }

        res.remove(res.size()-1);
    }
}