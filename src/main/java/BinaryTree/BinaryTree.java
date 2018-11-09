package BinaryTree;

public class BinaryTree<T> {

    public BinaryNode<T> root;
    private int size = 0;

    public BinaryTree() {
        root = null;
    }

    public void addValue(T item) {
        if (this.root == null) {
            
            this.root = new BinaryNode<T>(item);
        } else {
            insertValue(this.root, item);
        }

        this.size++;
    }

    public BinaryNode<T> insertValue(BinaryNode<T> bBinaryNode, T item) {
        if (bBinaryNode == null) {
            bBinaryNode = new BinaryNode<T>(item);
        } else {
            if (bBinaryNode.getRightValue() == null) {
                bBinaryNode.rightValue = insertValue(bBinaryNode.rightValue, item);
            } else {
                bBinaryNode.leftValue = insertValue(bBinaryNode.leftValue, item);
            }
        }

        return bBinaryNode;
    }

    public int size()
    {
        return this.size;
    }

    public BinaryNode<T> containsValue(T item) {
        return searchValue(root, item);
    }

    public BinaryNode<T> searchValue(BinaryNode<T> bBinaryNode, T value) {
        if (bBinaryNode == null)
        {
            return null;
        }
        else
            {
            BinaryNode<T> tempBinaryNode;

            if (bBinaryNode.value == value) {
                return bBinaryNode;
            }
            else
                {
                tempBinaryNode = bBinaryNode.leftValue;
                if (searchValue(tempBinaryNode, value) != null) {
                    return tempBinaryNode;
                }

                tempBinaryNode = bBinaryNode.rightValue;
                if (searchValue(tempBinaryNode, value) != null) {
                    return tempBinaryNode;
                }

                return null;

            }
        }
    }
}
