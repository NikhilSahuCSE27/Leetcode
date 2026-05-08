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
    public int rob(TreeNode root){
    int[] res=dfs(root);
    return Math.max(res[0],res[1]);
}
int[] dfs(TreeNode node){
    if(node==null){
        return new int[]{0,0};
    }
    int[] l=dfs(node.left);
    int[] r=dfs(node.right);
    int take=node.val+l[1]+r[1];
    int skip=Math.max(l[0],l[1])+Math.max(r[0],r[1]);
    return new int[]{take,skip};
}
}