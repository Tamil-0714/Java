public class Tree {
    Node root;

    private class Node {
        int key;
        int height;
        Node left, right;

        Node(int key) {
            this.key = key;
            left = right = null;
            height = 0;
        }
    }

    Tree(int data) {
        root = new Node(data);
    }

    private Node insert(Node root, int data) {
        if (root == null)
            return new Node(data);
        if (data < root.key)
            root.left = insert(root.left, data);
        else if (data > root.key)
            root.right = insert(root.right, data);
        else
            return root;
        root.height = 1 + max(getHeight(root.left), getHeight(root.right));
        int balFactor = getBalanceFactor(root);
        // LL case
        if (balFactor > 1 && data < root.left.key) {
            return rightRotate(root);
        }
        // LR case
        if (balFactor > 1 && data > root.left.key) {
            root.left = leftRotate(root.left);
            return rightRotate(root);
        }
        // RR case
        if (balFactor < -1 && data > root.right.key) {
            return leftRotate(root);
        }
        // RL case
        if (balFactor < -1 && data < root.right.key) {
            root.right = rightRotate(root.right);
            return leftRotate(root);
        }
        return root;
    }

    private Node rightRotate(Node node) {
        Node left = node.left;
        Node leftRight = left.right;

        left.right = node;
        node.left = leftRight;

        node.height = 1 + max(getHeight(node.left), getHeight(node.right));
        left.height = 1 + max(getHeight(left.left), getHeight(left.right));

        return left;
    }

    private Node leftRotate(Node node) {
        Node right = node.right;
        Node rightLeft = right.left;

        right.left = node;
        node.right = rightLeft;

        node.height = 1 + max(getHeight(node.left), getHeight(node.right));
        right.height = 1 + max(getHeight(right.left), getHeight(right.right));

        return right;
    }

    private int getBalanceFactor(Node node) {
        if (node == null)
            return 0;
        return getHeight(node.left) - getHeight(node.right);
    }

    private void inOrderTraversal(Node root) {
        if (root != null) {
            inOrderTraversal(root.left);
            System.out.print(root.key + " ");
            inOrderTraversal(root.right);
        }
    }

    private int findParent(Node root, int val) {
        if (root == null)
            return -1;
        if ((root.left != null && root.left.key == val) || (root.right != null && root.right.key == val)) {
            return root.key;
        }
        int leftResult = findParent(root.left, val);
        int rightResult = findParent(root.right, val);
        if (leftResult != -1)
            return leftResult;
        if (rightResult != -1)
            return rightResult;
        return -1;
    }

    private Node deleteNode(Node node, int val) {
        if (root == null)
            return root;
        if (val < node.key)
            node.left = deleteNode(node.left, val);
        else if (val > node.key)
            node.right = deleteNode(node.right, val);
        else {
            if (node.left == null)
                return node.right;
            else if (node.right == null)
                return node.left;
            node.key = minTreeVal(node.right);
            node.right = deleteNode(node.right, node.key);
        }
        return node;
    }

    private int minTreeVal(Node node) {
        int minval = node.key;
        while (node.left != null) {
            minval = node.left.key;
            node = node.left;
        }
        return minval;
    }

    private void printLevel(Node node, int level) {
        if (node == null)
            return;
        if (level == 1)
            System.out.print(node.key + " ");
        else if (level > 1) {
            printLevel(node.left, level - 1);
            printLevel(node.right, level - 1);
        }
    }

    private int getHeight(Node node) {
        if (node == null)
            return -1;
        return node.height;
    }

    private int max(int x, int y) {
        return x > y ? x : y;
    }

    public void insert(int data) {
        root = insert(root, data);
    }

    public void inOrderTraversal() {
        inOrderTraversal(root);
    }

    public int findParent(int val) {
        return findParent(root, val);
    }

    public void levelOrderTraversal() {
        int height = getHeight(root)+1;
        for (int i = 1; i <= height; i++) {
            printLevel(root, i);
        }
    }
    public void testLvl(){
        System.out.print(root.key + ",");
        System.out.print(root.left.key + ",");
        System.out.print(root.right.key + ",");
        // System.out.print(root.left.left.key + ",");
        System.out.print(root.left.right.key + ",");
        System.out.print(root.right.left.key + ",");
        System.out.print(root.right.right.key + ",");
        System.out.print(root.right.left.right.key + ",");
    }

    public void deleteNode(int val) {
        root = deleteNode(root, val);
    }

}

/*
 * 
 * 
 * private int getHeight(Node node) {
 * if (node == null)
 * return 0;
 * else {
 * int leftHeight = getHeight(node.left);
 * int rightHeight = getHeight(node.right);
 * if (leftHeight > rightHeight)
 * return (leftHeight + 1);
 * else
 * return (rightHeight + 1);
 * }
 * }
 * if (root != null) {
 * if(lvl == 0)
 * System.out.print(root.key + " ");
 * else
 * System.out.print(root.key + " ");
 * if(root.left != null)
 * lvlDisplay(root.left, lvl-1);
 * if(root.right != null)
 * lvlDisplay(root.right, lvl-1);
 * }
 * 
 * def level_order_recursive(node, level=0):
 * if node is not None:
 * if level == 0:
 * print(node.val) # Print the node value for the current level
 * else:
 * print(node.val, end=' ') # Print the node value
 * 
 * if node.left is not None:
 * level_order_recursive(node.left, level-1)
 * if node.right is not None:
 * level_order_recursive(node.right, level-1)
 * 
 * 
 */
