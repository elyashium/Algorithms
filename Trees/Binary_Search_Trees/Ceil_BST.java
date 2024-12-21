package Binary_Search_Trees;

public class Ceil_BST {

   private static int ceil;

    int findCeil(Node root, int key) {
        if (root == null) return -1;

        ceil = -1; // Reset ceil for each call
        search(root, key); 
        return ceil;
    }

    private static void search(Node node, int value) {
        if (node == null) {
            return;
        }

        if (node.data == value) {
            ceil = node.data; 
            return;
        }

        if (node.data > value) {
            ceil = node.data; // Update ceil
            search(node.left, value); 
        } else {
            search(node.right, value); // No need to update ceil, search in the right subtree
        }
    }
}
