package org.example.tree;

import java.util.ArrayList;
import java.util.List;

public class SearchInTree {
    public static void main(String[] args) {
        Node child5 = new Node("Dana");
        Node child6 = new Node("Gaby");
        Node child3 = new Node("Liuda", List.of(child5, child6));
        Node child2 = new Node("Eva");
        Node child4 = new Node("Licica");
        Node root = new Node("Nicoleta", List.of(child3, child2, child4));
        System.out.println(isExistInTree(root, "Petrea"));
    }

    public static boolean isExistInTree(Node node, String valueToSearch) {
        List<Node> allNodesVertical = new ArrayList<>();
        populateNodesHorizontaly(node, allNodesVertical);
        return isExistFromList(allNodesVertical, valueToSearch);
    }

    private static void populateNodesHorizontaly(Node node, List<Node> allNodesVertical) {
        allNodesVertical.add(node);
        int index = 0;

        while (index < allNodesVertical.size()) {
            Node currentNode = allNodesVertical.get(index);
            if (currentNode.children != null) {
                allNodesVertical.addAll(currentNode.children);
            }
            index++;
        }
    }

    public static boolean isExistFromList(List<Node> nodesHorizontaly, String value) {
        return nodesHorizontaly.stream().anyMatch(nodeValue -> nodeValue.val.equals(value));
    }
}
