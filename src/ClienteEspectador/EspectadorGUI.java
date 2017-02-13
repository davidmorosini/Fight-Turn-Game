package ClienteEspectador;

import AtaquesDefesasPersonagens.ObjetoTransporteGame;
import AtaquesDefesasPersonagens.ObjetoTransporteStream;
import Protocolo.Protocolo;
import java.awt.Color;
import java.awt.Toolkit;
import java.io.*;
import java.net.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;

//PRONTO (MECHER SOMENTE EM CASO DE EXTREMA NECESSIDADE)

public class EspectadorGUI extends javax.swing.JFrame {
    
    private Socket conexao;
    private String ip;
    private int porta;
    private boolean estaOnline;
    private String nomeUsuario;
    
    public EspectadorGUI() {
        super("Espectador");
        this.ip = "127.0.0.1";
        this.porta = 9999;
        this.estaOnline = false;
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/icone.png")));
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtChat = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtStream = new javax.swing.JTextArea();
        txtMsg = new javax.swing.JTextField();
        btnEnviar = new javax.swing.JButton();
        lifeP1 = new javax.swing.JProgressBar();
        lifeP2 = new javax.swing.JProgressBar();
        nomeP1 = new javax.swing.JLabel();
        nomeP2 = new javax.swing.JLabel();
        btnConectaServidor = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setForeground(new java.awt.Color(102, 255, 102));

        txtChat.setEditable(false);
        txtChat.setColumns(20);
        txtChat.setRows(5);
        txtChat.setText("Status: Offline");
        jScrollPane1.setViewportView(txtChat);

        txtStream.setEditable(false);
        txtStream.setColumns(20);
        txtStream.setRows(5);
        txtStream.setText("Desconectado do servidor");
        jScrollPane2.setViewportView(txtStream);

        btnEnviar.setText("Enviar");
        btnEnviar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEnviarActionPerformed(evt);
            }
        });

        nomeP1.setText("Offline");

        nomeP2.setText("Offline");

        btnConectaServidor.setText("Conectar Servidor");
        btnConectaServidor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConectaServidorActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("Chat");

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText("Stream");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(txtMsg)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnEnviar, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 362, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(26, 26, 26)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(lifeP1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(41, 41, 41)
                                .addComponent(jLabel1)
                                .addGap(55, 55, 55)
                                .addComponent(lifeP2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(10, 10, 10))
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 360, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(164, 164, 164)
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(nomeP1)
                                .addGap(206, 206, 206)))
                        .addComponent(nomeP2)
                        .addGap(44, 44, 44)))
                .addContainerGap(35, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnConectaServidor, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(135, 135, 135))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(nomeP1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lifeP1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(nomeP2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lifeP2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(8, 8, 8)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtMsg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEnviar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnConectaServidor, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(20, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnConectaServidorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConectaServidorActionPerformed
        try{
            ThreadOuve entrada = null;
            if(!estaOnline){
                nomeUsuario = JOptionPane.showInputDialog("Digite seu nome");
                conexao = new Socket(ip, porta);
                btnConectaServidor.setText("Desconectar");
                entrada = new ThreadOuve();
                entrada.start();
                plotarDados("Chat Online", txtChat);
                plotarDados("Status: Online, conectado como: " + nomeUsuario, txtChat);
                estaOnline = true;
            }else{
                conexao.close();
                btnConectaServidor.setText("Conectar Chat");
                entrada.interrupt();
                plotarDados("Chat Offline", txtChat);
                estaOnline = false;                      
            }
        }catch(IOException e){
            plotarDados("O servidor está desligado!", txtChat);
        }
    }//GEN-LAST:event_btnConectaServidorActionPerformed

    private void btnEnviarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEnviarActionPerformed
        try{
            if(!txtMsg.getText().toString().equals("")){
                ObjectOutputStream saida = new ObjectOutputStream(conexao.getOutputStream());
                String msg = nomeUsuario + ": " + txtMsg.getText();
                Protocolo novo = new Protocolo("msg", "espectador", msg);
                saida.writeObject(novo);
                txtMsg.setText("");
            }
        } catch (IOException ex) {
            plotarDados("erro", txtChat);
        }catch(NullPointerException ee){
            plotarDados("Conecte se ao servidor primeiro!", txtChat);
            txtMsg.setText("");
        }
    }//GEN-LAST:event_btnEnviarActionPerformed

    //METODOS
    private void plotarDados(String msg, JTextArea ondePlotar){
        ondePlotar.setText(ondePlotar.getText() + "\n" + msg);
    }
    
    private void atualizaInfsPlayers(String p1, double hpP1, String p2, double hpP2){
        nomeP1.setText(p1);
        lifeP1.setValue((int)(hpP1 * 100));
        if(hpP1 <= 0.25){
            lifeP1.setForeground(new Color(208, 37, 61)); //vermelho
        }
        if(hpP1 > 0.25 && hpP1 <= 0.75){
            lifeP1.setForeground(new Color(208, 206, 37)); //amarelo
        }
        if(hpP1 > 0.75){
            lifeP1.setForeground(new Color(113, 208, 37)); //verde
        }
        //oponente
        nomeP2.setText(p2);
        lifeP2.setValue((int)(hpP2 * 100));
        if(hpP2 <= 0.25){
            lifeP2.setForeground(new Color(208, 37, 61)); //vermelho
        }
        if(hpP2 > 0.25 && hpP2 <= 0.75){
            lifeP2.setForeground(new Color(208, 206, 37)); //amarelo
        }
        if(hpP2 > 0.75){
            lifeP2.setForeground(new Color(113, 208, 37)); //verde
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
            if(protocolo.getComando().equals("stream")){ //chegou uma stream do game
                //o objeto vai ser do tipo ObjetoTransporteStream
                ObjetoTransporteStream obj = ((ObjetoTransporteStream)protocolo.getDados());
                atualizaInfsPlayers(obj.getPlayerAtacou(), obj.getHpPlayerAtacou(), obj.getPlayerDefendeu(), obj.getHpPlayerDefendeu());
                plotarDados("\n\nAtaque de: " + obj.getPlayerAtacou(), txtStream);
                plotarDados(obj.getAtaque().getDescricao(), txtStream);
                plotarDados("\nDefesa de: " + obj.getPlayerDefendeu(), txtStream);
                plotarDados(obj.getDefesa().getDescricao(), txtStream);
                if(obj.getHpPlayerDefendeu() <= 0){
                    plotarDados("Jogo encerrado, vencedor: " + obj.getPlayerAtacou(), txtStream);
                }
            }
            if(protocolo.getComando().equals("start")){
                plotarDados("Players Prontos, iniciando o game..", txtStream);
                ObjetoTransporteStream obj = (ObjetoTransporteStream)protocolo.getDados();
                atualizaInfsPlayers(obj.getPlayerAtacou(), 1, obj.getPlayerDefendeu(), 1);
            }
        }
    }
    
    
       
    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EspectadorGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnConectaServidor;
    private javax.swing.JButton btnEnviar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JProgressBar lifeP1;
    private javax.swing.JProgressBar lifeP2;
    private javax.swing.JLabel nomeP1;
    private javax.swing.JLabel nomeP2;
    private javax.swing.JTextArea txtChat;
    private javax.swing.JTextField txtMsg;
    private javax.swing.JTextArea txtStream;
    // End of variables declaration//GEN-END:variables
}
