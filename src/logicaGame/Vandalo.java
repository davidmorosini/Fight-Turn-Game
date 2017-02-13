package logicaGame;

import AtaquesDefesasPersonagens.Defesas;

public class Vandalo extends CombatenteArmado {

	public Vandalo(String descricao) {
		super(descricao);
		super.listaArmas.add(new Armas("Pé de Cabra", new Golpes("Porrada", 0.67), new Golpes("Alavancada", 0.78)));
		super.listaArmas.add(new Armas("Taco de Baseball", new Golpes("Swing", 0.67), new Golpes("Homerun", 0.8)));
		super.listaArmas.add(new Armas("Escopeta", new Golpes("Disparo", 0.89), new Golpes("Tiro-No-Cego", 0.67)));
		
                //add defesas de Vandalo
                super.defesas.add(new Defesas("Meter o pé", "Eu " + getDescricao() + " vou e meter o pé,\n vaaaaaaaleus falooooooooous!", 0.6));
        
	}

}
