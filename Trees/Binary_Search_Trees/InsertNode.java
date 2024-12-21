package Binary_Search_Trees;

public class InsertNode {
    
        public TreeNode insertIntoBST(TreeNode root, int val) {
            if(root==null){
                root = new TreeNode(val);
                return root;
            }
            if(val<root.val){
                root.left = insertIntoBST(root.left, val);
            }
            else{
                root.right = insertIntoBST(root.right, val);
            }
            return root;

        }
    }

