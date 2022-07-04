package DataStructures.Trees.AVL;

public interface Tree<T extends Comparable <T>> {

    Tree<T> insert(T data);
    void delete(T data);
    void traverse();
    T getMax();
    T getMin();
    Node<T> search(Node<T> node, T data);
    boolean isEmpty();
}