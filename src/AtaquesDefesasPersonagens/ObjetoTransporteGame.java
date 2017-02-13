package AtaquesDefesasPersonagens;

import java.io.Serializable;

public class ObjetoTransporteGame implements Serializable{
	private String nome;
	private double hp;
        private Ataques ataque;
        private Defesas defesa;
        
        public ObjetoTransporteGame(String nome, double hp, Ataques ataque, Defesas defesa){
            this.nome = nome;
            this.hp = hp;
            this.ataque = ataque;
            this.defesa = defesa;
        }
        
        //só possui gets para garantir que o outro player nao altere nada
        
        public String getNome(){
            return this.nome;
        }
	
        public double getHp(){
            return this.hp;
        }
        
        public Ataques getAtaque(){
            return this.ataque;
        }
           
}
