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
    public void preOrderTraversalSequence(TreeNode node, StringBuilder s) {
        if(node == null) {
            s = s.append(",null");
            return;
        }

        s.append("," + node.val);
        preOrderTraversalSequence(node.left, s);
        preOrderTraversalSequence(node.right, s);
    }

    public boolean isSubtree(TreeNode root, TreeNode subRoot) {
        StringBuilder a = new StringBuilder("");
        StringBuilder b = new StringBuilder("");
        preOrderTraversalSequence(root, a);
        preOrderTraversalSequence(subRoot, b);
        return a.indexOf(b.toString()) >= 0;
    }
}
