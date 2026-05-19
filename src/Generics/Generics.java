package Generics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.EmptyStackException;
import java.util.List;

public class Generics {
    public static void main(String[] args) {

        Container<Double> doubleContainer = new Container<>(99.99);
        System.out.println("Container value: " + doubleContainer.getValue());
        doubleContainer.setValue(100.5);
        System.out.println("Updated value: " + doubleContainer.getValue());

        printTwice("Echo!");
        printTwice(42);

        System.out.println("Max of 10 and 20: " + max(10, 20));
        System.out.println("Max of Apple and Orange: " + max("Apple", "Orange"));

        List<String> names = Arrays.asList("Gica", "Rica", "Mitica");
        System.out.println("Total elements: " + countElements(names));

        List<Integer> source = Arrays.asList(1, 2, 3);
        List<Number> destination = new ArrayList<>();
        copy(source, destination);
        System.out.println("Destination after copy: " + destination);

        GenericStack<String> stack = new GenericStack<>();
        stack.push("First");
        stack.push("Second");
        System.out.println("Peek top: " + stack.peek());
        System.out.println("Pop top: " + stack.pop());
        System.out.println("Is stack empty? " + stack.isEmpty());
    }

    static class Container<T> {
        private T value;

        public Container(T value) {
            this.value = value;
        }

        public T getValue() {
            return value;
        }

        public void setValue(T value) {
            this.value = value;
        }
    }

    public static <T> void printTwice(T value) {
        System.out.println(value);
        System.out.println(value);
    }

    public static <T extends Comparable<T>> T max(T a, T b) {
        if (a.compareTo(b) > 0) {
            return a;
        } else {
            return b;
        }
    }

    public static int countElements(List<?> list) {
        return list.size();
    }

    public static <T> void copy(List<? extends T> src, List<? super T> dest) {
        for (T item : src) {
            dest.add(item);
        }
    }

    static class GenericStack<T> {
        private List<T> elements;

        public GenericStack() {
            this.elements = new ArrayList<>();
        }

        public void push(T item) {
            elements.add(item);
        }

        public T pop() {
            if (isEmpty()) {
                throw new EmptyStackException();
            }

            return elements.remove(elements.size() - 1);
        }

        public T peek() {
            if (isEmpty()) {
                throw new EmptyStackException();
            }
            return elements.get(elements.size() - 1);
        }

        public boolean isEmpty() {
            return elements.isEmpty();
        }
    }
}
