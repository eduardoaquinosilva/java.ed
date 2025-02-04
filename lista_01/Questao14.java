package lista_01;

import java.util.Scanner;

public class Questao14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Número: ");
        int number = scanner.nextInt();
        scanner.close();

        boolean isPrime = true;
        for (int a = 2; a <= Math.sqrt(number); ++a) {
            if (number % a == 0) {
                isPrime = false;
            }
        }

        if (isPrime && number != 1) {
            System.out.println(number + " é primo!");
        } else {
            System.out.println(number + " não é primo!");
        }
    }
}
