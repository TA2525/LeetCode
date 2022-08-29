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
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> ans = new ArrayList<Integer>();
        loop(root, ans);
        return ans;
    }
    
    public void loop(TreeNode root, List<Integer> ans) {
        if (root == null) {
            return;
        }
        loop(root.left, ans);
        loop(root.right, ans);
        ans.add(root.val);
    }
}