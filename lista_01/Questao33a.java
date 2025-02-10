package lista_01;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

import java_basico.Produto;

public class Questao33a {
    public static void main(String[] args) {
        /**
         * A classe ArrayList implementa a interface List. Se comporta como um array que aumenta seu tamanho em 50% sempre que está totalmente ocupado.
         */
        List<Produto> products = new ArrayList<Produto>();
        products.add(new Produto(1, "Produto", 5.59));
        products.add(new Produto(2, "Outro Produto", 10.99));
        System.out.println(products + "\n");

        /**
         * A classe LinkedList implementa a interface List. Se diferencia do ArrayList por não se tratar de uma estrutura linear. Ou seja, os elementos são concientes de onde estão o elemento anterior e posterior a ele próprio. Isso ocorre porque a LinkedList implementa uma lista duplamente encadeada.
         */
        List<Produto> products2 = new LinkedList<Produto>();
        products2.add(products.get(0));
        products2.add(products.get(1));
        System.out.println(products2 + "\n");

        /**
         * A classe Vector implementa a interface List. Se diferencia do ArrayList por possuir um crescimento de 100% quando sua capacidade é preenchida, além de ser mais recomendado para programação paralera, já que é thread-safe.
         */
        List<Produto> products3 = new Vector<Produto>();
        products3.add(products.get(0));
        products3.add(products.get(1));
        System.out.println(products3 + "\n");
    }
}
