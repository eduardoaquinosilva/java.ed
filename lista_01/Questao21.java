package lista_01;

import java.util.Scanner;

public class Questao21 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Frase: ");
        String statement = scanner.nextLine();

        scanner.close();

        System.out.println("Frase invertida: " + reverseString(statement));
    }

    private static String reverseString(String string) {
        char[] ch = string.toCharArray();

        for (int i = 0, j = ch.length - 1; i < j; ++i, --j) {
            char temp = ch[i];
            ch[i] = ch[j];
            ch[j] = temp;
        }

        string = String.valueOf(ch);

        return string;
    }
}
