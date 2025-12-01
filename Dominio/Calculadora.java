package IntroducaoMetodos.Dominio;

public class Calculadora {
    public int num1;
    public int num2;

    public Calculadora(int num1, int num2){
        this.num1 = num1;
        this.num2 = num2;
    }

    public int somarDoisNumeros(){
        return num1 + num2;
    }

    public int subtrairDoisNumeros(){
        return num1 - num2;
    }

    public int multiplicarDoisNumeros(){
        return num1 * num2;
    }

    public double dividirDoisNumeros(){
        return num1 / num2;
    }
}
