package lista_01;

import java.util.Locale;
import java.util.Scanner;

public class Questao7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        scanner.useLocale(Locale.US);
        Locale.setDefault(Locale.US);

        System.out.print("a: ");
        float a = scanner.nextFloat();

        System.out.print("b: ");
        float b = scanner.nextFloat();

        System.out.print("c: ");
        float c = scanner.nextFloat();

        scanner.close();

        float delta = delta(a, b, c);
        
        if (delta > 0) {
            double x1 = (-b + Math.sqrt(delta)) / (2 * a);
            double x2 = (-b - Math.sqrt(delta)) / (2 * a);

            System.out.println("\nx1 = " + x1);
            System.out.println("x2 = " + x2);
        } else if (delta == 0) {
            double x = (-b + Math.sqrt(delta)) / (2 * a);

            System.out.println("\nx = " + x);
        } else {
            double realPart = -b / (2 * a);
            double imaginarypart = Math.sqrt(-delta) / (2 * a);

            System.out.println("\nx1 = " + realPart + " + " + imaginarypart + 'i');
            System.out.println("x2 = " + realPart + " - " + imaginarypart + 'i');
        }
    }
        
    public static float delta(float a, float b, float c) {
        return b * b - 4 * a * c;
    }
}
