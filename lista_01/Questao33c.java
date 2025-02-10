package lista_01;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

import java_basico.Produto;

public class Questao33c {
    public static void main(String[] args) {
        /**
         * A classe PriotityQueue implementa a interface Queue. Contudo, ela não é apenas uma fila comum, já que trabalha com a ideia de prioridade. Ou seja, caso um elemento com prioridade seja adicionado ao final, ele passa a ter prioridade na hora da remoção.
         */
        Queue<Produto> products = new PriorityQueue<Produto>();
        products.add(new Produto(1, "Produto", 5.99));
        products.add(new Produto(2, "Outro Produto", 10.99));
        products.add(new Produto(3, "Produto Prioritário", 8.55));
        System.out.println(products + "\n");
        products.remove();
        products.remove();
        System.out.println(products + "\n");

        /**
         * A classe LinkedList implementa a interface Queue. Nada mais é do que uma simples fila implementada com uma lista encadeada.
         */
        Queue<Produto> products2 = new LinkedList<Produto>();
        products2.add(new Produto(1, "Produto", 5.99));
        products2.add(new Produto(2, "Outro Produto", 10.99));
        products2.add(new Produto(3, "Produto Prioritário", 8.55));
        System.out.println(products2 + "\n");
        products2.remove();
        products2.remove();
        System.out.println(products2 + "\n");
    }
}
