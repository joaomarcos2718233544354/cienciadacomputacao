package app;

import java.util.Date;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        MateriaPrima a = new MateriaPrima("Água",1000);        
        MateriaPrima gdp = new MateriaPrima("Garrafa de Plástico",1000);

        
        double z = Math.random();
        int w = (int)(1+z*10000000-1);
        ProdutoAcabado nf = new ProdutoAcabado("Número de série");
        nf.setNome("Número de Série");
        nf.setNumFab(w);
        
        ProdutoAcabado emb = new ProdutoAcabado("Embalagem");
        GarrafaDeAgua gda = new GarrafaDeAgua("Garrafa de Água",1000);
      
        while(true){
            System.out.println("Quantas garrafas de um litro de água vc deseja?");
            Scanner teclado = new Scanner (System.in);
            int n1 = teclado.nextInt();
            
            if (a.getEstoque()<0){
                System.out.println("Desculpa, não temos essa quantidade em estoque");
                break;
            }
  
            a.subQtd(n1);
            gdp.subQtd(n1);
            
            if (a.getEstoque()<0){
                System.out.println("Desculpa, não temos essa quantidade em estoque");
                break;
            }

            System.out.println("O estoque ainda contém "+gdp.getEstoque()+" Garrafas de Água");
            System.out.println("Deseja fazer mais algum pedido? S/N");
            Scanner teclado2 = new Scanner (System.in);
            String c1 = (String)teclado2.nextLine();
            String resp = new String("N");
               
            if (c1.equals(resp)){
                break;
            }
            }
        
        int c=1;
        
        while (a.getEstoque()<1000&&a.getEstoque()>=0&&c==1){
        a.setTaxa(0.30); 
        gdp.setTaxa(0.10); 
        gda.setPreco(0.70);
        emb.setValorEmbalagem(10);
        
        int egda = 1000 - ((a.getEstoque()+gdp.getEstoque())/2);
        double pt = a.getValorImposto()+gdp.getValorImposto()+(egda*gda.getPreco())+emb.getValorEmbalagem();
        System.out.println("Você efetuou a compra de "+egda+" garrafas de água por "+pt+" reais");
        
        System.out.println("Deseja saber mais informações sobre a compra? S/N");
        Scanner teclado3 = new Scanner (System.in);
            String c2 = (String)teclado3.nextLine();
            String resp1 = new String("S");
       
        if (c2.equals(resp1)){
            System.out.println("O número de série do(s) produto(s) é: "+nf.getNumFab());
            Date data = new Date();
            System.out.println("A compra foi efetuada em "+data);
            System.out.println("O preço de cada garrafa de água é R$ 1.30 ");
            System.out.println("Deseja saber como esse preço foi calculado? S/N");
            
            Scanner teclado4 = new Scanner (System.in);
            String c3 = (String)teclado4.nextLine();
            String resp = new String("S");
          
            if (c3.equals(resp)){
                System.out.println("O preço da embalagem é R$ "+emb.getValorEmbalagem());
                System.out.println("O preço das garrafas de plástico compradas é R$ "+gdp.getValorImposto()+". O preço de cada unidade é R$ "+gdp.getValorImposto()/egda);
                System.out.println("O preço da água comprada é R$ "+a.getValorImposto()+" .O preço da água de cada garrafa é R$ "+a.getValorImposto()/egda);
                System.out.println("O preço da fabricação das garrafas de água compradas é de R$ "+gda.getPreco()*egda+" .O preço da fabricação de cada garrafa é de R$ "+gda.getPreco());
            }   
        } 
        c=c+1;
    }
        System.out.println("Fim da Aplicação");
}
    }
    

