class Node {
    int value;
    int height;
    Node left;
    Node right;

    public Node(int value) {
        this.value = value;
        this.height = 1;
        this.left = null;
        this.right = null;
    }
}

class AVLTree {
    private Node root;

    public void insert(int value) {
        root = insertNode(root, value);
    }

    private Node insertNode(Node node, int value) {
        if (node == null) {
            return new Node(value);
        }

        if (value < node.value) {
            node.left = insertNode(node.left, value);
        } else if (value > node.value) {
            node.right = insertNode(node.right, value);
        } else {
            // Duplicate values are not allowed in AVL trees
            return node;
        }

        // Update height of the current node
        node.height = 1 + Math.max(getHeight(node.left), getHeight(node.right));

        // Check and perform balancing operations if necessary
        int balance = getBalance(node);

        // Left Left Case
        if (balance > 1 && value < node.left.value) {
            return rotateRight(node);
        }

        // Right Right Case
        if (balance < -1 && value > node.right.value) {
            return rotateLeft(node);
        }

        // Left Right Case
        if (balance > 1 && value > node.left.value) {
            node.left = rotateLeft(node.left);
            return rotateRight(node);
        }

        // Right Left Case
        if (balance < -1 && value < node.right.value) {
            node.right = rotateRight(node.right);
            return rotateLeft(node);
        }

        return node;
    }

    private Node rotateRight(Node y) {
        Node x = y.left;
        Node T2 = x.right;

        // Perform rotation
        x.right = y;
        y.left = T2;

        // Update heights
        y.height = 1 + Math.max(getHeight(y.left), getHeight(y.right));
        x.height = 1 + Math.max(getHeight(x.left), getHeight(x.right));

        return x;
    }

    private Node rotateLeft(Node x) {
        Node y = x.right;
        Node T2 = y.left;

        // Perform rotation
        y.left = x;
        x.right = T2;

        // Update heights
        x.height = 1 + Math.max(getHeight(x.left), getHeight(x.right));
        y.height = 1 + Math.max(getHeight(y.left), getHeight(y.right));

        return y;
    }

    private int getHeight(Node node) {
        if (node == null) {
            return 0;
        }

        return node.height;
    }

    private int getBalance(Node node) {
        if (node == null) {
            return 0;
        }

        return getHeight(node.left) - getHeight(node.right);
    }

    private void displayTree(Node node, String indent, boolean isLast) {
        if (node == null) {
            return;
        }

        System.out.print(indent);

        if (isLast) {
            System.out.print(" \\----- ");
            indent += "       ";
        } else {
            System.out.print(" /----- ");
            indent += "|      ";
        }

        System.out.println(node.value);

        displayTree(node.left, indent, false);
        displayTree(node.right, indent, true);
    }

    public void display() {
        displayTree(root, "", false);
    }


}

public class AVLTree_Builder {
    public static void main(String[] args) {
        AVLTree tree = new AVLTree();

        int[] values = {72, 100, 80, 44, 11, 59, 6, 19, 62, 14};

        for (int value : values) {
            tree.insert(value);
        }

        tree.display();
    }
}
