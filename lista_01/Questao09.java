package lista_01;

import java.util.Scanner;

public class Questao09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Número inicial: ");
        int start = scanner.nextInt();

        System.out.print("Número final: ");
        int end = scanner.nextInt();

        scanner.close();

        int counter = start;
        System.out.println();
        while (counter <= end) {
            System.out.print(counter + " ");
            counter++;
        }

        counter = start;
        System.out.println();
        do {
            System.out.print(counter + " ");
            counter++;
        } while (counter <= end);

        System.out.println();
        for (int a = start; a <= end; a++) {
            System.out.print(a + " ");
        }
    }
}
