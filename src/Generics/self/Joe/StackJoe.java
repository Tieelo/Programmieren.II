package Generics.self.Joe;

import java.util.ArrayList;

public class StackJoe<T> {
    private final ArrayList<T> stack;

    public StackJoe() {
        stack = new ArrayList<T>();
    }

    public boolean empty() {
        return stack.isEmpty();
    }

    public T push(T item) {
        stack.add(item);
        return item;
    }

    public T pop() {
        int lastIndex = stack.size() - 1;
        T lastItem = stack.get(lastIndex);
        stack.remove(lastIndex);
        return lastItem;
    }

    public T peek() {
        int lastIndex = stack.size() - 1;
        return stack.get(lastIndex);
    }
}