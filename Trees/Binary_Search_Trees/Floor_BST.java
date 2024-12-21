package Binary_Search_Trees;

public class Floor_BST {
   
        private static int floor;
        public static int floor(Node root, int x) {

            floor = -1;
            search(root, x);
            return floor;
        }

        private static void search(Node node, int value) {
            if (node == null) {
                return;
            }
            if (node.data == value) {
                floor = node.data;
                return;
            }
            if (node.data > value) {
                search(node.left, value);
            } else {
                floor = node.data;
                //if we are looking in the right subtree where values are greater,
                //each node is a candidate for the floor, so we keep updating the value 
                //until we get the best candidate.
                search(node.right, value);
            }
        }
    }
