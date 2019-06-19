package com.acquisio.basic.java.question02;

import java.util.Stack;

/**
 * QUESTION 2: TreeNode
 * Using the tree structure define at
 * http://en.wikipedia.org/wiki/File:Binary_tree.svg,
 * add the code necessary to obtain the following output.
 * ..2
 * ....7
 * ......2
 * ......6
 * ........5
 * ........11
 * ....5
 * ......9
 * ........4
 *
 * IMPORTANT: Add all missing javadoc and/or unit tests that you think is necessary.
 */
public class TreeNavigation {

    public static void main(String[] args) {
        TreeNavigation main = new TreeNavigation();
        main.treeNode();
    }

    private void treeNode() {
        Node n1 = new Node("6", new Node("5"), new Node("11"));
        Node n2 = new Node("7", new Node("2"), n1);
        Node n3 = new Node("9", new Node("4"));
        Node n4 = new Node("5", null, n3);
        Node n = new Node("2", n2, n4);
        int depth = 1;
        nav(n, depth);
    }

    private void nav(Node n, int depth) {
        if (n != null) {
            for (int i = 0; i < depth * 2; i++) {
                System.out.print(".");
            }
            System.out.println(n.name);
            if (n.children != null && n.children.length > 0 && n.children[0] != null) {
                nav(n.children[0], depth + 1);
            }
            if (n.children != null && n.children.length > 1 && n.children[1] != null) {
                nav(n.children[1], depth + 1);
            }
        }
    }
}
