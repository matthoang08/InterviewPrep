public class MattTest {
    public static void main(String[] args) {
        long[] arr = { 3, 6, 2, 9, -1, 10 };
        
        Tree tree = new Tree();
        tree.root = addNode(arr, tree.root, 0);

        System.out.println("root: " + tree.root);
        
        printTreeInOrder(tree.root);
        System.out.println("sum left: " + sumNode(tree.root.left, 0));
    }
    
    private static long sumNode(Node node, long sum) {
        
        if (node != null) {
            sum = sumNode(node.left, sum) + sumNode(node.right, sum) + (node.value > 0 ? node.value : 0);
        }
        return sum;
    }
    
    private static void printTreeInOrder(Node node) {
        if (node != null) {
            printTreeInOrder(node.left);
            System.out.println(node.value);
            printTreeInOrder(node.right);
        }
    }
    
    private static Node addNode(long[] arr, Node node, int index) {
        if ( index < arr.length ) {
            node = new Node(arr[index]);
            node.left = addNode(arr, node.left, 2 * index + 1);
            node.right = addNode(arr, node.right, 2 * index + 2);
        }
        
        return node;
    }
}

class Tree {
    Node root;
}

class Node {
    long value;
    Node right;
    Node left;
    
    Node(long value) {
        this.value = value;
        this.right = null;
        this.left = null;
    }
}