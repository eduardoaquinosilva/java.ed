package lista_02;

public interface LinkedListInterface <E>
{
    void addFirst(E element);

    void addLast(E element);

    boolean addAfter(E insertElement, E baseElement);

    E peekFirst();

    E peekLast();

    E search(E element);

    E removeFirst();

    E removeLast();

    E remove(E baseElement);
}
