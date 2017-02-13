package logicaGame;

import AtaquesDefesasPersonagens.*;

//Personagem pronto

public class BamBam extends Desarmados{

	public BamBam(String descricao) {
		super(descricao);
                
                //add ataques do BamBam
                super.ataquesEspecificos.add(new Ataques("Trapézio Descendente", "Sabe o que é isso aqui? ... Trapézio descendente", 0.6));
                super.ataquesEspecificos.add(new Ataques("àrvore", "BIIIIIIIIIIIIIIIIIIIII AQUI E BODYBUILDING PORRAAAAAAAAA\nVo derrubar tudo essas arvore do parque ibirapuera", 0.8));
                super.ataquesEspecificos.add(new Ataques("Negativa", "NEGATIVA, VAI, NEGATIVA NEGATIVA, NEGATIVA NEGATIVA, é 37 ANOS CARALHO", 0.49));
                
                //add defesas BamBam
                super.defesasEspecificas.add(new Defesas("Whey", "Hmmm.. vai dar não... \nQue não vai dar, não vai dar o que rapaaa\n Sai de casa comi pra caralho", 0.6));
        }
        
}
