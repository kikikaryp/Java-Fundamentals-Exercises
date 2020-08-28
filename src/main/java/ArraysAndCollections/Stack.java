package ArraysAndCollections;

import java.util.Arrays;

public class Stack<T extends Object> implements IStack<T> {


    private T[] elements;
    private int size;
    private int topElem;


    public Stack(int size) {
        this.size = size;
        this.elements = (T[]) new Object[size];
        this.topElem = -1;
    }


    public void push(T x) {

        if (this.isFull()) {
            System.out.println("Stack is full");
            this.increaseStackCapacity();
        }
        System.out.println("Inserting item..");

        this.elements[++topElem] = x;


    }


    @Override
    public T pop() {
        if (this.isEmpty()) {
            //Stack has no items
            //so nothing to pop
            System.out.println("Stack is empty");

        } else {
            System.out.println("Removing " + peek());

            //decrease the size of the stack and return the popped element
            return elements[topElem--];
        }

        return null;
    }

    @Override
    public T peek() {

        if (!isEmpty())
            return elements[topElem];

        return null;
    }

    @Override
    public boolean isFull() {
        return (topElem == size - 1);
    }

    @Override
    public boolean isEmpty() {
        return (topElem == -1);
    }

    public void increaseStackCapacity() {
        T[] newStack = (T[]) new Object[this.size * 2];
        for (int i = 0; i < size; i++) {
            newStack[i] = this.elements[i];
        }
        this.elements = newStack;
        this.size = this.size * 2;
    }


}
