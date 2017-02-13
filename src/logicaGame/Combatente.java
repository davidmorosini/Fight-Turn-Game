package logicaGame;

import AtaquesDefesasPersonagens.*;
import java.util.*;

public abstract class Combatente extends Personagem{
        protected ArrayList<Ataques> ataques;
        protected ArrayList<Defesas> defesas;
        
	Combatente(String descricao) {
            super(descricao);
            ataques = new ArrayList<Ataques>();
            defesas = new ArrayList<Defesas>();
            
            //setando ataques padrao
            ataques.add(new Ataques("Soco", "Um soco basico de leve!", 0.25));
            ataques.add(new Ataques("Chute", "Um chute basico de leve!", 0.3));
            ataques.add(new Ataques("Chute no saco", "Aqui é briga de rua! Chute no saco do inimigo", 0.54));
            ataques.add(new Ataques("Dedo no olho", "Aqui é briga de rua! Dedo no olho do inimigo", 0.65));
            ataques.add(new Ataques("Rasteira", "Aqui é briga de rua! Tome rasteira no inimigo", 0.25));
            ataques.add(new Ataques("Murro no pescoço", "Aqui é briga de rua! Murro no pescoço do inimigo", 0.25));
            ataques.add(new Ataques("Murro no saco", "Aqui é briga de rua! Murro no saco do inimigo", 0.25));
            
            //setando defesas padrao
            defesas.add(new Defesas("Bloqueio", "O Inimigo se defende com um Bloqueio bem executado!", 0.3));
            defesas.add(new Defesas("Jogar Areia", "Parece que o jogo virou.. O Combatente joga areia no inimigo\n e deixou ele atordoado.\n", 0));
            //0 significa que o ataque não atingiu o oponente
	}
        
        public ArrayList<Ataques> listaAtaquesLutas(){
            return this.ataques;
        }
        public ArrayList<Defesas> listaDefesasLutas(){
            return this.defesas;
        }
        
        public double getHabilidadeAtaque(){
            double auxBasicos = 0;
            for(Ataques auxPadrao : ataques){
                auxBasicos += (auxPadrao.getDano() / ataques.size());
            }
            return auxBasicos * 0.3;
        }
        
        public double getHabilidadeDefesa(){
            double auxBasicos = 0;
            for(Defesas auxPadrao : defesas){
                auxBasicos += (auxPadrao.getValor() / defesas.size());
            }
            return auxBasicos * 0.3;
        }
}
