package Strategies;

import BinaryTree.BinaryTree;
import BinaryTree.BinaryNode;
import Interfaces.Interface;

import java.util.ArrayList;
import java.util.List;

public class InOrder implements Interface {

    private final List<Object> arrayList = new ArrayList<Object>();

    public String print(){
        return "InOrder";
    }

    public List<Object> listElements(BinaryTree<Object> binarTree) {

        if (binarTree != null && binarTree.root != null) {

            inOrder(binarTree.root);
            return arrayList;
        }

        return null;
    }

    public void inOrder(BinaryNode BinaryNode) {
        if (BinaryNode == null)
            return;

        inOrder(BinaryNode.leftValue);
        arrayList.add(BinaryNode.value);
        inOrder(BinaryNode.rightValue);
    }


}