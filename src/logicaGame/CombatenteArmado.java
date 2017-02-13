package logicaGame;
import java.util.ArrayList;

public abstract class CombatenteArmado extends Combatente {
        protected ArrayList<Armas> listaArmas;
	protected ArrayList<ArmasDefesa> defesa;
	
	CombatenteArmado(String descricao) {
            super(descricao);
            listaArmas = new ArrayList<Armas>();
            defesa =  new ArrayList<ArmasDefesa>();
	}
        			       
        public ArrayList<Armas> armasAtaqueDisponiveis(){
            return this.listaArmas;
        }
        
        public ArrayList<ArmasDefesa> armasDefesaDisponiveis(){
            return this.defesa;
        }
        
        public double getHabilidadeArmados(){
            double aux = 0;
            for(Armas auxArmado : listaArmas){
                aux += (((auxArmado.getGolpe1().getDano() + auxArmado.getGolpe2().getDano()) / 2) / listaArmas.size());
            }
            aux *= 0.45;
            return ((aux + super.getHabilidadeAtaque()) / 0.75); 
        }
        
        public double getHabArmadosDefesa(){
            double aux = 0;
            for(ArmasDefesa auxArmado : defesa){
                aux += (auxArmado.getReducao() / defesa.size());
            }
            aux *= 0.45;
            return ((aux + super.getHabilidadeAtaque()) / 0.75); 
        }

	

}
