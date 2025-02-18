package lista_02;

import java.util.Set;

public class Questao08 {
    public static void main(String[] args) {
        String expression = "304 11 + 2 -";
        Set<String> operators = Set.of("+", "-", "*", "/");

        // 1. Inicialize pilha vazia
        StackInterface<Integer> stack = new Stack<Integer>(10);

        // 2. Varra a expressão:
        String[] splittedExpression = expression.split(" ");
        for (int a = 0; a < splittedExpression.length; ++a) {
            // 2.1. Se for operando, empilhe o valor.
            if (operators.contains(splittedExpression[a]) == false) {
                stack.push(Integer.parseInt(splittedExpression[a]));
            }

            // 2.2. Se for operador, desempilhe dois valores da pilha, efetue a operação com eles e empilhe o resutlado.
            else {
                int firstLast = stack.pop();
                int secondLast = stack.pop();

                switch (splittedExpression[a]) {
                    case "+" -> stack.push(secondLast + firstLast);
                    case "-" -> stack.push(secondLast - firstLast);
                    case "*" -> stack.push(secondLast * firstLast);
                    case "/" -> stack.push(secondLast / firstLast);
                }
            }
        }

        // 3. Ao final, exiba o elemento no topo da pilha, que é o resultado da expressão.
        System.out.println("Resultado: " + stack.peek());
    }
}
