public class SameTree {


        public boolean isSameTree(TreeNode p, TreeNode q) {
            return isSame(p, q);
        }

        private boolean isSame(TreeNode p, TreeNode q) {
            // Both trees are null
            if (p == null && q == null) return true;
            // one tree is null other is not
            if (p == null || q == null) return false;
            if (p.val != q.val) return false;
            return isSame(p.left, q.left) && isSame(p.right, q.right);
        }
    

}
