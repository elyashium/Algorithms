public class TopSideView {

   

        static ArrayList<Integer> topView(Node root) {
            ArrayList<Integer> as = new ArrayList<>();
            TreeMap<Integer, Integer> hs = new TreeMap<>();
            Queue<Pair> q = new LinkedList<>();

            if (root == null) return as;

            q.add(new Pair(0, root));

            while (!q.isEmpty()) {
                Pair p = q.remove();
                int temp = p.index;
                Node node = p.node;

                if (!hs.containsKey(temp)) {  // Only add the first node encountered for each vertical level
                    hs.put(temp, node.data);
                }

                if (node.left != null) {
                    q.add(new Pair(temp - 1, node.left));
                }

                if (node.right != null) {
                    q.add(new Pair(temp + 1, node.right));
                }
            }

            for (Map.Entry<Integer, Integer> entry : hs.entrySet()) {
                as.add(entry.getValue());
            }

            return as;
        }

        // Pair class to store index and node
        static class Pair {
            int index;
            Node node;
            Pair(int index, Node node) {
                this.index = index;
                this.node = node;
            }
        }
    }

