package ClienteJogador;

import AtaquesDefesasPersonagens.*;
import Protocolo.Protocolo;
import java.awt.Toolkit;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;
import logicaGame.*;

public class GUIDefesa extends javax.swing.JFrame {
    
    public int num = 0;
    private ObjetoTransporteGame ataque;
    private Socket conexao;
    private Personagem p;
    private double meuHp;
    private String meuNome;
    private String origem;
    private static boolean conseguiu;
    private static boolean continuar;
    
    public GUIDefesa(String origem, String meuNome, double meuHp, Personagem p, ObjetoTransporteGame ataque, Socket conexao) {
        this.origem = origem;
        this.meuNome = meuNome;
        this.meuHp = meuHp;
        this.p = p;
        this.ataque = ataque;
        this.conexao = conexao;
        this.continuar = true;
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/icone.png")));
        initComponents();
    }
    
    public void desabilitaBtn(int botao){
        if(botao == 1)
            defEsp.setEnabled(false);
    }
    
    public void habilitaBtn(){
        defEsp.setEnabled(true);
    }
        
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        defEsp = new javax.swing.JRadioButton();
        bloq = new javax.swing.JRadioButton();
        dodge = new javax.swing.JRadioButton();
        jLabel1 = new javax.swing.JLabel();
        atkB = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        buttonGroup1.add(defEsp);
        defEsp.setText("Defesa Especial");
        defEsp.setFocusPainted(false);
        defEsp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                defEspActionPerformed(evt);
            }
        });

        buttonGroup1.add(bloq);
        bloq.setText("Bloqueio");
        bloq.setFocusPainted(false);

        buttonGroup1.add(dodge);
        dodge.setText("Esquiva (Tente a Sorte!)");
        dodge.setFocusPainted(false);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(77, 77, 77)
                .addComponent(dodge)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(defEsp)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 58, Short.MAX_VALUE)
                .addComponent(bloq)
                .addGap(42, 42, 42))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(defEsp)
                    .addComponent(bloq))
                .addGap(18, 18, 18)
                .addComponent(dodge)
                .addContainerGap(17, Short.MAX_VALUE))
        );

        jLabel1.setText("Escolha sua Defesa");

        atkB.setText("Defenda-se!");
        atkB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                atkBActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(111, 111, 111)
                                .addComponent(jLabel1))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(114, 114, 114)
                                .addComponent(atkB)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(atkB, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void atkBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_atkBActionPerformed
        if(defEsp.isSelected())
            num = 1;
        else
            num = -1;
        
        GUIskill eaiConsegue = new GUIskill();
        eaiConsegue.setVisible(true);
        EsperaResultadoBarrinha barrinha = new EsperaResultadoBarrinha();
        barrinha.start();
        dispose();
    }//GEN-LAST:event_atkBActionPerformed

    private void defEspActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_defEspActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_defEspActionPerformed

    public static void conseguiu(boolean v1, boolean v2){
        GUIDefesa.conseguiu = v1;
        GUIDefesa.continuar = v2;
    }
    
    private void enviarProtocolo(Protocolo protocolo){
        try {
            ObjectOutputStream saida = new ObjectOutputStream(conexao.getOutputStream());
            saida.writeObject(protocolo);
        } catch (IOException ex) {
            try{
                ObjectOutputStream saida = new ObjectOutputStream(conexao.getOutputStream());
                saida.writeObject(new Protocolo("erro", origem, "Erro ao enviar um protocolo de stream"));
            } catch (Exception ex1) {
                JOptionPane.showMessageDialog(null, "Não foi possível reportar o erro ao servidor, contate um adm.");
            }
        }
    }
    
    class EsperaResultadoBarrinha extends Thread{
        public void run(){
            Protocolo protocolo = null;   
            double valor = 1;
            ArrayList<Defesas> defDisponiveis;
            ArrayList<ArmasDefesa> armasDefesa;
            ArmasDefesa armaEscolhida;
            Defesas defEscolhida = null;
            Defesas defEspecial;
            Defesas defesaBasica = ((Combatente)p).listaDefesasLutas().get((int)(((Combatente)p).listaDefesasLutas().size() * Math.random()));
            
            while(continuar){
                System.out.println();
            }
            
            if(conseguiu){
                JOptionPane.showMessageDialog(null, "Parabéns soldado vc pode usar sua defesa!");
                if(p instanceof CombatenteArmado){
                    armasDefesa = ((CombatenteArmado)p).armasDefesaDisponiveis();
                    armaEscolhida = armasDefesa.get((int)(Math.random() * armasDefesa.size()));
                    defEspecial = new Defesas(armaEscolhida.getArma(), armaEscolhida.getDescricao(), armaEscolhida.getReducao());
                }else{
                    defEspecial = ((Desarmados)p).defesasDeLutador().get((int)(((Desarmados)p).defesasDeLutador().size() * Math.random()));
                }
       
                if(defEsp.isSelected()){
                    valor = 1 - defEspecial.getValor();
                    defEscolhida = defEspecial;
                }
                if(dodge.isSelected()){
                    if(Math.random() <= 0.15){ 
                        valor = 0; //se der esquiva mantem o valor do hp
                        defEscolhida = new Defesas("Esquiva", "Esquiva Realizada com sucesso!", 0);
                    }else{
                        valor = 1; //toma dano direto
                        defEscolhida = new Defesas("Dano Direto", "tentativa de Esquiva..., \na sorte não esta ao favor dele, tomou dano direto!", 0);
                    }
                }
                if(bloq.isSelected()){ //bloq.isSelected()
                    valor = 1 - defesaBasica.getValor();
                    defEscolhida = defesaBasica;
                }
            }else{
                JOptionPane.showMessageDialog(null, "Deu ruim fion, não és digno de se defender por enquanto!\nTente na próxima.");
                valor = 1; //toma dano direto
                defEscolhida = new Defesas("Dano Direto", "tentativa de Esquiva..., \na sorte não esta ao favor dele, tomou dano direto!", 0);      
            }
            meuHp = meuHp - (ataque.getAtaque().getDano() * valor); //genericao aqui 
            //enviarProtocolo(new Protocolo("att", origem, new InfsPlayers(meuNome, meuHp)));
            ObjetoTransporteStream stream;
            stream = new ObjetoTransporteStream(ataque.getNome(), meuNome, ataque.getHp(), meuHp, ataque.getAtaque(), defEscolhida, origem);
            String comando;
            if(meuHp <= 0){
                comando = "gameover";    
            }else{
                comando = "stream";    
            }
            protocolo = new Protocolo(comando, origem, stream);
            enviarProtocolo(protocolo);
            
        }
                
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton atkB;
    private javax.swing.JRadioButton bloq;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JRadioButton defEsp;
    private javax.swing.JRadioButton dodge;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
