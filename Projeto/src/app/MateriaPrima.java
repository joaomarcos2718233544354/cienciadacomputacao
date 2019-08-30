package app;

public class MateriaPrima extends Produto {
       
    private double taxa;
    private int   estoque;
    
    public MateriaPrima(String nome, int qtd){
        this.estoque = qtd;
        super.setNome(nome);
    }
    
    public int addQtd(int qtd){
        this.estoque = this.getEstoque() + qtd;
        return this.getEstoque();
    }
    
    public int subQtd(int qtd){
        this.estoque = this.getEstoque() - qtd;
        return this.getEstoque();
    }
    
    public double getValorImposto(){
        int qtdi = 1000;        
        return (double) ((qtdi - this.getEstoque())*1.5*this.getTaxa());
    }
    
    public double getValorImposto(float taxa){
        this.setTaxa(taxa);
        return (double) ((1000 - this.getEstoque())*1.5)*this.getTaxa();
    }
    
    public void setNome(String nome){
        if (this.getEstoque() == 0){
            super.setNome(nome);
        }else {
            System.out.println("..|ERRO: Nome produto nao pode ser alterado com estoque maior que 0");
        } 
    }
    
    public void setTaxa(double taxa){ 
        this.taxa = taxa;
    }
    
    public double getTaxa(){ 
        return this.taxa;
    }
    
    public void setEstoque(int estoque){  
        if (this.estoque == 0){
            this.estoque = estoque;   
        } else {
            System.out.println("..|ERRO: Materia Prima ja possui qtd em estoque");
        }
    }
    
    public int getEstoque() {
        return this.estoque;
    }
}
