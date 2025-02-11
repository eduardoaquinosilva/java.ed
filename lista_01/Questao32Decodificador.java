package lista_01;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class Questao32Decodificador {
    public static void main(String[] args) {
        String sourcePath = "temp/questao32_arquivo_codificado.txt";
        String targetPath = "temp/questao32_arquivo_decodificado.txt";

        Map<Character, Character> codeMap = new HashMap<Character, Character>();
        codeMap.put('P', 'Z');
        codeMap.put('O', 'E');
        codeMap.put('L', 'N');
        codeMap.put('A', 'I');
        codeMap.put('R', 'T');

        StringBuilder content;
        
        try {
            content = Questao32Codificador.readFile(sourcePath);

            String encodedContent = Questao32Codificador.encodeDecode(content, codeMap);

            Questao32Codificador.writeFile(targetPath, encodedContent);
        } catch (IOException e) {
            System.out.println("Erro: IOException");
            e.printStackTrace();
        } catch (Exception e) {
            System.out.println("Erro geral!");
            e.printStackTrace();
        }
    }
}
