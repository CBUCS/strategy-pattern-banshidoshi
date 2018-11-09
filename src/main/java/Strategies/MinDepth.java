package Strategies;

import Interfaces.Interface;
import BinaryTree.BinaryTree;
import BinaryTree.BinaryNode;
import java.util.ArrayList;
import java.util.List;

public class MinDepth implements Interface {

    private List<Object> arrayList = new ArrayList<Object>();

    public List<Object> listElements(BinaryTree<Object> binaryTree) {

        if (binaryTree != null && binaryTree.root != null) {

            arrayList.add(minDepth(binaryTree.root));
            return arrayList;
        }

        return null;
    }

    public int minDepth(BinaryNode BinaryNode) {
        if (BinaryNode == null) {
            return 0;
        }

        if (BinaryNode.leftValue == null && BinaryNode.rightValue == null) {
            return 1;
        }

        if (BinaryNode.leftValue == null) {
            return minDepth(BinaryNode.rightValue) + 1;
        }

        if (BinaryNode.rightValue == null) {
            return minDepth(BinaryNode.leftValue) + 1;
        }

        return Math.min(minDepth(BinaryNode.leftValue), minDepth(BinaryNode.rightValue)) + 1;
    }

    public String print(){
        return "MinDepth";
    }
}