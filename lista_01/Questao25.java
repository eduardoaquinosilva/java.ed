package lista_01;

import java.util.LinkedHashMap;
import java.util.Map;

public class Questao25 {
    public static void main(String[] args) {
        String word = "casa";

        Map<Character, Integer> lettersMap = new LinkedHashMap<Character, Integer>();

        for (int a = 0; a < word.length(); ++a) {
            if (lettersMap.containsKey(word.charAt(a))) {
                lettersMap.replace(word.charAt(a), lettersMap.get(word.charAt(a)) + 1);
            } else {
                lettersMap.put(word.charAt(a), 1);
            }
        }

        for (Character key : lettersMap.keySet()) {
            System.out.print(key + "=" + lettersMap.get(key) + " ");
        }
    }
}
