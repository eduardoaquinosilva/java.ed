package aplicacao_pilha;

import java.util.Set;

import lista_02.Stack;
import lista_02.StackInterface;

// Algoritmo de avaliação de expressão na notação posfixa
public class Avaliacao {
    public static void main(String[] args) {
        String expression = "73+64-*"; // AB+CD-*
        Set<Character> operators = Set.of('+', '-', '*', '/');

        // 1. Inicialize pilha vazia
        StackInterface<Integer> stack = new Stack<Integer>(expression.length());

        // 2. Varrer a expressão
        for (int a = 0; a < expression.length(); ++a) {
            // 1. Se for operando, empilha o valor
            if (operators.contains(expression.charAt(a)) == false) {
                stack.push(Character.getNumericValue(expression.charAt(a)));
            }

            // 2. Se for operador, desempilhar últimos dois valores, efetuar a operação com eles e empilhar o resultado obtido
            else {
                int lastFirst = stack.pop();
                int lastSecond = stack.pop();

                switch (expression.charAt(a)) {
                    case '+' -> stack.push(lastSecond + lastFirst);
                    case '-' -> stack.push(lastSecond - lastFirst);
                    case '*' -> stack.push(lastSecond * lastFirst);
                    case '/' -> stack.push(lastSecond / lastFirst);
                }
            }
        }

        // 3. Ao final, o resultado da expressão estará no topo da pilha
        System.out.println(stack.peek());
    }
}
