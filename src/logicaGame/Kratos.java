package logicaGame;

public class Kratos extends CombatenteArmado{
    
    public Kratos(String descricao) {
        super(descricao);
        super.listaArmas.add(new Armas("Athena's blades", new Golpes("Blade vermelha, tempestade", 0.71), new Golpes("Blade dourada, agora a porra ficou séria", 0.81)));
	super.listaArmas.add(new Armas("Barbarian Hammer", new Golpes("Bater", 0.69), new Golpes("Combo Bater", 0.83)));
	super.listaArmas.add(new Armas("Blade of Olympus ", new Golpes("A lendária espada criada por Zeus, Raios cortantes", 0.83), new Golpes("Golpe de Zeus", 0.9)));
	super.defesa.add(new ArmasDefesa("Cabeça da Medusa", "Kratos usa a cabeça da medusa e transforma seu inimigo em pedra", 0.41));
	super.defesa.add(new ArmasDefesa("Grito", "Kratos solta um grunhido imponente que assusta o inimigo!", 0.3));
		
        
    }
    
}
