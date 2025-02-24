package lista_02;

public class StackLinkedList <E> implements StackInterface <E>
{
    private int peek;
    private int maxSize;
    private LinkedListInterface<E> array;

    public StackLinkedList() {
        this.peek = -1;
        this.maxSize = 0;
        this.array = new SinglyLinkedList<E>();
    }

    public void push(E element)
    {
        if (this.isFull()) {
            throw new StackQueueException("A pilha está cheia!");
        }

        ++this.peek;
        array.addFirst(element);
    }

    public E pop()
    {
        if (this.isEmpty()) {
            throw new StackQueueException("A pilha está vazia!");
        }

        --this.peek;
        return array.removeFirst();
    }

    public E peek()
    {
        if (this.isEmpty()) {
            throw new StackQueueException("A pilha está vazia!");
        }

        return array.peekFirst();
    }

    public boolean isFull()
    {
        if (this.peek == this.maxSize - 1) {
            return true;
        }

        return false;
    }

    public boolean isEmpty()
    {
        if (this.peek == -1) {
            return true;
        }

        return false;
    }
}
