public class BalanacedBinaryTree {

//    A height-balanced binary tree is a binary tree in which
//    the depth of the two subtrees of every node never differs by more than one.
    // left depth - right depth <= 1
    //either zero or one, to see if the tree is not skewed to one side.


        public boolean isBalanced(TreeNode root) {
            int result = checkHeight(root);
            if (result == -1) {
                return false;
            }

            return true;
        }

        private int checkHeight(TreeNode node) {
            if (node == null)
                return 0;

            int leftHeight = checkHeight(node.left);
            if (leftHeight == -1)
                return -1;

            int rightHeight = checkHeight(node.right);
            if (rightHeight == -1)
                return -1;

            if (Math.abs(leftHeight - rightHeight) > 1)
                return -1;

            // height of the current node
            return Math.max(leftHeight, rightHeight) + 1;
        }
    }

