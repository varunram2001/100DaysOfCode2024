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
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> lst = new ArrayList<>();
        List<Integer> lst2;
        List<Integer> lst3;

        if (root == null) {
        return lst;
        }
        lst.add(root.val);
        lst2 = preorderTraversal(root.left);
        lst3 = preorderTraversal(root.right);
        for (int i:lst2) {
            lst.add(i);
        }
        for (int i:lst3) {
            lst.add(i);
        }
        
        
        return lst;
        
    }
}