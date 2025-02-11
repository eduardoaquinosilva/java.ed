package lista_01;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class Questao32Codificador {
    public static void writeFile(String path, String content) throws IOException
    {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(path));
        bufferedWriter.append(content);
        bufferedWriter.close();
    }

    public static String encodeDecode(StringBuilder content, Map<Character, Character> codeMap)
    {
        for (int a = 0; a < content.length(); ++a) {
            if (codeMap.containsKey(content.charAt(a))) {
                content.setCharAt(a, codeMap.get(content.charAt(a)));
            }
        }

        return content.toString();
    }

    public static StringBuilder readFile(String path) throws IOException
    {
        BufferedReader bufferedReader = new BufferedReader(new FileReader(path));
        StringBuilder originalContent = new StringBuilder();

        String line = bufferedReader.readLine();
        while (line != null) {
            originalContent.append(line + "\n");
            line = bufferedReader.readLine();
        }
        bufferedReader.close();

        return originalContent;
    }

    public static void main(String[] args) {
        String sourcePath = "temp/questao32_arquivo_original.txt";
        String targetPath = "temp/questao32_arquivo_codificado.txt";

        Map<Character, Character> codeMap = new HashMap<Character, Character>();
        codeMap.put('Z', 'P');
        codeMap.put('E', 'O');
        codeMap.put('N', 'L');
        codeMap.put('I', 'A');
        codeMap.put('T', 'R');

        StringBuilder content;
        
        try {
            content = readFile(sourcePath);

            String encodedContent = encodeDecode(content, codeMap);

            writeFile(targetPath, encodedContent);
        } catch (IOException e) {
            System.out.println("Erro: IOException");
            e.printStackTrace();
        } catch (Exception e) {
            System.out.println("Erro geral!");
            e.printStackTrace();
        }
    }
}
