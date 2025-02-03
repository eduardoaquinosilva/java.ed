package lista_01;

import java.util.Locale;
import java.util.Scanner;

public class Questao6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        scanner.useLocale(Locale.US);
        Locale.setDefault(Locale.US);

        System.out.print("Nota 1: ");
        float n1 = scanner.nextFloat();

        System.out.print("Nota 2: ");
        float n2 = scanner.nextFloat();

        System.out.print("Nota 3: ");
        float n3 = scanner.nextFloat();

        float parcial_average = (n1 + n2 + n3) / 3.0f;

        if (parcial_average >= 7) {
            System.out.println("\nAprovado");
        } else if (parcial_average >= 3.5) {
            System.out.println("\nRecuperação");

            System.out.print("\nNota 4: ");
            float n4 = scanner.nextFloat();

            if ((parcial_average + n4) / 2.0f >= 5) {
                System.out.println("\nAprovado");
            } else {
                System.out.println("\nReprovado");
            }
        } else {
            System.out.println("\nReprovado");
        }

        scanner.close();
    }
}
