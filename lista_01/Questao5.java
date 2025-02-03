package lista_01;

import java.util.Locale;
import java.util.Scanner;

public class Questao5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        scanner.useLocale(Locale.US);
        Locale.setDefault(Locale.US);

        System.out.print("Média: ");
        float average = scanner.nextFloat();

        scanner.close();

        if (average >= 7) {
            System.out.println("O aluno está aprovado!");
        } else if (average >= 3.5) {
            System.out.println("O aluno está na prova final!");
        } else {
            System.out.println("O aluno está reprovado!");
        }
    }
}
