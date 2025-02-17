package lista_02;

public interface Questao01Interface <E>
{
    void push(E element) throws StackException;

    E pop() throws StackException;

    E peek() throws StackException;

    boolean isEmpty();

    boolean isFull();
}
