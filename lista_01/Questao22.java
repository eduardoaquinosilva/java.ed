package lista_01;

public class Questao22 {
    public static void main(String[] args) {
        int[] vector = {57, 20, 61, 89, 67, 18, 53, 75, 58, 31};

        int bigger = vector[0];
        int smaller = vector[0];

        for (int a = 1; a < vector.length; ++a) {
            if (vector[a] > bigger) {
                bigger = vector[a];
            }

            if (vector[a] < smaller) {
                smaller = vector[a];
            }
        }

        System.out.println("Maior: " + bigger);
        System.out.println("Menor: " + smaller);
    }
}
