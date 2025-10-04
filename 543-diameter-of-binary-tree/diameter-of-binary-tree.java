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

    public static int height(TreeNode root){
        if(root == null){
            return 0;
        }
        int leftHeight = height(root.left);
        int rightHeight = height(root.right);
        return Math.max(leftHeight,rightHeight) + 1;
    }
    public int diameterOfBinaryTree(TreeNode root) {
        if(root == null){
            return 0;
        }
        int leftdiameter = diameterOfBinaryTree(root.left);
        int leftHeight = height(root.left);
        int rightdiameter = diameterOfBinaryTree(root.right);
        int rightHeight = height(root.right);
        int selfDiameter = leftHeight + rightHeight;
        return Math.max(selfDiameter,Math.max(leftdiameter,rightdiameter));
    }
}