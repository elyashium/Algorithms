class Solution {
    public List<Integer> preorderTraverse(TreeNode root) {
        ArrayList<Integer> ans = new ArrayList<>(); // to store answers
        preorder(root, ans);
        return ans;
    }

    private void preorder(TreeNode root, List<Integer> ans) {
        if (root == null) {
            return;
        }

        ans.add(root.val); // Add current node's value
        preorder(root.left, ans); // Recursion on left subtree
        preorder(root.right, ans); // Recursion on right subtree
    }
}