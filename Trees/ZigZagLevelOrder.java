public class ZigZagLevelOrder {



    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> ans = new ArrayList<>();
        travel(0, root, ans);
        return ans;
    }

    private void travel(int level, TreeNode cur, List<List<Integer>> ans) {
        if (cur == null)
            return;

        if (level >= ans.size())
            ans.add(new ArrayList<>());

        if (level % 2 == 0) {
            ans.get(level).add(cur.val);
        } else {
            ans.get(level).add(0, cur.val);
            //zero pushes the inserted value to the right making it traversr zig zag
        }

        travel(level + 1, cur.left, ans);
        travel(level + 1, cur.right, ans);
    }
}