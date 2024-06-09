package P14;

public class BinaryTree19 {
    Node19 root;

    public BinaryTree19() {
        root = null;
    }

    boolean isEmpty() {
        return root == null;
    }

    void add(int data) {
        if(isEmpty()) {
            root = new Node19(data);
        } else {
            Node19 current = root;
            while (true) {
                if (data < current.data) {
                    if (current.left != null) {
                        current = current.left;
                    } else {
                        current.left = new Node19(data);
                        break;
                    }
                } else if (data > current.data) {
                    if (current.right != null) {
                        current = current.right;
                    } else {
                        current.right = new Node19(data);
                        break;
                    }
                } else {
                    break;
                }
            }
        }
    }

    boolean find(int data){
        boolean result = false;
        Node19 current = root;
        while (current != null) {
            if (current.data == data) {
                result = true;
                break;
            } else if (data < current.data) {
                current = current.left;
            } else{
                current = current.right;
            }
        }
        return result;
    }

    void tranversePreOrder(Node19 node){
        if (node != null) {
            System.out.print(" " + node.data);
            tranversePreOrder(node.left);
            tranversePreOrder(node.right);
        }
    }

    void tranversePostOrder(Node19 node){
        if (node != null) {
            tranversePreOrder(node.left);
            tranversePreOrder(node.right);
            System.out.print(" " + node.data);
        }
    }

    void tranverseInOrder(Node19 node){
        if (node != null) {
            tranverseInOrder(node.left);
            System.out.print(" " + node.data);
            tranverseInOrder(node.right);
        }
    }

    Node19 getSuccessor(Node19 del){
        Node19 successor = del.right;
        Node19 successorParent = del;
        while (successor.left != null){
            successorParent = successor;
            successor = successor.left;
        }
        if (successor != del.right) {
            successorParent.left = successor.right;
            successor.right = del.right; 
        }
        return successor;
    }

    void delete(int data){
        if (isEmpty()) {
            System.out.println("Tree is empty! ");
            return;
        }

        Node19 parent = root;
        Node19 current = root;
        boolean isLeftChild = false;
        while (current != null){
            if (current.data==data) {
                break;
            } else if (data < current.data) {
                parent = current;
                current = current.left;
                isLeftChild=true;
            } else if (data > current.data) {
                parent = current;
                current = current.right;
                isLeftChild = false;

            }
        }

        if (current == null) {
            System.out.println("Couldn't find data!");
            return;
        } else{
            if (current.left == null && current.right == null) {
                if (current == root) {
                    root = null;
                } else {
                    if (isLeftChild) {
                        parent.left = null;
                    } else{
                        parent.right = null;
                    }
                }
            } else if (current.left == null) {
                if (current==root) {
                    root = current.right;
                } else {
                    if (isLeftChild) {
                        parent.left = current.right;
                    } else{
                        parent.right = current.right;
                    }
                }
            } else if (current.right == null) {
                if (current == root) {
                    root = current.left;
                } else{
                    if (isLeftChild) {
                        parent.left = current.left;
                    }else{
                        parent.right = current.left;
                    }
                }
            } else{
                Node19 successor = getSuccessor(current);
                if (current == root) {
                    root = successor;
                } else{
                    if (isLeftChild) {
                        parent.left = successor;
                    }else{
                        parent.right = successor;
                    }
                    successor.left = current.left;
                }
            }
        }
    }
}