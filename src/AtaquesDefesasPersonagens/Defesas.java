
package AtaquesDefesasPersonagens;

import java.io.Serializable;

public class Defesas implements Serializable{
    private String arma;
    private String descricao;
    private double valor;
    
    public Defesas(String arma, String descricao, double valor){
        this.arma = arma;
        this.descricao = descricao;
        this.valor = valor;
    }
    
    public String getArma(){
        return this.arma;
    }
 
    public String getDescricao(){
        return this.descricao;
    }
  
    public double getValor(){
        return this.valor;
    }
    
}
