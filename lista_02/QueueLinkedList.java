package lista_02;

public class QueueLinkedList <E> implements QueueInterface <E>
{
    private int first;
    private int last;
    private int maxSize;
    private LinkedListInterface<E> array;

    public QueueLinkedList(int size)
    {
        this.first = -1;
        this.last = -1;
        this.maxSize = size;
        this.array = new SinglyLinkedList<>();
    }

    public void add(E element)
    {
        if (this.isFull()) {
            throw new StackQueueException("A fila está cheia!");
        }

        this.last = (this.last + 1) % this.maxSize;
        this.array.addLast(element);

        if (this.first == -1) {
            ++this.first;
        }
    }

    public E remove()
    {
        if (this.isEmpty()) {
            throw new StackQueueException("A fila está vazia!");
        }

        if (this.first == this.last) {
            this.first = -1;
            this.last = -1;
        } else {
            this.first = (this.first + 1) % this.maxSize;
        }

        return this.array.removeFirst();
    }

    public E peek()
    {
        if (this.isEmpty()) {
            throw new StackQueueException("A fila está vazia!");
        }

        return this.array.peekFirst();
    }

    public boolean isFull()
    {
        if ((this.last + 1) % this.maxSize == this.first) {
            return true;
        }

        return false;
    }

    public boolean isEmpty()
    {
        if (this.first == -1) {
            return true;
        }

        return false;
    }
}
