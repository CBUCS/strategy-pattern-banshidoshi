package Strategies;

import BinaryTree.BinaryTree;
import BinaryTree.BinaryNode;
import Interfaces.Interface;
import java.util.ArrayList;
import java.util.List;

public class PostOrder implements Interface {

    private List<Object> arrayList = new ArrayList<Object>();

    public List<Object> listElements(BinaryTree<Object> binaryTree) {

        if (binaryTree != null && binaryTree.root != null) {

            postOrder(binaryTree.root);
            return arrayList;
        }

        return null;
    }

    public void postOrder(BinaryNode node) {
        if (node == null)
            return;

        postOrder(node.leftValue);
        postOrder(node.rightValue);
        arrayList.add(node.value);
    }

    public String print(){
        return "PostOrder";
    }
}