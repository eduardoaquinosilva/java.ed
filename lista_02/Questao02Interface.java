package lista_02;

public interface Questao02Interface <E>
{
    void add(E element) throws StackQueueException;

    E remove() throws StackQueueException;

    E peek() throws StackQueueException;

    boolean isFull();

    boolean isEmpty();
}
