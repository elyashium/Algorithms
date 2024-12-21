package Binary_Search_Trees;

public class DeleteNode {
        public TreeNode deleteNode(TreeNode root, int key) {

            if (root == null) {
                return null;
            }

            if (key < root.val) {
                root.left = deleteNode(root.left, key);
            }

            else if (key > root.val) {
                root.right = deleteNode(root.right, key);
            } else {

                // CASE1: LEAF NODE
                if (root.left == null && root.right == null) {
                    return null;
                }
                // CASE2: 1 CHILD
                if (root.left == null) {
                    return root.right;
                } else if (root.right == null) {
                    return root.left;
                }
                // CASE 3: 2 CHILDERN
                TreeNode IS = findInorder(root.right);
                root.val = IS.val;
                root.right = deleteNode(root.right, IS.val);

            }
            return root;

        }

        public TreeNode findInorder(TreeNode root) {
            while (root.left != null) {
                root = root.left;
            }
            return root;
        }
    }
