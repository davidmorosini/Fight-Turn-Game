package Protocolo;


import java.io.*;

public class Protocolo implements Serializable{
    private String comando;
    private String origem;
    private Object dados;
    
    
    /*  origem:     - servidor
                    - espectador
                    - player1
                    - player2
        
        comando:    - atacar   = libera o player para ataque
                    - defender = libera para o player defender (enviou o objetoTransporteGame)
                    - msg      = plotar msg no chat
                    - ataque   = ataque de um dos players (somente para players)
                    - defesa   = defesa de um dos players (somente para players)
                    - stream   = plotar no quadro de stream (somente para espectadores)
                    - player   = fala para o player se ele e o 1 ou o 2
                    - start    = plota os nomes de ambos players e seus lifes (passa um Obj..Transp..Stream e usa so o necessario)
                    - seunome  = pergunta ao player o nome dele
                    - meunome  = devolve ao servidor o nome do player
                    - erro     = plota no servidor [origem]:[erro]
                    - att      = forma diferende de att as ifns dos playaers (somente para players)
    */
   
    public Protocolo(String comando, String origem, Object dados){
        this.comando = comando;
        this.origem = origem;
        this.dados = dados;        
    }
    
    public String getComando(){
        return this.comando;
    }
    
    public String getOrigem(){
        return this.origem;
    }
    
    public Object getDados(){
        return this.dados;
    }
       
}
