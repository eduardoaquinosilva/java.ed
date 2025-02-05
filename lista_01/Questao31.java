package lista_01;

import java.util.ArrayList;
import java_basico.Produto;

public class Questao31 {
    static class Crud <E>
    {
        private ArrayList<E> elements;

        public Crud()
        {
            elements = new ArrayList<E>();
        }

        public void create(E element)
        {
            elements.add(element);
            System.out.println("\nCadastro realizado com sucesso!\n");
        }

        public void read()
        {
            System.out.println("Lista de Elementos:");
            for (int a = 0; a < elements.size(); ++a) {
                System.out.println((a + 1) + " - " + elements.get(a));
            }
            System.out.println();
        }

        public void update(E element)
        {
            int index = elements.indexOf(element);

            elements.set(index, element);
            System.out.println("\nAtualização realizada com sucesso!\n");
        }

        public void delete(int id)
        {
            elements.remove(id);
            System.out.println("\nRemoção realizada com sucesso!\n");
        }
    }

    public static void main(String[] args)
    {
        Crud<Produto> products = new Crud<>();

        products.create(new Produto(1, "Nome do Produto", 10.98));
        products.create(new Produto(5, "Outro Produto", 5.99));
        
        products.read();

        products.update(new Produto(6, "Produto Atualizado", 1.99));

        products.read();

        products.delete(1);

        products.read();
    }
}
