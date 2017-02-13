package logicaGame;

import java.util.ArrayList;

public class BotCT extends CombatenteArmado{

	public BotCT(String descricao){
            super(descricao);
            super.listaArmas.add(new Armas("M4-A1", new Golpes("Rajada", 0.75), new Golpes("Coronhada", 0.36)));
            super.listaArmas.add(new Armas("Granada", new Golpes("Longe do Alvo", 0.42), new Golpes("Perto do Alvo", 0.7)));
            super.listaArmas.add(new Armas("Peixeira", new Golpes("Raspão", 0.38), new Golpes("Lambida", 0.7)));
            super.defesa.add(new ArmasDefesa("Colete", "O colete do Bot é sinistro", 0.27));
		
	}
	
	
		
}
