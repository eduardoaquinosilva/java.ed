package lista_02;

public class DoubleLinkedList <E> implements LinkedListInterface <E>
{
    class Node
    {
        private E data;
        private Node next;
        private Node previous;

        public Node(E data)
        {
            this.next = null;
            this.previous = null;
            this.data = data;
        }
    }

    private Node head;
    private Node tail;
    private int size;

    public DoubleLinkedList()
    {
        this.head = null;
        this.tail = null;
        this.size = 0;
    }

    public void addFirst(E element)
    {
        Node node = new Node(element);

        ++this.size;
        if (this.head == null) {
            this.head = node;
            this.tail = node;
            return;
        }

        node.next = this.head;
        this.head.previous = node;
        this.head = node;
    }

    public void addLast(E element)
    {
        Node node = new Node(element);

        ++this.size;
        if (this.tail == null) {
            this.head = node;
            this.tail = node;
            return;
        }

        this.tail.next = node;
        node.previous = this.tail;
        this.tail = node;
    }

    public boolean addAfter(E elementInsert, E baseElement)
    {
        Node elementFound = null;
        Node auxNode = this.head;

        while (auxNode != null) {
            if (auxNode.data.equals(baseElement)) {
                elementFound = auxNode;
                break;
            }
        }

        if (elementFound == null) {
            return false;
        }

        ++this.size;
        Node node = new Node(elementInsert);

        if (elementFound.next == null) {
            this.addLast(elementInsert);
            return true;
        }

        if (elementFound.previous == null) {
            this.addFirst(elementInsert);
            return true;
        }

        node.next = elementFound.next;
        node.previous = elementFound;
        elementFound.next = node;
        node.next.previous = node;
        return true;
    }

    public E peekFirst()
    {
        if (this.head == null) {
            throw new StackQueueException("A lista está vazia!");
        }

        return this.head.data;
    }

    public E peekLast()
    {
        if (this.tail == null) {
            throw new StackQueueException("A lista está vazia!");
        }

        return this.tail.data;
    }

    public E search(E element)
    {
        Node auxNode = this.head;

        while (auxNode != null) {
            if (auxNode.data.equals(element)) {
                return auxNode.data;
            }
            auxNode = auxNode.next;
        }

        return null;
    }

    public E removeFirst()
    {
        if (this.head == null) {
            throw new StackQueueException("A lista está vazia!");
        }

        --this.size;
        E data = this.head.data;
        if (this.head == this.tail) {
            this.head = null;
            this.tail = null;
            return data;
        }

        this.head = this.head.next;
        this.head.previous.next = null;
        this.head.previous = null;
        return data;
    }

    public E removeLast()
    {
        if (this.tail == null) {
            throw new StackQueueException("A lista está vazia!");
        }

        --this.size;
        E data = this.tail.data;
        if (this.head == this.tail) {
            this.head = null;
            this.tail = null;
            return data;
        }

        this.tail = this.tail.previous;
        this.tail.next.previous = null;
        this.tail.next = null;
        return data;
    }

    public E remove(E baseElement)
    {
        Node elementFound = null;
        Node auxNode = this.head;

        while (auxNode != null) {
            if (auxNode.data.equals(baseElement)) {
                elementFound = auxNode;
                break;
            }
        }

        if (elementFound == null) {
            throw new StackQueueException("Elemento não encontrado!");
        }

        --this.size;
        if (elementFound == this.head) {
            return this.removeFirst();
        }

        if (elementFound == this.tail) {
            return this.removeLast();
        }

        E data = elementFound.data;
        elementFound.previous.next = elementFound.next;
        elementFound.next.previous = elementFound.previous;
        elementFound.next = null;
        elementFound.previous = null;
        return data;
    }
}
