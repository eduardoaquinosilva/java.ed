public class Questao01Main {
    public static void main(String[] args) {
        Questao01Interface<Integer> stack = new Questao01Stack<Integer>(5);

        for (int a = 0; a < 5; ++a) {
            stack.push(a);
        }

        for (int a = 0; a < 2; ++a) {
            System.out.print(stack.pop() + " ");
        }

        System.out.println("\nTopo: " + stack.peek());
    }
}
