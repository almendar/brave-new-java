package org.example;

public sealed interface StackADT<T> permits ArrayStack, LinkedStack {

    JsonSerializable<T> serialize();

    void push(T element);

    T pop();

    T peek();

    boolean isEmpty();

    int size();
}


record ArrayStack<T>() implements StackADT<T> {

    @Override
    public JsonSerializable<T> serialize() {
        return null;
    }

    @Override
    public void push(T element) {

    }

    @Override
    public T pop() {
        return null;
    }

    @Override
    public T peek() {
        return null;
    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public int size() {
        return 0;
    }
}


record LinkedStack<T>(JsonSerializable<T> js) implements StackADT<T> {

    public static String nmae = """
            ????
            """;

    @Override
    public JsonSerializable<T> serialize() {
        return null;
    }

    @Override
    public void push(T element) {

    }

    @Override
    public T pop() {
        return null;
    }

    @Override
    public T peek() {
        return null;
    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public int size() {
        return 0;
    }
}
