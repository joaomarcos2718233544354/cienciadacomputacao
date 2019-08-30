package app;

public class Produto {
    private String nome;
    private float  valor;

    public void setValor(float valor){
        this.valor = valor;
    }
    
    public float getValor(){
        return this.valor;
    }
    
    public void setNome(String nome){
        this.nome = nome;
    }
    
    public String getNome(){
        return this.nome;
    }
}
