package lista_01;

import java.util.Deque;
import java.util.LinkedList;

import java_basico.Produto;

public class Questao33d {
    public static void main(String[] args) {
        /**
         * A classe LinkedList implementa a interface Deque. O principal objetivo dessa implementação é gerar uma fila de duas pontas. Ou seja, os elementos podem adicionados ou removidos de qualquer uma das duas pontas. Para essa implementação é utilizada uma lista encadeada 
         */
        Deque<Produto> products = new LinkedList<Produto>();
        products.addFirst(new Produto(1, "Produto", 5.54));
        products.addLast(new Produto(2, "Outro Produto", 10.99));
        products.addFirst(new Produto(3, "Produto Novo", 8.67));
        products.addLast(new Produto(4, "Produto Deque", 2.99));
        System.out.println(products + "\n");
        products.removeFirst();
        System.out.println(products + "\n");
        products.removeLast();
        System.out.println(products + "\n");
    }
}
