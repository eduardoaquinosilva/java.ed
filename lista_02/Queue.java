package lista_02;

public class Queue <E> implements QueueInterface <E>
{
    private int first;
    private int last;
    private int maxSize;
    private Object[] array;

    public Queue(int size) {
        this.first = -1;
        this.last = -1;
        this.maxSize = size;
        array = new Object[this.maxSize];
    }

    public void add(E element) {
        if (this.isFull()) {
            throw new StackQueueException("A fila está cheia!");
        }

        last = (last + 1) % maxSize;
        array[last] = element;

        if (first == -1) {
            ++first;
        }
    }

    @SuppressWarnings("unchecked")
    public E remove() {
        if (this.isEmpty()) {
            throw new StackQueueException("A fila está vazia!");
        }

        E element = (E) array[first];

        if (first == last) {
            first = -1;
            last = -1;
        } else {
            first = (first + 1) % maxSize;
        }

        return element;
    }

    @SuppressWarnings("unchecked")
    public E peek() {
        if (this.isEmpty()) {
            throw new StackQueueException("A fila está vazia!");
        }

        return (E) array[first];
    }

    public boolean isFull() {
        if ((last + 1) % maxSize == first) {
            return true;
        }
        
        return false;
    }

    public boolean isEmpty() {
        if (first == -1) {
            return true;
        }

        return false;
    }
}
