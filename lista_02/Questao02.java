package lista_02;

public class Questao02 {
    public static void main(String[] args) {
        QueueInterface<Integer> queue = new Queue<Integer>(5);

        for (int a = 0; a < 5; ++a) {
            queue.add(a);
        }

        for (int a = 0; a < 2; ++a) {
            System.out.print(queue.remove() + " ");
        }

        System.out.println("\nPeek: " + queue.peek());
    }
}
