package ClienteJogador;

import AtaquesDefesasPersonagens.*;
import ClienteEspectador.EspectadorGUI;
import Protocolo.Protocolo;
import java.awt.Color;
import java.awt.Toolkit;
import java.io.*;
import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;
import logicaGame.*;

public class PlayerGUI extends javax.swing.JFrame{

    private Socket conexao;
    private String ip;
    private int porta;
    private boolean estaOnline;

    private String qualPlayerSou;
    private String nomeUsuario;
    private double hp;
    private static Personagem personagem;
    private ObjetoTransporteGame ataque;
    
    GUISelect guiSelect;
    GUIAtaque guiAtaque;
    GUIDefesa guiDefesa;
    static int numAtaque;
    static int numDefesa;
    
    public PlayerGUI() {
        super("Player");
        this.estaOnline = false;
        numAtaque = 0;
        numDefesa = 0;
        this.ip = "127.0.0.1";
        this.porta = 25000;
        this.hp = 1;
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/icone.png")));
        initComponents();
        btnAtaque.setEnabled(false);
        btnDefesa.setEnabled(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtChat = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtGame = new javax.swing.JTextArea();
        txtMsg = new javax.swing.JTextField();
        btnEnviar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        meuLife = new javax.swing.JProgressBar();
        lifeOponente = new javax.swing.JProgressBar();
        meuNome = new javax.swing.JLabel();
        nomeOponente = new javax.swing.JLabel();
        btnAtaque = new javax.swing.JButton();
        btnDefesa = new javax.swing.JButton();
        btnConectaServidor = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(887, 550));
        setResizable(false);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        txtChat.setEditable(false);
        txtChat.setColumns(20);
        txtChat.setRows(5);
        txtChat.setText("Chat Offline");
        jScrollPane1.setViewportView(txtChat);

        txtGame.setEditable(false);
        txtGame.setColumns(20);
        txtGame.setRows(5);
        txtGame.setText("Desconectado");
        jScrollPane2.setViewportView(txtGame);

        btnEnviar.setText("Enviar");
        btnEnviar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEnviarActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Italiana", 0, 18)); // NOI18N
        jLabel1.setText("Chat");

        jLabel2.setFont(new java.awt.Font("Italiana", 0, 18)); // NOI18N
        jLabel2.setText("Jogo");

        meuNome.setText("Offline");

        nomeOponente.setText("Offline");

        btnAtaque.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnAtaque.setText("Ataque");
        btnAtaque.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAtaqueActionPerformed(evt);
            }
        });

        btnDefesa.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnDefesa.setText("Defesa");
        btnDefesa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDefesaActionPerformed(evt);
            }
        });

        btnConectaServidor.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnConectaServidor.setText("Conectar Servidor");
        btnConectaServidor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConectaServidorActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(47, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(txtMsg, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnEnviar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 328, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(28, 28, 28))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(144, 144, 144)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(14, 14, 14)
                                .addComponent(meuLife, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(60, 60, 60))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addComponent(meuNome)
                                .addGap(108, 108, 108)))
                        .addComponent(jLabel2)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(54, 54, 54)
                                .addComponent(lifeOponente, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(102, 102, 102)
                                .addComponent(nomeOponente))))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 444, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(137, 137, 137)
                        .addComponent(btnAtaque, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnDefesa, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(40, 40, 40))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(309, 309, 309)
                .addComponent(btnConectaServidor, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(nomeOponente)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lifeOponente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(meuNome)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(meuLife, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtMsg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnEnviar))
                    .addComponent(btnAtaque, javax.swing.GroupLayout.DEFAULT_SIZE, 44, Short.MAX_VALUE)
                    .addComponent(btnDefesa, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                .addComponent(btnConectaServidor, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnEnviarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEnviarActionPerformed
        try{
            if(!txtMsg.getText().toString().equals("")){
                ObjectOutputStream saida = new ObjectOutputStream(conexao.getOutputStream());
                String msg = nomeUsuario + ": " + txtMsg.getText().toString();
                Protocolo novo = new Protocolo("msg", qualPlayerSou, msg);
                saida.writeObject(novo);
                txtMsg.setText("");
            }
        } catch (IOException ex) {
            plotarDados("PERAE", txtChat);
        }catch(NullPointerException ee){
            plotarDados("Conecte se ao servidor primeiro!", txtChat);
            txtMsg.setText("");
        }
    }//GEN-LAST:event_btnEnviarActionPerformed

    private void btnAtaqueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtaqueActionPerformed
        guiAtaque = new GUIAtaque(personagem, qualPlayerSou,conexao, hp, nomeUsuario); //passo a conexao para que o Frame atacar envie
        if(numAtaque > 0)
            guiAtaque.desabilitaBtn(numAtaque);
        if(numAtaque < 0)
            guiAtaque.habilitaBtn();
        PegaBotaoA btA = new PegaBotaoA();
        btA.start();
        guiAtaque.setVisible(true);
    }//GEN-LAST:event_btnAtaqueActionPerformed

    private void btnDefesaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDefesaActionPerformed
        guiDefesa = new GUIDefesa(qualPlayerSou, nomeUsuario, hp, personagem, ataque, conexao);
        if(numDefesa > 0)
            guiDefesa.desabilitaBtn(numDefesa);
        if(numDefesa < 0)
            guiDefesa.habilitaBtn();
        PegaBotaoD btD = new PegaBotaoD();
        btD.start();
        guiDefesa.setVisible(true);
    }//GEN-LAST:event_btnDefesaActionPerformed

    private void btnConectaServidorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConectaServidorActionPerformed
        try{
            ThreadOuve entrada = null;
            if(!estaOnline){
                nomeUsuario = JOptionPane.showInputDialog("Digite seu nome");
                guiSelect = new GUISelect();
                guiSelect.setVisible(true);
                conexao = new Socket(ip, porta);
                btnConectaServidor.setText("Desconectar");
                entrada = new ThreadOuve();
                entrada.start();
                plotarDados("Status: Online, conectado como: " + nomeUsuario, txtChat);
                plotarDados("Chat Online", txtChat);
                estaOnline = true;
            }else{
                conexao.close();
                btnConectaServidor.setText("Conectar Servidor");
                entrada.interrupt();
                plotarDados("Chat Offline", txtChat);
                estaOnline = false;                      
            }
        }catch(IOException e){
            plotarDados("O servidor está desligado!", txtChat);
        }
    }//GEN-LAST:event_btnConectaServidorActionPerformed
    
    /*NÃO MECHER MAIS DAQUI*/
    
    public static void setarPersonagem(Personagem p){
        PlayerGUI.personagem = p;
        JOptionPane.showMessageDialog(null, "Personagem Escolhido: " + personagem.getDescricao());
    }
       
    //METODOS

    
    private void plotarDados(String msg, JTextArea ondePlotar){
        ondePlotar.setText(ondePlotar.getText() + "\n" + msg);
    }
   
    private void atualizaInfsPlayers(String nome, double hpOponente){
        meuNome.setText(nomeUsuario);
        meuLife.setValue((int)(hp * 100));
        if(hp <= 0.25){
            meuLife.setForeground(new Color(208, 37, 61)); //vermelho
        }
        if(hp > 0.25 && hp <= 0.75){
            meuLife.setForeground(new Color(208, 206, 37)); //amarelo
        }
        if(hp > 0.75){
            meuLife.setForeground(new Color(113, 208, 37)); //verde
        }
        //oponente
        nomeOponente.setText(nome);
        lifeOponente.setValue((int)(hpOponente * 100));
        if(hpOponente <= 0.25){
            lifeOponente.setForeground(new Color(208, 37, 61)); //vermelho
        }
        if(hpOponente > 0.25 && hpOponente <= 0.75){
            lifeOponente.setForeground(new Color(208, 206, 37)); //amarelo
        }
        if(hpOponente > 0.75){
            lifeOponente.setForeground(new Color(113, 208, 37)); //verde
        }
    }
    
    //THREADS
    
    class PegaBotaoA extends Thread{
        @Override
        public void run() {
            while(guiAtaque.num == 0)
                System.out.print("");
            numAtaque = guiAtaque.num;
        }
    }
    
    class PegaBotaoD extends Thread{
        @Override
        public void run() {
            while(guiDefesa.num == 0)
                System.out.print("");
            numDefesa = guiDefesa.num;
        }
    }
    
    class ThreadOuve extends Thread{
        public void run(){
            try { 
                ThreadAnalisaProtocolo analisa;
                while(conexao != null){
                    ObjectInputStream entrada = new ObjectInputStream(conexao.getInputStream());
                    if(entrada != null){
                        Protocolo protocolo = (Protocolo)entrada.readObject();
                        analisa = new ThreadAnalisaProtocolo(protocolo);
                        analisa.start();
                    } 
                }
            } catch (IOException ex) {
                Logger.getLogger(EspectadorGUI.class.getName()).log(Level.SEVERE, null, ex);
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(EspectadorGUI.class.getName()).log(Level.SEVERE, null, ex);
            } 
     
        }
    }
    //pronto    
    class ThreadAnalisaProtocolo extends Thread{
        private Protocolo protocolo;
        
        ThreadAnalisaProtocolo(Protocolo protocolo){
            this.protocolo = protocolo;
        }
        
        public void run(){
            //aqui o protocolo so pode vir do servidor..
            if(protocolo.getComando().equals("msg")){ //significa que o chegou uma msg..
                plotarDados(((String)(protocolo.getDados())), txtChat);
            }
            if(protocolo.getComando().equals("player")){ //significa que o chegou uma msg..
                qualPlayerSou = (String)(protocolo.getDados());
                JOptionPane.showMessageDialog(null, nomeUsuario + ", vc é o " + qualPlayerSou);
            }
            if(protocolo.getComando().equals("atacar")){
                plotarDados("Sua vez de Atacar!", txtGame);
                btnDefesa.setEnabled(false);
                btnAtaque.setEnabled(true);
            }
            if(protocolo.getComando().equals("ataque")){
                ObjetoTransporteGame obj = (ObjetoTransporteGame)(protocolo.getDados());
                plotarDados("Sua vez de se defender!", txtGame);
                ataque = obj;
                btnAtaque.setEnabled(false);
                btnDefesa.setEnabled(true);
            }  
            if(protocolo.getComando().equals("start")){
                ObjetoTransporteStream obj = (ObjetoTransporteStream)protocolo.getDados();
                plotarDados("Players Prontos, iniciando o game..", txtGame);
                if(qualPlayerSou.equals("player1")){
                    atualizaInfsPlayers(obj.getPlayerDefendeu(), 1);
                }else{
                    atualizaInfsPlayers(obj.getPlayerAtacou(), 1);
                }
            }
            if(protocolo.getComando().equals("seunome")){
                try {
                    Protocolo novo = new Protocolo("meunome", qualPlayerSou, nomeUsuario);
                    ObjectOutputStream envia = new ObjectOutputStream(conexao.getOutputStream());
                    envia.writeObject(novo);
                } catch (IOException ex) {
                    Logger.getLogger(PlayerGUI.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
           
            if(protocolo.getComando().equals("stream")){
                //o objeto vai ser do tipo ObjetoTransporteStream
                ObjetoTransporteStream obj = ((ObjetoTransporteStream)protocolo.getDados());
                if(obj.getPlayerDefendeu().equals(nomeUsuario)){
                    hp = obj.getHpPlayerDefendeu();
                    atualizaInfsPlayers(obj.getPlayerAtacou(), obj.getHpPlayerAtacou());
                }else{
                    atualizaInfsPlayers(obj.getPlayerDefendeu(), obj.getHpPlayerDefendeu());
                }              
                
                plotarDados("\n\nAtaque de: " + obj.getPlayerAtacou(), txtGame);
                plotarDados("Descrição do ataque: " + obj.getAtaque().getDescricao(), txtGame);
                plotarDados("\nDefesa de: " + obj.getPlayerDefendeu(), txtGame);
                plotarDados(obj.getDefesa().getDescricao(), txtGame);
                if(obj.getHpPlayerDefendeu() <= 0){
                    plotarDados("\n\nLuta encerrada!\n Vencedor: " + obj.getPlayerAtacou(), txtGame);
                }
            }
            if(protocolo.getComando().equals("stop")){
                btnAtaque.setEnabled(false);
                btnDefesa.setEnabled(false);
            }
            
        }
    }

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PlayerGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAtaque;
    private javax.swing.JButton btnConectaServidor;
    private javax.swing.JButton btnDefesa;
    private javax.swing.JButton btnEnviar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JProgressBar lifeOponente;
    private javax.swing.JProgressBar meuLife;
    private javax.swing.JLabel meuNome;
    private javax.swing.JLabel nomeOponente;
    private javax.swing.JTextArea txtChat;
    private javax.swing.JTextArea txtGame;
    private javax.swing.JTextField txtMsg;
    // End of variables declaration//GEN-END:variables
}
