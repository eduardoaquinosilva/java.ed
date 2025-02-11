package lista_01;

import java.io.Serializable;
import java.text.DecimalFormat;
import java.util.Locale;
import java.util.Scanner;

public class Questao23 {
    static class Pessoa implements Comparable<Pessoa>, Serializable
    {
        private String cpf;
        private String name;
        private int idade;
        private String sexo;
        private float peso;
        private float altura;
        private double imc;

        public Pessoa() {}

        public Pessoa(String cpf, String name, int idade, String sexo, float peso, float altura) {
            this.setCpf(cpf);
            this.setName(name);
            this.setIdade(idade);
            this.setSexo(sexo);
            this.setPeso(peso);
            this.setAltura(altura);
            this.calculateImc(peso, altura);
        }

        public String getCpf() {
            return cpf;
        }
        
        public String getName() {
            return name;
        }
        
        public int getIdade() {
            return idade;
        }
        
        public String getSexo() {
            return sexo;
        }
        
        public float getPeso() {
            return peso;
        }
        
        public float getAltura() {
            return altura;
        }
        
        public double getImc() {
            return imc;
        }
        
        public void setCpf(String cpf) {
            this.cpf = cpf;
        }
        
        public void setName(String name) {
            this.name = name;
        }
        
        public void setIdade(int idade) {
            this.idade = idade;
        }
        
        public void setSexo(String sexo) {
            this.sexo = sexo;
        }
        
        public void setPeso(float peso) {
            this.peso = peso;
        }
        
        public void setAltura(float altura) {
            this.altura = altura;
        }

        private void calculateImc(float peso, float altura) {
            this.imc = (double) peso / (altura * altura);
        }

        @Override
        public String toString() {
            DecimalFormat df = new DecimalFormat("0.00");

            return "Pessoa [cpf=" + cpf + ", name=" + name + ", idade=" + idade + ", sexo=" + sexo + ", peso=" + df.format(peso) + ", altura=" + df.format(altura) + ", imc=" + df.format(imc) + "]";
        }

        @Override
        public int hashCode() {
            final int prime = 31;
            int result = 1;
            result = prime * result + ((cpf == null) ? 0 : cpf.hashCode());
            return result;
        }

        @Override
        public boolean equals(Object obj) {
            if (this == obj)
                return true;
            if (obj == null)
                return false;
            if (getClass() != obj.getClass())
                return false;
            Pessoa other = (Pessoa) obj;
            if (cpf == null) {
                if (other.cpf != null)
                    return false;
            } else if (!cpf.equals(other.cpf))
                return false;
            return true;
        }

        @Override
        public int compareTo(Pessoa o) {
            return this.cpf.compareTo(o.cpf);
        }
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

        DecimalFormat df = new DecimalFormat("0.00");

        System.out.println("***** PESSOAS REGISTRADAS *****");
        for (int a = 0; a < quantity; ++a) {
            System.out.println("Pessoa #" + (a + 1));
            System.out.println("CPF: " + people[a].getCpf());
            System.out.println("Nome: " + people[a].getName());
            System.out.println("Idade: " + people[a].getIdade());
            System.out.println("Sexo: " + people[a].getSexo());
            System.out.println("Peso: " + people[a].getPeso() + "kg");
            System.out.println("Altura: " + people[a].getAltura() + "m");
            System.out.println("IMC: " + df.format(people[a].getImc()));
            System.out.println();
        }
    }
}
