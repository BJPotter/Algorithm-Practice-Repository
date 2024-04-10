package com.potter.tree;

import java.util.*;

/**
 * Author: Zhi Liu
 * Date: 2024/4/9 9:48
 * Contact: liuzhi0531@gmail.com
 * Desc:
 */
public class Bfs {
    public static void main(String[] args) {
        //Init TreeNode
       TreeNode root = InitTreeNode.getTreeNode();
       //Build stack first in last out
       Queue<TreeNode> queue = new LinkedList<>();
       //Save TreeNode value
       List<Integer> list = new ArrayList<>();
       queue.offer(root);
       while (!queue.isEmpty()){
           //get current Node & add value to list
           TreeNode currNode = queue.poll();
           list.add(currNode.val);
           if(currNode.leftNode != null){
               queue.offer(currNode.leftNode);
           }
           if(currNode.rightNode != null){
               queue.offer(currNode.rightNode);
           }
       }
       list.forEach(System.out::println);
    }
}
