package lista_01;

import java.util.Scanner;

public class Questao29 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Valor inicial: ");
        int start = scanner.nextInt();

        System.out.print("Valor final: ");
        int end = scanner.nextInt();

        scanner.close();

        // item a)
        int iterativeSummation = iterativeSummation(start, end);
        System.out.println("Somatório iterativo: " + iterativeSummation);

        // item b)
        int recursiveSummation = recursiveSummation(start, end);
        System.out.println("Somatório recursivo: " + recursiveSummation);
    }

    private static int iterativeSummation(int start, int end) {
        int iterativeSummation = 0;
        
        for (int a = start; a <= end; ++a) {
            iterativeSummation += a;
        }

        return iterativeSummation;
    }

    private static int recursiveSummation(int start, int end) {
        if (end == start) {
            return end;
        }

        return end + recursiveSummation(start, end - 1);
    }
}
