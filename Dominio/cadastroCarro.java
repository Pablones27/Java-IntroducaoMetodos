package IntroducaoMetodos.Dominio;

public class cadastroCarro {
    private String marca;
    private String modelo;
    private int ano;
    private double preco;

    public cadastroCarro (String marca, String modelo, int ano, double preco){
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.preco = preco;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public int getAno() {
        return ano;
    }

    public double getPreco() {
        return preco;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public void setPreco(double preco) {
        if (preco > 0 ){
            this.preco = preco;
        }else{
            System.out.println("Preço inválido!");
        }
    }

    public void mostrarInfo(){
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Ano: " + ano);
        System.out.println("Valor: R$" + preco);
    }

    public void alterarValor(double novoValor){
        if (novoValor > 0){
            this.preco = novoValor;
        }else{
            System.out.println("Valor inválido!");
        }
    }

    public void listarCarrosCaros(){
        if (preco > 150000){
            mostrarInfo();
        }
    }

}
