package AtaquesDefesasPersonagens;

import java.io.*;

public class InfsPlayers implements Serializable{
    private String p1;
    //private String p2;
    private double hp1;
    //private double hp2;
    
    public InfsPlayers(String p1, double hp1){
        this.p1 = p1;
        this.hp1 = hp1;
        //this.p2 = p2;
        //this.hp2 = hp2;
    }
    
    public String getP1(){
        return this.p1;
    }
    
    public double getHp1(){
        return this.hp1;
    }
    
    /*public String getP2(){
        return this.p2;
    }
    
    public double getHp2(){
        return this.hp2;
    }
    */
}
