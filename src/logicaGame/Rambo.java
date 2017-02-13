package logicaGame;

import AtaquesDefesasPersonagens.Ataques;
import AtaquesDefesasPersonagens.Defesas;
import java.util.ArrayList;

public class Rambo extends CombatenteArmado{
    
    public Rambo(String descricao) {
        super(descricao);
        super.listaArmas.add(new Armas("Faca", new Golpes("Facada", 0.99), new Golpes("Facada", 0.99)));
	super.listaArmas.add(new Armas("Flecha", new Golpes("Flechada", 0.99), new Golpes("Flechada", 0.99)));
	super.listaArmas.add(new Armas("Ponto 50", new Golpes("Rajada", 0.99), new Golpes("Rajada", 0.99)));
	super.defesa.add(new ArmasDefesa("Escudo", "O escudo do Gladiador é tora", 0.99));
        super.defesas = new ArrayList<Defesas>();
        super.defesas.add(new Defesas("Defesa Padrão", "Defesa padrão do Rambo", 0.99));
        super.ataques = new ArrayList<Ataques>();
        super.ataques.add(new Ataques("Ataque Padrão", "Ataque Padrão do Rambo", 0.99));
    }
    
    public double getHabilidadeArmados(){
        return 0.99;
    }
     
    public double getHabArmadosDefesa(){
        return 0.99;
    }
}
