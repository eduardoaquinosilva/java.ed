package lista_01;

public class Questao20 {
    public static void main(String[] args) {
        int[] vector = {0, 1, 2, 3};

        int[] reversedVector = reverse(vector);

        for (int a = 0; a < vector.length; ++a) {
            System.out.print(reversedVector[a] + " ");
        }
    }

    public static int[] reverse(int[] vector) {
        int[] newVector = new int[vector.length];

        for (int i = 0; i < vector.length; ++i) {
            newVector[i] = vector[vector.length - 1 - i];
        }

        return newVector;
    }
}
