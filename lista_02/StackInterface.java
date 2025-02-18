package lista_02;

public interface StackInterface <E>
{
    void push(E element) throws StackQueueException;

    E pop() throws StackQueueException;

    E peek() throws StackQueueException;

    boolean isEmpty();

    boolean isFull();
}
