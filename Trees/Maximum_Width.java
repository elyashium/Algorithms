class Solution {

    class Pair{
        TreeNode node;
        int num;
        Pair(TreeNode _node, int _num){
            node = _num;
            num = _num;
        }
    }

    public int widthOfBinaryTree(TreeNode root) {
        if (root == null ) return;
        Queue<Pair> q = new LinkedList()<>;
        q.offer(new Pair(root,0));

        while(!q.isEmpty()){
            int size = q.size();
            int min = q.peek.num; 

        }
    }
}
