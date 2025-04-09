/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public List<Integer> distanceK(TreeNode root, TreeNode target, int k) {
        List<Integer>res=new ArrayList<>();
        Map<TreeNode,TreeNode>mp=new HashMap<>();
        buildMap(mp,root,null);
        Set<TreeNode>vis=new HashSet<>();
        dfs(target,mp,res,k,vis);

        return res;
    }

    public void buildMap(Map<TreeNode,TreeNode>mp,TreeNode child,TreeNode par){

        if(child==null){
            return;
        }

        mp.put(child,par);

        buildMap(mp,child.left,child);
        buildMap(mp,child.right,child);
    }

    public void dfs(TreeNode target,Map<TreeNode,TreeNode>mp,List<Integer>res,int k,Set<TreeNode>vis){

        if(target==null || vis.contains(target)){
            return;
        }
        vis.add(target);
        if(k==0){
            res.add(target.val);
            return;
        }

        dfs(target.left,mp,res,k-1,vis);
        dfs(target.right,mp,res,k-1,vis);
        dfs(mp.get(target),mp,res,k-1,vis);

    }
}