public class diameterBinaryTree {

    //the diameter of a binary tree is the length of the longest path between two nodes,
    //this path may or may not pass from the root.

    //The length of a path between two nodes is represented by the number of edges between them.

        int res = 0;

        public int diameterOfBinaryTree(TreeNode root) {
            dfs(root);
            return res;
        }

        private int dfs(TreeNode root) {
            if (root == null) {
                return 0;
            }

            int leftDepth = dfs(root.left);
            int rightDepth = dfs(root.right);

            res = Math.max(res, leftDepth + rightDepth);

            return 1 + Math.max(leftDepth, rightDepth);
        }
    }

