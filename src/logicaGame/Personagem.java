package logicaGame;

public abstract class Personagem {
	
	private double hp; 
	private String descricao;
	
	Personagem(String descricao){
		this.descricao = descricao;
		this.hp = 1;
	}
	
	public boolean estaVivo(){
		return (hp > 0)?true:false;
	}
	
	public String getDescricao() {
		return descricao;
	}
	
	public double getHp() {
		return hp;
	}


	public void setHp(double hp) {
		this.hp = hp;
	}


}
