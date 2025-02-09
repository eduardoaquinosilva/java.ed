package lista_01;

import java.util.ArrayList;
import java.util.List;

import java_basico.Produto;

public class Questao30 {
    public static <T> void printObject(T object) {
        System.out.println(object + "\n");
    }

    public static <E> void printVector(List<E> array) {
        for (E element : array) {
            System.out.println(element);
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Produto product = new Produto(1, "Produto Isolado", 1.99);
        printObject(product);

        ArrayList<Produto> products = new ArrayList<Produto>();
        products.add(product);
        products.add(new Produto(2, "Produto Produzido", 5.87));
        products.add(new Produto(3, "Produto Final", 9.99));
        printVector(products);
    }
}
