package aplicacao_pilha;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import pilhas.MyInterfaceStack;
import pilhas.MyStackArray;

// Algoritmo de conversão de uma expressão de infixa para posfixa
public class Conversao {
    public static void main(String[] args) {
        String expression = "A*(B+C)/D";
        Set<Character> operators = Set.of('+', '-', '/', '*');
        Map<Character, Integer> priorities = new HashMap<Character, Integer>();
        priorities.put('(', 1);
        priorities.put('+', 2);
        priorities.put('-', 2);
        priorities.put('*', 3);
        priorities.put('/', 3);

        // 1. Inicialize com uma pilha vazia
        MyInterfaceStack<Character> stack = new MyStackArray<Character>(expression.length());

        // 2. Realize uma varredura na expressão (para cada caracter)
        for (int a = 0; a < expression.length(); ++a) {
            // 1. Se for um operador
            if (operators.contains(expression.charAt(a))) {
                // 1. Enquanto a pilha não estiver vazia e houver no seu topo um símbolo com prioridade maior ou igual ao encontrado, desempilhe o operador e copie-o na saída.
                while (stack.isEmpty() == false && priorities.get(stack.peek()) >= priorities.get(expression.charAt(a))) {
                    System.out.print(stack.pop());
                }

                // 2. Empilhe o operador encontrado
                stack.push(expression.charAt(a));
            }

            // 2. Se for '(', empilhe
            else if (expression.charAt(a) == '(') {
                stack.push(expression.charAt(a));
            }

            // 3. Se for um operando, copie-o para a saída
            else if (expression.charAt(a) != ')') {
                System.out.print(expression.charAt(a));
            }

            // 4. Se for ')', desempilhe e copie na saída, até que seja desempilhado o parêntese se abertura correspondente
            else {
                char popped;

                while ((popped = stack.pop()) != '(') {
                    System.out.print(popped);
                }
            }
        }

        // 3. Ao final, esvaziar a pilha e mover símbolos desempilhados para a saída
        while (stack.isEmpty() == false) {
            System.out.print(stack.pop());
        }

        System.out.println();
    }
}
