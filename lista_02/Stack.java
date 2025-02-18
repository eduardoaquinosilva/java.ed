package lista_02;

public class Stack <E> implements StackInterface <E>
{
    private int peek;
    private int maxSize;
    private Object[] array;

    public Stack(int size) {
        this.peek = -1;
        this.maxSize = size;
        this.array = new Object[maxSize];
    }

    public void push(E element) {
        if (this.isFull()) {
            throw new StackQueueException("A pilha está cheia!");
        }

        ++peek;
        array[peek] = element;
    }

    @SuppressWarnings("unchecked")
    public E pop() {
        if (this.isEmpty()) {
            throw new StackQueueException("A pilha está vazia!");
        }

        --peek;

        return (E) array[peek + 1];
    }

    @SuppressWarnings("unchecked")
    public E peek() {
        if (this.isEmpty()) {
            throw new StackQueueException("A pilha está vazia!");
        }

        return (E) array[peek];
    }

    public boolean isFull() {
        if (peek == maxSize - 1) {
            return true;
        }

        return false;
    }

    public boolean isEmpty() {
        if (peek == -1) {
            return true;
        }

        return false;
    }
}
