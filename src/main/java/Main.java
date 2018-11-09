import Interfaces.Interface;
import BinaryTree.BinaryTree;
import Strategies.*;

import java.util.ArrayList;
import java.util.List;


public class Main {

    public static void main(String args[]) {

        List<Interface> strategies = new ArrayList<Interface>();

        strategies.add(new BreadthFirstSearch());
        strategies.add(new DepthFirstSearch());
        strategies.add(new MinDepth());
        strategies.add(new PreOrder());
        strategies.add(new MaxDepth());
        strategies.add(new InOrder());
        strategies.add(new PostOrder());

        BinaryTree<Object> binaryTree = new BinaryTree<Object>();
        binaryTree.addValue(30);
        binaryTree.addValue(20);
        binaryTree.addValue(50);
        binaryTree.addValue(10);
        binaryTree.addValue(40);

        for (Interface strategy : strategies) {
            List<Object> result = strategy.listElements(binaryTree);
            if (result != null) {
                System.out.println(strategy.print());

                for (Object item : result) {
                    System.out.println(item);
                }
            }

        }

    }
}