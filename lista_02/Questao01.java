package lista_02;

public class Questao01 {
    public static void main(String[] args) {
        StackInterface<Integer> stack = new Stack<Integer>(5);

        for (int a = 0; a < 5; ++a) {
            stack.push(a);
        }

        for (int a = 0; a < 2; ++a) {
            System.out.print(stack.pop() + " ");
        }

        System.out.println("\nTopo: " + stack.peek());
    }
}
