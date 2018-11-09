package Strategies;

import Interfaces.Interface;
import BinaryTree.BinaryTree;
import BinaryTree.BinaryNode;

import java.util.*;

public class DepthFirstSearch implements Interface {

    private List<Object> arrayList = new ArrayList<Object>();

    public List<Object> listElements(BinaryTree<Object> binaryTree) {

        Stack<BinaryNode> stack = new Stack<BinaryNode>();
        List<BinaryNode> visited = new ArrayList<BinaryNode>();

        stack.add(binaryTree.root);

        while (!stack.isEmpty()) {
            BinaryNode BinaryNode = stack.pop();
            arrayList.add(BinaryNode.value);

            List<BinaryNode> childBinaryNodes = new ArrayList<BinaryNode>();
            childBinaryNodes.add(BinaryNode.rightValue);
            childBinaryNodes.add(BinaryNode.leftValue);

            for (int i = 0; i < childBinaryNodes.size(); i++) {
                BinaryNode n = childBinaryNodes.get(i);
                if (n != null && !visited.contains(n)) {
                    stack.add(n);
                    visited.add(n);
                }
            }

        }
        return arrayList;
    }

    public String print() {
        return "DepthFirstSearch";
    }
}