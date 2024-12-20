public class verticalOrderTraversal{
        public List<List<Integer>> verticalTraversal(TreeNode root) {
            // A TreeMap to store nodes grouped by their vertical (y-coordinate)
            TreeMap<Integer, TreeMap<Integer, PriorityQueue<Integer>>> map = new TreeMap<>();

            traverse(root, 0, 0, map);


            List<List<Integer>> result = new ArrayList<>();
            for (TreeMap<Integer, PriorityQueue<Integer>> ys : map.values()) {
                List<Integer> vertical = new ArrayList<>();
                for (PriorityQueue<Integer> nodes : ys.values()) {
                    while (!nodes.isEmpty()) {
                        vertical.add(nodes.poll());
                    }
                }
                result.add(vertical);
            }

            return result;
        }

        private void traverse(TreeNode node, int x, int y, TreeMap<Integer, TreeMap<Integer, PriorityQueue<Integer>>> map) {
            if (node == null) return;
            map.putIfAbsent(y, new TreeMap<>());
            map.get(y).putIfAbsent(x, new PriorityQueue<>());
            map.get(y).get(x).offer(node.val);


            traverse(node.left, x + 1, y - 1, map);
            traverse(node.right, x + 1, y + 1, map);
        }
    }

