package logicaGame;

import AtaquesDefesasPersonagens.Defesas;

public class Ninja extends CombatenteArmado {

	public Ninja(String descricao) {
		super(descricao);
		super.listaArmas.add(new Armas("Katana", new Golpes("Eviscerar", 0.68), new Golpes("Cortar", 0.6)));
		super.listaArmas.add(new Armas("Shuriken", new Golpes("Leque", 0.43), new Golpes("Preciso", 0.56)));
		super.listaArmas.add(new Armas("Adaga", new Golpes("Rasgar", 0.56), new Golpes("Apunhalada", 0.54)));
		
                
                //add defesas de Ninja
                super.defesa.add(new ArmasDefesa("Cortina de Fumaça", "Uma cortina de fumaça faz com que o ataque seja desviado!", 0.86));
        }
}
