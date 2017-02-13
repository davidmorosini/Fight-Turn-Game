package logicaGame;

import AtaquesDefesasPersonagens.*;
import java.util.ArrayList;

public abstract class Desarmados extends Combatente{
    protected ArrayList<Ataques> ataquesEspecificos;
    protected ArrayList<Defesas> defesasEspecificas;

    public Desarmados(String descricao) {
        super(descricao);
        this.ataquesEspecificos = new ArrayList<Ataques>();
        this.defesasEspecificas = new ArrayList<Defesas>();
    }
	
        			       
    public ArrayList<Ataques> ataquesDeLutador(){
        return this.ataquesEspecificos;
    }
        
    public ArrayList<Defesas> defesasDeLutador(){
        return this.defesasEspecificas;
    }
    
    public double getHabilidadeDesarmados(){
        double aux = 0;
        for(Ataques auxLutador : ataquesEspecificos){
            aux += (auxLutador.getDano() / ataquesEspecificos.size());
        }
        aux *= 0.45;
        return ((aux + super.getHabilidadeAtaque()) / 0.75); //0.85 é (0.5 + 0.35) são os pesos 
    }
    
    public double getHabDesarmadosDefesa(){
        double aux = 0;
        for(Defesas auxArmado : defesasEspecificas){
            aux += (auxArmado.getValor() / defesasEspecificas.size());
        }
        aux *= 0.45;
        return ((aux + super.getHabilidadeAtaque()) / 0.75); 
    }
}
