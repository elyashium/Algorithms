class Solution {
    public void traversal(TreeNode root, List<Integer> res){
        if (root != null){
            traversal(root.left, res);
            traversal(root.right, res);
            res.add(root.val);
        }
    }

    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        traversal(root, res);
        return res;
    }
}


//iterative approach using 2 stack.

class solution{
    public List<Integer> postOrderTraversal(TreeNode root){
        Stack<Treenode> st1 = new Stack<>();
        Stack<TreeNode> st2 = new Stack<>();
        ArrayList<Integer> ans = new List<>();
        
        if(root == null) return ans;
        
        st1.push(root);
        while(!st1.isEmpty()){
            root = st1.pop();
            st2.add(root);
            
            if(root.left != null) st1.push(root.left);
            if(root.right != null) st1.push(root.right);
            
        }
        
        while(!st2.isEmpty()){
            ans.add(st2.pop().val);
        }
        
        return ans;
    }
}
