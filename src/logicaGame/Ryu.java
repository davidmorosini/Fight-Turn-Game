package logicaGame;

import AtaquesDefesasPersonagens.*;

public class Ryu extends Desarmados{
    
    public Ryu(String descricao) {
		super(descricao);
                
                //add ataques Boxeador
                super.ataquesEspecificos.add(new Ataques("Hadouken", "Raruuuuuuguen", 0.8));
                super.ataquesEspecificos.add(new Ataques("Tatsumaki Senpukyaku", "Tchap-tchap-tchap-tchura", 0.65));
                super.ataquesEspecificos.add(new Ataques("Shoryuken", "Róriuuuuuuguen", 0.69));
                
                //add defesas Boxeador
                super.defesasEspecificas.add(new Defesas("Block", "Block executado", 0.47));
	}
    
}
