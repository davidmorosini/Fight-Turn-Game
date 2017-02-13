
package ClienteJogador;

import AtaquesDefesasPersonagens.Ataques;
import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.util.ArrayList;
import javax.swing.*;
import logicaGame.Armas;
import logicaGame.BamBam;
import logicaGame.BotCT;
import logicaGame.Gladiador;

public class EscolhasAtaque extends JFrame{
 
    EscolhasAtaque(){
        gui();
    }
    
    public void gui(){
        JButton btn = new JButton("Atacar");
        this.getContentPane().add(btn, BorderLayout.SOUTH);

        JPanel painel = botoes();
               
        this.getContentPane().add(painel, BorderLayout.CENTER);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);		
	this.setSize(250, 350);
	this.setResizable(false);
        this.setVisible(true);
        
    }
    
    public JPanel botoes(){
        ButtonGroup grupoBotoes = new ButtonGroup();
        JPanel painel;
        ArrayList<Ataques> atk;
        Gladiador p = new Gladiador("s");       
        atk = p.listaAtaquesLutas();
        
        ArrayList<Armas> armada;
        armada = p.armasAtaqueDisponiveis();
        
        painel = new JPanel(new GridLayout(atk.size() + armada.size(), 0));
        for(Ataques aux : atk){
            JRadioButton b = gerarRadio(aux.getGolpe());
            grupoBotoes.add(b);
            painel.add(b);            
        }
        
        for(Armas aux2 : armada){
            JRadioButton b = gerarRadio(aux2.getNomeArma());
            grupoBotoes.add(b);
            painel.add(b); 
        }
        return painel;
    }
    
    public JRadioButton gerarRadio(String nome){
        JRadioButton radio = new JRadioButton(nome);
        return radio;
    }
    
    
    public static void main(String[] args){
        EscolhasAtaque teste = new EscolhasAtaque();
    }
}
