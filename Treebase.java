import java.util.*;

class Treebase {
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
}
