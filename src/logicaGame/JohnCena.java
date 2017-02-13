
package logicaGame;

import AtaquesDefesasPersonagens.*;
import java.util.ArrayList;


public class JohnCena extends Desarmados{
    
    public JohnCena(String descricao) {
        super(descricao);
        super.ataquesEspecificos.add(new Ataques("Voadora", "JOOOOHN CEEEENAAAAA", 0.99));
	super.ataquesEspecificos.add(new Ataques("U Can't See Me", "JOOOOHN CEEEENAAAAA", 0.99));
	super.ataquesEspecificos.add(new Ataques("MY NAME IS JOOOHN CENAAA", "JOOOOHN CEEEENAAAAA", 0.99));
	super.defesasEspecificas.add(new Defesas("Escudo", "O escudo do Gladiador é tora", 0.99));
        super.defesas = new ArrayList<Defesas>();
        super.defesas.add(new Defesas("Defesa Padrão", "Defesa padrão do JOOOHN CEEENA", 0.99));
        super.ataques = new ArrayList<Ataques>();
        super.ataques.add(new Ataques("Ataque Padrão", "Ataque Padrão do JOOOHN CEEENA", 0.99));
    }
    
    public double getHabilidadeDesarmados(){
        return 0.99;
    }
     
    public double getHabDesarmadosDefesa(){
        return 0.99;
    }
}
