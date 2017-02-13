package AtaquesDefesasPersonagens;

import java.io.Serializable;

public class ObjetoTransporteStream implements Serializable{
	private String playerAtacou;
        private String playerDefendeu;
        private double hpPlayerAtacou;
        private double hpPlayerDefendeu;
        private Ataques ataque;
        private Defesas defesa;
        private String quemAtacou;
        
        public ObjetoTransporteStream(String pA, String pD, double hpA, double hpD, Ataques dA, Defesas dD, String quemAtacou){
            playerAtacou = pA;
            playerDefendeu = pD;
            hpPlayerAtacou = hpA;
            hpPlayerDefendeu = hpD;
            ataque = dA;
            defesa = dD;
            this.quemAtacou = quemAtacou; 
        }
        
        public String getPlayerAtacou(){
            return this.playerAtacou;
        }
        
        public String getPlayerDefendeu(){
            return this.playerDefendeu;
        }
	
        public double getHpPlayerAtacou(){
            return this.hpPlayerAtacou;
        }
        
        public double getHpPlayerDefendeu(){
            return this.hpPlayerDefendeu;
        }
        
        public Ataques getAtaque(){
            return this.ataque;
        }
        
        public Defesas getDefesa(){
            return this.defesa;
        }
        
        public String getQuemAtacou(){
            return this.quemAtacou;
        }
   
}
