package logicaGame;

import java.util.ArrayList;

public class Armas {
	private String nomeArma;
	private Golpes golpe1;
        private Golpes golpe2;
        
        Armas(String nome, Golpes golpe1, Golpes golpe2){
            this.nomeArma = nome;
            this.golpe1 = golpe1;
            this.golpe2 = golpe2;
	}
        
	public String getNomeArma() {
		return this.nomeArma;
	}

        public Golpes getGolpe1(){
            return this.golpe1;
        }	
        
        public Golpes getGolpe2(){
            return this.golpe2;
        }

}
