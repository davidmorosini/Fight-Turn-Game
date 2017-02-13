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
import logicaGame.*;

public class GUIAtaque extends javax.swing.JFrame {
    
    private ArrayList<Armas> armas;
    private ArrayList<Ataques> padroes; //lutas basicas
    private ArrayList<Ataques> lutas; //lutas especificas
    public int num = 0;
    private Socket conexao;
    private String meuNome;
    private double meuHp;
    private String origem;
    private Personagem p;
    
    public GUIAtaque(Personagem p, String origem, Socket conexao, double meuHp, String meuNome) {
        this.conexao = conexao;
        this.meuNome = meuNome;
        this.meuHp = meuHp;
        this.p = p;
        this.origem = origem;
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/icone.png")));
        initComponents();
        nomeaBtn();
    }
    
    public void desabilitaBtn(int botao){
        if(botao == 1){
            atk1.setEnabled(false);
        }else if(botao == 2){
            atk2.setEnabled(false);
        }else if(botao == 3){
            atk3.setEnabled(false);
        }
    } 
    
    public void habilitaBtn(){
        atk1.setEnabled(true);
        atk2.setEnabled(true);
        atk3.setEnabled(true);
    }

    private void nomeaBtn(){
        padroes = ((Combatente)p).listaAtaquesLutas();
        if(p instanceof CombatenteArmado){
            armas = ((CombatenteArmado)p).armasAtaqueDisponiveis();
            atk1.setText(armas.get(0).getNomeArma());
            atk2.setText(armas.get(1).getNomeArma());
            atk3.setText(armas.get(2).getNomeArma());
            atkP.setText("Básico");
        }else{
            lutas = ((Desarmados)p).ataquesDeLutador();
            if(p instanceof MMA){ //caso particular..
                atk1.setText("Taekwondo");
                atk2.setText("JiuJitsu");
                atk3.setText("Boxe");
            }else{
                atk1.setText(lutas.get(0).getGolpe());
                atk2.setText(lutas.get(1).getGolpe());
                atk3.setText(lutas.get(2).getGolpe());
            }
            atkP.setText("Básico");
        }   
        
    }
        
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        atk1 = new javax.swing.JRadioButton();
        atk2 = new javax.swing.JRadioButton();
        atk3 = new javax.swing.JRadioButton();
        atkP = new javax.swing.JRadioButton();
        jLabel1 = new javax.swing.JLabel();
        atkB = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setAlwaysOnTop(true);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setForeground(java.awt.Color.white);
        setResizable(false);

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        buttonGroup1.add(atk1);
        atk1.setText("Ataque 1");
        atk1.setFocusPainted(false);
        atk1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                atk1ActionPerformed(evt);
            }
        });

        buttonGroup1.add(atk2);
        atk2.setText("Ataque 2");
        atk2.setFocusPainted(false);

        buttonGroup1.add(atk3);
        atk3.setText("Ataque 3");
        atk3.setFocusPainted(false);

        buttonGroup1.add(atkP);
        atkP.setText("Ataque 4");
        atkP.setFocusPainted(false);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(atk1)
                    .addComponent(atk3))
                .addGap(49, 49, 49)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(atkP)
                    .addComponent(atk2))
                .addContainerGap(59, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(atk1)
                    .addComponent(atk2))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(atk3)
                    .addComponent(atkP))
                .addContainerGap(17, Short.MAX_VALUE))
        );

        jLabel1.setText("Escolha seu Ataque");

        atkB.setText("Atacar!");
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
                                .addGap(125, 125, 125)
                                .addComponent(atkB))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(111, 111, 111)
                                .addComponent(jLabel1)))
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
        ObjetoTransporteGame dados = null;
        Ataques ataqueEscolhido = null;
        boolean basico = false;
        if(atk1.isSelected()){
            num = 1;  
        }
        if(atk2.isSelected()){
            num = 2;
        }
        if(atk3.isSelected()){
            num = 3;
        }
        if(atkP.isSelected()){
            num = -1;
            ataqueEscolhido = padroes.get((int)(Math.random() * padroes.size())); //escolhe um dos ataques basicos 
            dados = new ObjetoTransporteGame(meuNome, meuHp, ataqueEscolhido, null);
            basico = true;
        }
                     
        if(!basico){ //(num - 1) é para aproveitar o indice que vai até 2 somente
            if(p instanceof CombatenteArmado){
                double valor = Math.random();
                Armas armaEscolhida = armas.get(num - 1);
                Golpes golpeEscolhido;
                if(valor < 0.5){
                    golpeEscolhido = armaEscolhida.getGolpe1();
                }else{
                    golpeEscolhido = armaEscolhida.getGolpe2(); 
                }
                ataqueEscolhido = new Ataques(armaEscolhida.getNomeArma(), golpeEscolhido.getDescricao(), golpeEscolhido.getDano());
                dados = new ObjetoTransporteGame(meuNome, meuHp, ataqueEscolhido, null);
            }else{
                if(p instanceof MMA){
                    if(num == 1){ //takwondo
                        ataqueEscolhido = ((MMA)p).getTaekwondo().get((int)(Math.random() * ((MMA)p).getTaekwondo().size()));
                    }
                    if(num == 2){ //takwondo
                        ataqueEscolhido = ((MMA)p).getJiuJitsu().get((int)(Math.random() * ((MMA)p).getJiuJitsu().size()));
                    }
                    if(num == 3){ //takwondo
                        ataqueEscolhido = ((MMA)p).getBoxe().get((int)(Math.random() * ((MMA)p).getBoxe().size()));
                    }
                }else{
                    ataqueEscolhido = ((Desarmados)p).ataquesDeLutador().get((int)(Math.random() * ((Desarmados)p).ataquesDeLutador().size()) );
                }
                dados = new ObjetoTransporteGame(meuNome, meuHp, ataqueEscolhido, null);
            }           
        }
    
        try{
            Protocolo novo = new Protocolo("ataque", origem, dados); //origem = player1 | player2
            ObjectOutputStream enviar = new ObjectOutputStream(conexao.getOutputStream());
            enviar.writeObject(novo);
        } catch (IOException ex) {
            Logger.getLogger(GUIAtaque.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        dispose();
    }//GEN-LAST:event_atkBActionPerformed

    private void atk1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_atk1ActionPerformed
    }//GEN-LAST:event_atk1ActionPerformed

    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton atk1;
    private javax.swing.JRadioButton atk2;
    private javax.swing.JRadioButton atk3;
    private javax.swing.JButton atkB;
    private javax.swing.JRadioButton atkP;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
