
package AtaquesDefesasPersonagens;

import java.io.Serializable;

public class Ataques implements Serializable{
    private String golpe;
    private String descricao;
    private double dano;

    public Ataques(String golpe, String descricao, double dano) {
        this.golpe = golpe;
        this.descricao = descricao;
        this.dano = dano;
    }

    public Ataques() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    public String getGolpe(){
        return this.golpe;
    }
    
    public void setGolpe(String golpe){
        this.golpe = golpe;
    }
    
    public String getDescricao(){
        return this.descricao;
    }
    
    public void setDescricao(String descricao){
        this.descricao = descricao;
    }
    
    public double getDano(){
        return this.dano;
    }
    
    public void setDano(double dano){
        this.dano = dano;
    }
    
  
}
