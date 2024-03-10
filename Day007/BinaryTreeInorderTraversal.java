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
    public List<Integer> inorderTraversal(TreeNode root) {
    List<Integer> temp = new ArrayList<>();
    Deque<TreeNode> st = new ArrayDeque<>();

    while (root != null || !st.isEmpty())
     {
      while (root != null) 
      {
        st.push(root);
        root = root.left;
      }
      root = st.pop();
      temp.add(root.val);
      root = root.right;
    }

    return temp;
        
    }
}