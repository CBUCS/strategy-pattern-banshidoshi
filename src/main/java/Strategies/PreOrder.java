package Strategies;

import BinaryTree.BinaryTree;
import BinaryTree.BinaryNode;
import Interfaces.Interface;

import java.util.ArrayList;
import java.util.List;


public class PreOrder implements Interface {

    private List<Object> arrayList = new ArrayList<Object>();

    public List<Object> listElements(BinaryTree<Object> binaryTree) {

        if (binaryTree != null && binaryTree.root != null) {

            preOrder(binaryTree.root);
            return arrayList;
        }

        return null;
    }

    public void preOrder(BinaryNode node) {
        if (node == null)
            return;

        arrayList.add(node.value);
        preOrder(node.leftValue);
        preOrder(node.rightValue);
    }

    public String print(){
        return "PreOrder";
    }

}