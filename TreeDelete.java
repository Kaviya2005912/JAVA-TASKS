import java.util.*;

class TreeDelete {
    public static void main(String[] args) {

        Tree tree = new Tree(1);

        TreeNode root = tree.root;

        tree.addChild(root, 2);
        tree.addChild(root, 3);
        tree.addChild(root, 4);

        tree.addChild(root.children.get(0), 5);
        tree.addChild(root.children.get(0), 6);

        tree.addChild(root.children.get(1), 7);

        System.out.println("Before Deletion:");
        tree.display(tree.root);

        System.out.println("\nDeleting node 2...");
        tree.delete(tree.root, 2);
}
}

class TreeNode {
    int data;
    List<TreeNode> children;

    TreeNode(int data) {
        this.data = data;
        children = new ArrayList<>();
    }
}

class Tree {

    TreeNode root;

    Tree(int data) {
        root = new TreeNode(data);
    }

    // Add child
    void addChild(TreeNode parent, int data) {
        TreeNode newNode = new TreeNode(data);
        parent.children.add(newNode);
    }

    // Display tree
    void display(TreeNode node) { // 5
        if (node == null) return;

        System.out.print(node.data + " -> ");
        for (TreeNode child : node.children) {
            System.out.print(child.data + " ");
        }
        System.out.println();

        for (TreeNode child : node.children) {
            display(child);
        }
    }

    // Delete Node
    boolean delete(TreeNode node, int key) {
    // 3, 7
    if (node == null) return false;

    // Check all children of current node
    for (int i = 0; i < node.children.size(); i++) {

        TreeNode child = node.children.get(i);

        if (child.data == key) {
            node.children.remove(i);   // remove child
            return true;
        }
    }

    // Recursively search in children deeply
    for (TreeNode child : node.children) { // [3,4] //
        if (delete(child, key)) //3,7
            return true;
    }

    return false;
}
}