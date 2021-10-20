public class MAC286Tree {
    private class Node {
        int key;
        int iData;
        Node left, right;

        Node(int k, int d) {
            key = k;
            iData = d;
            left = right = null;
        }
    }

    private Node Root;
    private int nElements;

    public MAC286Tree() {
        Root = null;
        nElements = 0;
    }

    public void insertLoop(int k, int d) {
        // make a node
        Node N = new Node(k, d);
        nElements++;
        if (Root == null) {
            Root = N;
            return;
        }
        Node link = Root;
        while (true) {
            if (N.key < link.key && link.left == null) {
                link.left = N;
                return;
            }
            if (N.key >= link.key && link.right == null) {
                link.right = N;
                return;
            }
            if (N.key < link.key) {
                link = link.left;
                continue;
            } else
                link = link.right;
        }
    }

    public void insert(int k, int d) {
        // make the node
        Node N = new Node(k, d);
        nElements++;
        if (Root == null)
            Root = N;
        else
            insertR(N, Root);
    }

    private void insertR(Node N, Node R) {
        if (N.key < R.key && R.left == null) {
            R.left = N;
            return;
        } else if (N.key >= R.key && R.right == null) {
            R.right = N;
            return;
        } else if (N.key < R.key)
            insertR(N, R.left);
        else
            insertR(N, R.right);

    }

    public void visit(Node N) {
        System.out.println("(" + N.key + ",  " + N.iData + ")");
    }

    public void InOrder() {
        TraverseInOrder(Root);
    }

    public void TraverseInOrder(Node R) {
        if (R.left != null)
            TraverseInOrder(R.left);
        visit(R);
        if (R.right != null)
            TraverseInOrder(R.right);
    }

    public void PreOrder() {
        TraversePreOrder(Root);
    }

    public void TraversePreOrder(Node R) {
        visit(R);
        if (R.left != null)
            TraversePreOrder(R.left);
        if (R.right != null)
            TraversePreOrder(R.right);
    }

    public void PostOrder() {
        TraversePostOrder(Root);
    }

    public void TraversePostOrder(Node R) {
        if (R.left != null)
            TraversePostOrder(R.left);
        if (R.right != null)
            TraversePostOrder(R.right);
        visit(R);
    }

    public void Delete(int k) {
        // find the nodeToDelete of the node to delete.
        nElements--;

        // look for the node to delete
        Node nodeToDelete = Root;
        Node tempP = nodeToDelete;
        while (nodeToDelete.key != k) {
            tempP = nodeToDelete;
            if (k < nodeToDelete.key && nodeToDelete.left != null) {
                nodeToDelete = nodeToDelete.left;
            } else if (k >= nodeToDelete.key && nodeToDelete.right != null) {
                nodeToDelete = nodeToDelete.right;
            } else {
                System.out.println("Error key not found!");
                return;
            }
        }
        // nodeToDelete is the node to remove.
        if (nodeToDelete.left == null && nodeToDelete.right == null) {
            if (nodeToDelete == Root) {
                Root = null;
                return;
            }
            // remove a node with no children
            if (tempP.key < nodeToDelete.key) {
                tempP.right = null;
            } else {
                tempP.left = null;
            }
            return;
        } else if (nodeToDelete.left != null) {
            // find successor on the left, the nodeToDelete of the sucessor.
            // go left, then keep going right.
            if (nodeToDelete.left.right == null) {
                nodeToDelete.key = nodeToDelete.left.key;
                nodeToDelete.iData = nodeToDelete.left.iData;
                nodeToDelete.left = nodeToDelete.left.left;
            } else {
                Node successor = nodeToDelete.left;
                Node successorParent = nodeToDelete;
                while (successor.right != null) {
                    successorParent = successor;
                    successor = successor.right;
                }
                // nodeToDelete is the node to remove
                // successor is the node replace with
                // successorParent is the parent of the successor
                nodeToDelete.key = successor.key;
                nodeToDelete.iData = successor.iData;
                successorParent.right = successor.left;
            }
        } else {// no child on the left find the successor on the right
                // go to right then keep going to left
            if (nodeToDelete.left.right == null) {
                nodeToDelete.key = nodeToDelete.left.key;
                nodeToDelete.iData = nodeToDelete.left.iData;
                nodeToDelete.left = nodeToDelete.left.left;
            } else {
                Node successor = nodeToDelete.right;
                Node successorParent = nodeToDelete;
                while (successor.left != null) {
                    successorParent = successor;
                    successor = successor.left;
                }
                // nodeToDelete is the node to remove
                // successor is the node replace with
                // successorParent is the parent of the successor (left)
                nodeToDelete.key = successor.key;
                nodeToDelete.iData = successor.iData;
                successorParent.left = successor.right;
            }
        }
    }
}