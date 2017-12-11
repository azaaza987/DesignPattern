package com.cyh.structural.composite.pattern;

/**
 * Created by Administrator on 2017/12/11.
 */
public class Tree {

    TreeNode root = null;

    public Tree(String name) {
        root = new TreeNode(name);
    }


}
