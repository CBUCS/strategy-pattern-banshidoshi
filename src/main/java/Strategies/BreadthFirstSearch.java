package Strategies;

import BinaryTree.BinaryTree;
import BinaryTree.BinaryNode;
import Interfaces.Interface;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class BreadthFirstSearch implements Interface {

    private List<Object> arrayList = new ArrayList<Object>();

    public List<Object> listElements(BinaryTree<Object> binaryTree) {

        Queue<BinaryNode> queue = new LinkedList<BinaryNode>();
        List<BinaryNode> visited = new ArrayList<BinaryNode>();

        queue.add(binaryTree.root);
        visited.add(binaryTree.root);

        while (!queue.isEmpty()) {
            BinaryNode node = queue.remove();
            arrayList.add(node.value);

            List<BinaryNode> childNodes = new ArrayList<BinaryNode>();
            childNodes.add(node.rightValue);
            childNodes.add(node.leftValue);

            for (int i = 0; i < childNodes.size(); i++) {
                BinaryNode n = childNodes.get(i);
                if (n != null && !visited.contains(n)) {
                    queue.add(n);
                    visited.add(n);
                }
            }

        }
        return arrayList;
    }

    public String print() {
        return "BreadthFirstSearch";
    }
}
