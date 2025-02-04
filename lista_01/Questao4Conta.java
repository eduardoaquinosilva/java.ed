package lista_01;

public class Questao4Conta {
    private String owner;
    private String cpf;
    private double balance;
    
    public Questao4Conta() {}

    public Questao4Conta(String owner, String cpf) {
        this.owner = owner;
        this.cpf = cpf;
        this.balance = 0;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public double getBalance() {
        return this.balance;
    }

    public void deposit(double value) {
        this.balance += value;
    }

    public boolean withdraw(double value) {
        if (this.balance >= value) {
            this.balance -= value;
            return true;
        }

        return false;
    }

    public boolean tranfer(double value, Questao4Conta account) {
        if (this.balance >= value) {
            this.balance -= value;
            account.balance += value;
            return true;
        }

        return false;
    }

    @Override
    public String toString() {
        return "Questao4Conta [balance=" + balance + "]";
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        long temp;
        temp = Double.doubleToLongBits(balance);
        result = prime * result + (int) (temp ^ (temp >>> 32));
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
        Questao4Conta other = (Questao4Conta) obj;
        if (Double.doubleToLongBits(balance) != Double.doubleToLongBits(other.balance))
            return false;
        return true;
    }
}
