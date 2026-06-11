import java.util.*;

public class Treeupdate {
    public static void main(String[] args) {

        Tree tree = new Tree(1);

        TreeNode root = tree.root;

        tree.addChild(root, 2);
        tree.addChild(root, 3);
        tree.addChild(root, 4);

        tree.addChild(root.children.get(0), 5);
        tree.addChild(root.children.get(0), 6);

        tree.addChild(root.children.get(1), 7);

        System.out.println("Before Update:");
        tree.display(tree.root);

        tree.update(tree.root, 7, 70);

        System.out.println("\nAfter Update:");
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

    // Add Child
    void addChild(TreeNode parent, int data) {
        TreeNode newNode = new TreeNode(data);
        parent.children.add(newNode);
    }

    // Update Node
    void update(TreeNode node, int oldData, int newData) {
        if (node == null)
            return;

        if (node.data == oldData) {
            node.data = newData;
            return;
        }

        for (TreeNode child : node.children) {
            update(child, oldData, newData);
        }
    }

    // Display Tree
    void display(TreeNode node) {
        if (node == null)
            return;

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