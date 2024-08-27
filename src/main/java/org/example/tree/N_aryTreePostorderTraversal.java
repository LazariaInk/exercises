package org.example.tree;


import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/*
Given the root of an n-ary tree, return the postorder traversal of its nodes' values.

Nary-Tree input serialization is represented in their level order traversal. Each group of children is separated by the null value (See examples)

Example 1:
         1
       / | \
      3  2  4
     / \
    5   6

Input: root = [1,null,3,2,4,null,5,6]
Output: [5,6,3,2,4,1]
 */
public class N_aryTreePostorderTraversal {
    public static void readAllNodes(Node root) {
        List<Node> allValuesFromNode = new ArrayList<>();
        allValuesFromNode.add(root);

        int index = 0;
        while(index < allValuesFromNode.size()){
            Node currentNode = allValuesFromNode.get(index);
            System.out.println(currentNode.val);
            if(currentNode.children != null) {
                allValuesFromNode.addAll(currentNode.children);
            }
            index++;
        }
    }

    public static void main(String[] args) {
        Node child5 = new Node(5);
        Node child6 = new Node(6);
        Node child3 = new Node(3, List.of(child5, child6));
        Node child2 = new Node(2);
        Node child4 = new Node(4);
        Node root = new Node(1, List.of(child3, child2, child4));

        readAllNodes(root);
    }

}


// Definition for a Node.


