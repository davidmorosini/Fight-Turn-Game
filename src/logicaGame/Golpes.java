package logicaGame;

public class Golpes {
	 private String descricao;
	 private double dano;
	
	Golpes(String descricao, double dano){
		this.descricao = descricao;
		this.dano = dano;		
	}
                
	public String getDescricao() {
		return this.descricao;
	}

	public double getDano() {
		return this.dano;
	}

}
