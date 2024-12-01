public class levelOrderTraversal {

//    Java soln using Recursion without any queue:

    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> ans = new ArrayList<>();
        travel(0, root, ans);
        return ans;
    }

    private void travel(int level, TreeNode cur, List<List<Integer>> ans) {
        if (cur == null) return;
        // add another list only when we visit a new level for the first time
        if (level >= ans.size())
            ans.add(new ArrayList<>());

        ans.get(level).add(cur.val);    // get the list of that level add the node val to it

        travel(level + 1, cur.left, ans);
        travel(level + 1, cur.right, ans);
    }



    //with using the queue data structure

    /**
     * Definition for a binary tree node.
     * public class TreeNode {
     *     int val;
     *     TreeNode left;
     *     TreeNode right;
     *     TreeNode() {}
     *     TreeNode(int val) { this.val = val; }
     *     TreeNode(int val, TreeNode left, TreeNode right) {
     *         this.val = val;
     *         this.left = left;
     *         this.right = right;
     *     }
     * }
     */
    class Solution {
        public List<List<Integer>> levelOrder(TreeNode root) {
            List<List<Integer>> ans= new ArrayList<>();

            if(root==null){
                return ans; // return empty list
            }

            Queue<TreeNode> q = new LinkedList<>();
            q.add(root);
            q.add(null);

            List<Integer> currentLevel = new ArrayList<>(); // to store the nodes of a particular level

            while(!q.isEmpty()){
                TreeNode currNode=q.remove();

                if(currNode==null){
                    // end of the current level
                    ans.add(new ArrayList<>(currentLevel)); // add the current level to the result
                    currentLevel.clear();

                    if(q.isEmpty()){
                        break;

                    }
                    else{
                        q.add(null);
                    }
                }
                else{
                    // currNode!=null
                    currentLevel.add(currNode.val);
                    if(currNode.left!=null){
                        q.add(currNode.left);
                    }
                    if(currNode.right!=null){
                        q.add(currNode.right);
                    }
                }
            }
            return ans;


        }
    }
}
