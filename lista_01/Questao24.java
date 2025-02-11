package lista_01;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import lista_01.Questao23.Pessoa;

public class Questao24 {
    @SuppressWarnings("unchecked")
    private static List<Object> readFile(String path) throws IOException, ClassNotFoundException
    {
        List<Object> objects = new ArrayList<Object>();

        File file = new File(path);

        if (file.exists()) {
            ObjectInputStream objInput = new ObjectInputStream(new FileInputStream(file));
            objects = (ArrayList<Object>) objInput.readObject();
            objInput.close();
        }

        return objects;
    }

    private static <E> void writeFile(String path, E[] objects) throws IOException
    {   
        File file = new File(path);
        file.delete();
        file.createNewFile();

        ObjectOutputStream objOutput = new ObjectOutputStream(new FileOutputStream(file));

        objOutput.writeObject(objects);
        objOutput.close();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        scanner.useLocale(Locale.US);
        Locale.setDefault(Locale.US);

        System.out.print("Quantidade de pessoas: ");
        int quantity = scanner.nextInt();

        Pessoa[] people = new Pessoa[quantity];

        System.out.println();
        for (int a = 0; a < quantity; ++a) {
            System.out.println("Pessoa #" + (a + 1));
            
            System.out.print("CPF: ");
            String cpf = scanner.next();

            System.out.print("Nome: ");
            scanner.nextLine();
            String name = scanner.nextLine();

            System.out.print("Idade: ");
            int age = scanner.nextInt();

            System.out.print("Sexo: ");
            String gender = scanner.next();

            System.out.print("Peso (kg): ");
            float weight = scanner.nextFloat();

            System.out.print("Altura (m): ");
            float height = scanner.nextFloat();

            System.out.println();

            people[a] = new Pessoa(cpf, name, age, gender, weight, height);
        }
        scanner.close();

        try {
            String path = "temp/questao24.dat";
            writeFile(path, people);
        } catch (IOException e) {
            System.out.println("Erro na escrita do arquivo!");
            e.printStackTrace();
        }

        try {
            String path = "temp/questao24.dat";
            List<Object> peopleRead = readFile(path);

            for (Object object : peopleRead) 
			{
				Pessoa myObj = (Pessoa) object;
				System.out.print(myObj.toString());
			}
        } catch (IOException e) {
            System.out.println("Erro na leitura do arquivo: IOException!");
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            System.out.println("Erro na leitura do arquivo: ClassNotFoundException!");
            e.printStackTrace();
        }
    }
}
