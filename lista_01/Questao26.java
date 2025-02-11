package lista_01;

import java.util.LinkedHashMap;
import java.util.Map;

public class Questao26 {
    public static Map<String, Integer> countWords(String statement)
    {
        Map<String, Integer> wordsMap = new LinkedHashMap<String, Integer>();
        String[] statementArray = statement.split(" ");

        for (int a = 0; a < statementArray.length; ++a) {
            if (wordsMap.containsKey(statementArray[a])) {
                wordsMap.replace(statementArray[a], wordsMap.get(statementArray[a]) + 1);
            } else {
                wordsMap.put(statementArray[a], 1);
            }
        }

        return wordsMap;
    }

    public static void main(String[] args) {
        String statement = "estude muito sempre sempre estude";

        Map<String, Integer> wordsMap = countWords(statement);

        for (String key : wordsMap.keySet()) {
            System.out.print(key + "=" + wordsMap.get(key) + " ");
        }
    }
}
