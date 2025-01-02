public class LowestCommonAncestor {

        public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
            if(root == null || p == root || q == root){
                return root;
            }

            TreeNode left = lowestCommonAncestor(root.left, p, q);
            TreeNode right = lowestCommonAncestor(root.right, p, q);

            //if we get both sides null, that means there is no common ancestor.

            if(left == null){
                return right;
            }
            else if(right == null){
                return left;
            }

            //if both are not null, then that means the nodes that came back are under
            //current node and the current node again goes to the root and if left is null and current node is returned
            //is from right, from both these the right current node is returned as the ans and the recursion ends.

                    
            else{
                return root;
            }

        }
    }
