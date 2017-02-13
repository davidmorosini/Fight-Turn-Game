package logicaGame;

public class Gladiador extends CombatenteArmado {
	
	public Gladiador(String descricao) {
		super(descricao);
		super.listaArmas.add(new Armas("Espada", new Golpes("Cortar", 0.44), new Golpes("Perfurar", 0.54)));
		super.listaArmas.add(new Armas("Lança", new Golpes("Furar", 0.38), new Golpes("Fincar", 0.64)));
		super.listaArmas.add(new Armas("Maça", new Golpes("Bater", 0.42), new Golpes("Esmagar", 0.62)));
		super.defesa.add(new ArmasDefesa("Escudo", "O escudo do Gladiador é tora", 0.5));
		super.defesa.add(new ArmasDefesa("Armadura", "Com essa armadura, o gladiador tem uma boa vantagem!", 0.81));
		
	}
}
