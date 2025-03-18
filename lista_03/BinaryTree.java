package lista_03;

public class BinaryTree<T extends Comparable<T>> {
    private static class Node<T>
    {
        private T data;
        private Node<T> left, right;

        public Node(T data)
        {
            this.data = data;
        }
    }

    private Node<T> root;

    public Node<T> insert(T data)
    {
        Node<T> newNode = new Node<T>(data);
        newNode.left = null;
        newNode.right = null;

        if (this.root == null) {
            this.root = newNode;
            return newNode;
        }

        Node<T> auxNode = this.root;
        Node<T> foundNode = null;
        while (auxNode != null) {
            foundNode = auxNode;

            if (auxNode.data.compareTo(data) > 0) {
                auxNode = auxNode.left;
            } else {
                auxNode = auxNode.right;
            }
        }

        if (foundNode.data.compareTo(data) > 0) {
            foundNode.left = newNode;
        } else {
            foundNode.right = newNode;
        }

        this.root = foundNode;
        return this.root;
    }

    public Node<T> search(T key)
    {
        Node<T> auxNode = this.root;

        while (auxNode != null && auxNode.data.compareTo(key) != 0) {
            if (auxNode.data.compareTo(key) < 0) {
                auxNode = auxNode.right;
            } else {
                auxNode = auxNode.left;
            }
        }

        return auxNode;
    }

    public void inOrderDFS(Node<T> node)
    {
        Node<T> auxNode = node;

        if (auxNode != null) {
            inOrderDFS(auxNode.left);
            System.out.println(auxNode.data);
            inOrderDFS(auxNode.right);
        }
    }

    public static void main(String[] args) {
        BinaryTree<Integer> binaryTree = new BinaryTree<Integer>();
        binaryTree.insert(5);
        binaryTree.insert(8);
        binaryTree.insert(3);

        System.out.println(binaryTree.search(3).data);

        binaryTree.inOrderDFS(binaryTree.root);
    }
}
