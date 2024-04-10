package com.potter.tree;

import java.util.ArrayList;
import java.util.List;

/**
 * Author: Zhi Liu
 * Date: 2024/4/9 10:26
 * Contact: liuzhi0531@gmail.com
 * Desc:
 */
public class Dfs {
    List<Integer> list = new ArrayList<>();
    /**
     * root -> left -> right
     * @return
     */
    public void preOrder(TreeNode root){
        if(root == null){
            return;
        }
        list.add(root.val);
        preOrder(root.leftNode);
        preOrder(root.rightNode);
    }

    /**
     * left -> root -> right
     * @return
     */
    public void inOrder(TreeNode root){
        if(root == null){
            return;
        }
        inOrder(root.leftNode);
        list.add(root.val);
        inOrder(root.rightNode);
    }

    /**
     * left -> right -> root
     * @return
     */
    public void postOrder(TreeNode root){
        if(root == null){
            return;
        }
        postOrder(root.leftNode);
        postOrder(root.rightNode);
        list.add(root.val);
    }

    public void dfs(String way,TreeNode root){
        if(root == null){
            return;
        }
        if(way.equals("pre")) list.add(root.val);
        dfs(way,root.leftNode);
        if(way.equals("in")) list.add(root.val);
        dfs(way,root.rightNode);
        if(way.equals("post")) list.add(root.val);

    }

    public static void main(String[] args) {
        //Init TreeNode
        TreeNode root = InitTreeNode.getTreeNode();
        Dfs dfs = new Dfs();
        dfs.preOrder(root);
        dfs.list.forEach(System.out::print);
        System.out.println();
        dfs.list.clear();
        dfs.inOrder(root);
        dfs.list.forEach(System.out::print);
        System.out.println();
        dfs.list.clear();
        dfs.postOrder(root);
        dfs.list.forEach(System.out::print);
        System.out.println();
        dfs.list.clear();
        dfs.dfs("pre",root);
        dfs.list.forEach(System.out::print);
    }
}
