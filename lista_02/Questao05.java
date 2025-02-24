package lista_02;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Scanner;

class LinkedList {
    class Node {
        private String word;
        private int counter;
        private Node next;

        public Node(String word) {
            this.word = word;
            this.counter = 1;
            this.next = null;
        }
    }

    private Node head;
    
    public LinkedList() {
        this.head = null;
    }

    public void addWord(String word)
    {
        Node current = head, previous = null;

        while (current != null) {
            if (current.word.equals(word)) {
                ++current.counter;
                return;
            }

            previous = current;
            current = current.next;
        }

        Node newNode = new Node(word);
        if (previous == null) {
            head = newNode;
        } else {
            previous.next = newNode;
        }
    }

    public void saveAsText(String path) throws IOException
    {
        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(path))) {
            Node current = head;

            while (current != null) {
                bufferedWriter.append(current.word + " " + current.counter + "\n");
                current = current.next;
            }
            bufferedWriter.close();
        }
    }

    public void saveAsBinary(String path) throws IOException
    {
        try (ObjectOutputStream output = new ObjectOutputStream(new FileOutputStream(path))) {
            Node current = head;

            while (current != null) {
                output.writeObject(current.word + " " + current.counter);
                current = current.next;
            }

            output.close();
        }
    }

    public static LinkedList loadFromText(String path) throws IOException
    {
        LinkedList linkedList = new LinkedList();
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(path))) {
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                String[] parts = line.split(" ");
                if (parts.length == 2) {
                    int counter = Integer.parseInt(parts[1]);
                    for (int i = 0; i < counter; ++i) {
                        linkedList.addWord(parts[0]);
                    }
                }
            }
        }

        return linkedList;
    }

    public static LinkedList loadFromBinary(String path) throws IOException, ClassNotFoundException
    {
        LinkedList linkedList = new LinkedList();

        try (ObjectInputStream input = new ObjectInputStream(new FileInputStream(path))) {
            while (true) {
                try {
                    String line = (String) input.readObject();
                    String[] parts = line.split(" ");
                    int counter = Integer.parseInt(parts[1]);

                    for (int i = 0; i < counter; ++i) {
                        linkedList.addWord(parts[0]);
                    }
                } catch (EOFException e) {
                    break;
                }
            }
        }

        return linkedList;
    }

    public void printList()
    {
        Node current = head;

        while (current != null) {
            System.out.println(current.word + ": " + current.counter);
            current = current.next;
        }
    }
}

public class Questao05 {
    public static void main(String[] args) {
        String txtPath = "temp/lista02_questao05.txt";
        LinkedList wordList = new LinkedList();

        try (Scanner scanner = new Scanner(new File(txtPath))) {
            while (scanner.hasNext()) {
                String word = scanner.next().toLowerCase().replaceAll("[^a-zA-Z]", "");
                if (!word.isEmpty()) {
                    wordList.addWord(word);
                }
            }
        } catch (IOException e) {
            System.out.println("Erro: IOException");
            e.printStackTrace();
        } catch(Exception e) {
            System.out.println("Erro: Erro Geral");
            e.printStackTrace();
        }

        try {
            wordList.saveAsText("temp/lista02_questao05_output.txt");
            wordList.saveAsBinary("temp/lista02_questao05_output.bin");

            System.out.println("Frequência das palavras:");
            wordList.printList();

            System.out.println("\nCarregando do arquivo de texto...");
            LinkedList loadedText = LinkedList.loadFromText("temp/lista02_questao05_output.txt");
            loadedText.printList();

            System.out.println("\nCarregando do arquivo binário...");
            LinkedList loadedBinary = LinkedList.loadFromBinary("temp/lista02_questao05_output.bin");
            loadedBinary.printList();
        } catch (IOException e) {
            System.out.println("Erro: IOException");
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            System.out.println("Erro: ClassNotFoundException");
            e.printStackTrace();
        } catch (Exception e) {
            System.out.println("Erro: Erro Geral");
            e.printStackTrace();
        }
    }
}
