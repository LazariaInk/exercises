package org.example.tree;

import java.util.List;

public class Node<T> {
    public T val;
    public List<Node> children;

    public Node() {}

    public Node(T _val) {
        val = _val;
    }

    public Node(T _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
}
