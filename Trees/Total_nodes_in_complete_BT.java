public class Total_nodes_in_complete_BT {

        public int countNodes(TreeNode root) {
            //noraml O(N) apporach
            if(root == null) return 0;

            int left = countNodes(root.left);
            int right = countNodes(root.right);
            return 1 + left + right;


        }

//    This approach leverages the property of a complete binary tree:
//    In a complete binary tree, if you know the height of one side (left or right), you can calculate the number of nodes directly.
//    Instead of traversing every node, it performs logarithmic work at each level, making it O(log² N), which is much faster than O(N) for large trees.
        
        
        int height(TreeNode root) {
            return root == null ? -1 : 1 + height(root.left);
        }

        public int countNodes(TreeNode root) {
            int h = height(root); // Compute the height of the leftmost path
            return h < 0 ? 0 :
                    height(root.right) == h - 1 ? (1 << h) + countNodes(root.right)
                            : (1 << h - 1) + countNodes(root.left);
        }

}
