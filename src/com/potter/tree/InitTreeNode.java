package com.potter.tree;

/**
 * Author: Zhi Liu
 * Date: 2024/4/9 9:48
 * Contact: liuzhi0531@gmail.com
 * Desc:
 */
public class InitTreeNode {
    public static TreeNode getTreeNode(){
        TreeNode n1 = new TreeNode(1);
        TreeNode n2 = new TreeNode(2);
        TreeNode n3 = new TreeNode(3);
        TreeNode n4 = new TreeNode(4);
        TreeNode n5 = new TreeNode(5);
        n1.leftNode = n2;
        n1.rightNode = n3;
        n2.leftNode = n4;
        n2.rightNode = n5;
        return n1;
    }
}
