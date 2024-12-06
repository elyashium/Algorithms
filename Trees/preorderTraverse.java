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


 //iterative apporach 

class Solution {
    public List<Integer> preorderTraversal(TreeNode root) {

        ArrayList<Integer> ans = new ArrayList<Integer>();
        Stack<TreeNode> st = new Stack<TreeNode>();
        if (root == null) {
            return ans;
        }
        st.push(root);

        while (!st.isEmpty()) {

            root = st.pop();
            ans.add(root.val);

            if (root.right != null) {
                st.push(root.right);
            }

            if (root.left != null) {
                st.push(root.left);

            }
        }
        return ans;

    }
}
