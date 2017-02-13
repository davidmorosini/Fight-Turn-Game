package logicaGame;

import AtaquesDefesasPersonagens.*;

//personagem pronto

public class Boxeador extends Desarmados{
	 
	public Boxeador(String descricao) {
		super(descricao);
                
                //add ataques Boxeador
                super.ataquesEspecificos.add(new Ataques("Upper", getDescricao() + " atacou com um UpperCut!", 0.45));
                super.ataquesEspecificos.add(new Ataques("Jab", "Mais um Jab do " + getDescricao(), 0.4));
                super.ataquesEspecificos.add(new Ataques("Gancho", getDescricao() + " atacou com Um Gancho top!", 0.69));
                
                //add defesas Boxeador
                super.defesasEspecificas.add(new Defesas("Guarda", getDescricao() + " realiza uma boa guarda, tipica do Boxe", 0.54));
	}
        
}
