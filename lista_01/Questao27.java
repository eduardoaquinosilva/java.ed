package lista_01;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Map;

public class Questao27 {
    private static String readFile(String path) throws IOException
    {
        BufferedReader bufferedReader = new BufferedReader(new FileReader(path));
        StringBuffer output = new StringBuffer();
        
        String line = bufferedReader.readLine();
        while (line != null) {
            output.append(line + "\n");
            line = bufferedReader.readLine();
        }
        bufferedReader.close();

        return output.toString();
    }

    private static void writeFile(String path, StringBuilder inputText) throws IOException
    {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(path));
        bufferedWriter.append(inputText);
        bufferedWriter.close();
    }

    public static void main(String[] args) {
        String statement = "estude muito sempre sempre estude";

        Map<String, Integer> wordsMap = Questao26.countWords(statement);

        StringBuilder fullStringResponse = new StringBuilder();

        for (String key : wordsMap.keySet()) {
            fullStringResponse.append(key + ";"); 
        }
        fullStringResponse.append("\n");
        for (String key : wordsMap.keySet()) {
            fullStringResponse.append(wordsMap.get(key) + ";");
        }

        try {
            String path = "temp/questao27.csv";
            writeFile(path, fullStringResponse);
        } catch (IOException e) {
            System.out.println("Erro: IOException");
            e.printStackTrace();
        } catch (Exception e) {
            System.out.println("Erro geral!");
            e.printStackTrace();
        }

        try {
            String path = "temp/questao27.csv";
            String outputText = readFile(path);
            System.out.println(outputText);
        } catch (IOException e) {
            System.out.println("Erro: IOException");
            e.printStackTrace();
        } catch (Exception e) {
            System.out.println("Erro geral!");
            e.printStackTrace();
        }
    }
}
