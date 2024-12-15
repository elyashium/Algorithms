public class BTmaximumPathSum {

    int res = Integer.MIN_VALUE;

    public int maxPathSum(TreeNode root) {
        dfs(root);
        return res;
    }

    private int dfs(TreeNode root) {
        if (root == null)
            return 0;

        int leftSum = Math.max(0, dfs(root.left)); // math.max to deal with negative number
        int rightSum = Math.max(0, dfs(root.right));

        res = Math.max(res, leftSum + rightSum + root.val);
        return (root.val) + Math.max(leftSum, rightSum);
    }
}
