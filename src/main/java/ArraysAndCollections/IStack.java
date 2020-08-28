package ArraysAndCollections;

public interface IStack<T> {

    void push(T x);

    T pop();

    T peek();

    boolean isFull();

    boolean isEmpty();

    void increaseStackCapacity();


}
