package com.cyh.structural.composite.pattern;

/**
 * Created by Administrator on 2017/12/11.
 */
public class TreeTest {

    public static void main(String[] args) {
        TreeNode nodeB = new TreeNode("B");
        TreeNode nodeC = new TreeNode("C");
        nodeB.add(nodeC);

        Tree tree = new Tree("A");
        tree.root.add(nodeB);

        System.out.println("build the tree finished!");
    }
}
