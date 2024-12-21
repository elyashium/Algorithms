public class RootToLeafPath {


        public static ArrayList<ArrayList<Integer>> Paths(Node root) {
            ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
            dfs(root, ans, new ArrayList<>());
            return ans;
        }

        public static void dfs(Node root,  ArrayList<ArrayList<Integer>> ans, ArrayList<Integer> temp ){
            if(root == null) return;

            temp.add(root.data);

            if(root.left == null && root.right == null){
                ans.add(new ArrayList<>(temp));
            }

            if(root.left != null) dfs(root.left, ans, temp);
            if(root.right != null) dfs(root.right, ans, temp);

            //backtrack to remove the current added node.

            temp.remove( temp.size()-1);
        }
    }

