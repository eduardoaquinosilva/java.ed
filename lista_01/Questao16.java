package lista_01;

import java.util.Locale;
import java.util.Scanner;

public class Questao16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        scanner.useLocale(Locale.US);
        Locale.setDefault(Locale.US);

        System.out.print("Número: ");
        double number = scanner.nextDouble();

        scanner.close();

        System.out.println("Fatorial de " + number + ": " + factorial(number));
    }

    public static double factorial(double number) {
        double factorial = 1;

        if (number != 0) {
            for (double a = 1; a <= number; a++) {
                factorial *= a;
            }
        }

        return factorial;
    }
}
