package Strategies;


import BinaryTree.BinaryTree;
import Interfaces.Interface;
import BinaryTree.BinaryNode;
import java.util.ArrayList;
import java.util.List;


public class MaxDepth implements Interface {

    private List<Object> arrayList = new ArrayList<Object>();

    public List<Object> listElements(BinaryTree<Object> binaryTree) {

        if (binaryTree != null && binaryTree.root != null) {
            arrayList.add(maxDepth(binaryTree.root)); // returns 1 value == max depth
            return arrayList;
        }

        return null;
    }

    public int maxDepth(BinaryNode BinaryNode) {
        if (BinaryNode != null) {

            int lDepth = maxDepth(BinaryNode.leftValue);
            int rDepth = maxDepth(BinaryNode.rightValue);
            if (lDepth > rDepth)
                return (lDepth + 1);
            else
                return (rDepth + 1);
        }
        else
        {
            return 0;
        }
    }

    public String print(){
        return "MaxDepth";
    }
}