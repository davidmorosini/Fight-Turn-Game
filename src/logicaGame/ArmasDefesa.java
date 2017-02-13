package logicaGame;

public class ArmasDefesa {
	private String arma;
	private String descricao;
	private double reducao;
	
	
	ArmasDefesa(String arma, String descricao, double reducao){
		this.descricao = descricao;
		this.arma = arma;
		this.reducao = reducao;
	}
	
	public String getDescricao() {
		return descricao;
	}
	
	public double getReducao() {
		return reducao;
	}

	public String getArma() {
		return arma;
	}

}
