package logicaGame;

import AtaquesDefesasPersonagens.*;
import java.util.*;


public class MMA extends Desarmados{
    
        private ArrayList<Ataques> golpesTaekwondo;
        private ArrayList<Ataques> golpesJiuJitsu;
        private ArrayList<Ataques> golpesBoxe;

	public MMA(String descricao) {
		super(descricao);
                
                //ataques MMA
                //inserindo ataques Taekwondo
                golpesTaekwondo = new ArrayList<Ataques>();
                Ataques novo = new Ataques("Chute Alto", super.getDescricao() + " deu um FODENDO chute na cabeça do inimigo", 0.62);
                super.ataquesEspecificos.add(novo);
                golpesTaekwondo.add(novo);
                novo = new Ataques("Chute Lateral", super.getDescricao() + " deu um chute lateral no inimigo", 0.47);
                super.ataquesEspecificos.add(novo);
                golpesTaekwondo.add(novo);
                novo = new Ataques("Chute na Perna", super.getDescricao() + " deu um chute na perna do inimigo", 0.45);
                super.ataquesEspecificos.add(novo);
                golpesTaekwondo.add(novo);
                
                //inserindo ataques JiuJitsu
                golpesJiuJitsu = new ArrayList<Ataques>();
                novo = new Ataques("Mata Leão", "E tome Mata Leao do " + super.getDescricao(), 0.75);
                super.ataquesEspecificos.add(novo);
                golpesJiuJitsu.add(novo);
                novo = new Ataques("ArmLock", super.getDescricao() + " executa um ArmLock bem feito!", 0.55);
                super.ataquesEspecificos.add(novo);
                golpesJiuJitsu.add(novo);
                novo = novo = new Ataques("Finalização", "Acaaaaaaaaaaaaaaaaabou," + super.getDescricao() + " Finalizou o inimigo!", 0.9);
                super.ataquesEspecificos.add(novo);
                golpesJiuJitsu.add(novo);
                
                 //add ataques Boxeador
                golpesBoxe = new ArrayList<Ataques>();
                novo = new Ataques("Upper", super.getDescricao() + " atacou com um UpperCut!", 0.45);
                super.ataquesEspecificos.add(novo);
                golpesBoxe.add(novo);
                novo = new Ataques("Jab", "Mais um Jab do " + super.getDescricao(), 0.4);
                super.ataquesEspecificos.add(novo);
                golpesBoxe.add(novo);
                novo = new Ataques("Direto", "E tome Direto do " + super.getDescricao(), 0.7);
                super.ataquesEspecificos.add(novo);
                golpesBoxe.add(novo);
                novo = new Ataques("Gancho", super.getDescricao() + " atacou com Um Gancho top!", 0.55);
                super.ataquesEspecificos.add(novo);
                golpesBoxe.add(novo);
                novo = new Ataques("SuperMan", "SuuuuuuuuuuuuuuuuuuuuperMan, e a galera vai a loucura com o " + super.getDescricao(), 0.85);
                super.ataquesEspecificos.add(novo);
                golpesBoxe.add(novo);
                
                //Defesas MMA
                //add defesas JiuJitsu
                super.defesasEspecificas.add(new Defesas("Guarda Alta", "realiza uma boa guarda Alta, tipica do Jiu Jitsu", 0.6));
                
                //add defesas Boxeador
                super.defesasEspecificas.add(new Defesas("Guarda", "realiza uma boa guarda, tipica do Boxe", 0.54));
           
	}
        
        public ArrayList<Ataques> getTaekwondo(){
            return this.golpesTaekwondo;
        }
        
        public ArrayList<Ataques> getJiuJitsu(){
            return this.golpesJiuJitsu;
        }
        
        public ArrayList<Ataques> getBoxe(){
            return this.golpesBoxe;
        }
        
}