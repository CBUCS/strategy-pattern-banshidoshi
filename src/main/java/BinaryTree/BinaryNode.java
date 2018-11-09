package BinaryTree;

public class BinaryNode<T> {

    public T value;
    public BinaryNode<T> rightValue;
    public BinaryNode<T> leftValue;

    public BinaryNode(T newValue) {
        this.value = newValue;
        this.rightValue = null;
        this.leftValue = null;
    }

    public BinaryNode<T> getRightValue() {
        return this.rightValue;
    }


}