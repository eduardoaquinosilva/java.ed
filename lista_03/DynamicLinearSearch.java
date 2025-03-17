package lista_03;

import lista_02.StackQueueException;

public class DynamicLinearSearch {
    static class SinglyLinkedList <E>
    {
        class Node
        {
            private E data;
            private Node next;

            public Node(E data)
            {
                this.data = data;
                this.next = null;
            }
        }

        private Node head;
        private Node tail;
        private int size;

        public SinglyLinkedList()
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

            node.next = head;
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
            this.tail = node;
        }

        public boolean addAfter(E elementInsert, E baseElement)
        {
            Node auxNode = this.head;
            Node elementFound = null;

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
                this.tail = node;
            }

            node.next = elementFound.next;
            elementFound.next = node;
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

            Node auxNode = this.head.next;
            this.head.next = null;
            this.head = auxNode;
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

            Node auxNode = this.head;
            while (auxNode.next != this.tail) {
                auxNode = auxNode.next;
            }
            this.tail = auxNode;
            this.tail.next = null;
            return data;
        }

        public E remove(E element)
        {
            Node auxNode = this.head;
            Node elementFound = null;

            while (auxNode.next != null) {
                if (auxNode.data.equals(element)) {
                    elementFound = auxNode;
                    break;
                }
            }

            if (elementFound == null) {
                throw new StackQueueException("Elemento não encontrado!");
            }

            --this.size;
            if (elementFound == this.tail) {
                return this.removeLast();
            }

            if (elementFound == this.head) {
                return this.removeFirst();
            }

            E data = elementFound.data;
            
            Node tempNode = elementFound.next;
            elementFound.data = tempNode.data;
            elementFound.next = tempNode.next;
            tempNode.next = null;
            
            return data;
        }

        public int dynamicLinearSearch(E element) {
            Node auxNode = this.head;
            int index = 0;

            while (auxNode != null) {
                if (auxNode.data == element) {
                    return index; 
                }

                auxNode = auxNode.next;
                ++index;
            }

            return -1;
        }
    }
    

    public static void main(String[] args) {
        SinglyLinkedList<Integer> linkedList = new SinglyLinkedList<Integer>();
        linkedList.addLast(1);
        linkedList.addLast(5);
        linkedList.addLast(7);
        linkedList.addLast(9);
        linkedList.addLast(4);
        linkedList.addLast(6);
        linkedList.addLast(8);
        linkedList.addLast(2);
        linkedList.addLast(3);
        linkedList.addLast(0);

        System.out.println("Posição do 0: " + linkedList.dynamicLinearSearch(0));
    }
}
