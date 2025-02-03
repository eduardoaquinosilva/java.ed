package lista_01;

import java.util.Scanner;

public class Questao16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Número: ");
        int number = scanner.nextInt();

        scanner.close();

        int factorial = 1;

        if (number != 0) {
            for (int a = 1; a <= number; a++) {
                factorial *= a;
            }
        }

        System.out.println("Fatorial de " + number + ": " + factorial);
    }
}
