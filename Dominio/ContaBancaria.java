package IntroducaoMetodos.Dominio;

public class ContaBancaria {
    private int numeroConta;
    private String titular;
    private double saldo;

    public ContaBancaria (int numeroConta, String titular, double saldo){
        this.numeroConta = numeroConta;
        this.titular = titular;
        this.saldo = saldo;
    }

    public int getNumeroConta(){
        return numeroConta;
    }

    public void setNumeroConta(){
        if (numeroConta > 0){
            this.numeroConta = numeroConta;
        }else {
            System.out.println("Número de conta inválido. Mantendo valor padrão (0).");
            this.numeroConta = 0;
        }
    }

    public String getTitular(){
        return titular;
    }

    public void setTitular(String titular){
        this.titular = titular;
    }

    public double getSaldo(){
        return saldo;
    }

    public void setSaldo(){
        if (saldo < 0){
            System.out.println("Saldo negativo: " + saldo);
            this.saldo = saldo;
        }else {
            this.saldo = saldo;
        }
    }

    public void mostrarConta(){
        System.out.println("Titular da conta: " + titular);
        System.out.println("Número da conta: " + numeroConta);
        System.out.println("Saldo da conta: " + saldo);
        System.out.println("\n--------------------------------");
    }
}
