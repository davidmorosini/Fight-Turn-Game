package Servidor;

import Protocolo.*;
import java.io.*;
import java.net.*;
import java.util.*;
import javax.swing.*;
import AtaquesDefesasPersonagens.*;
import ClienteJogador.PlayerGUI;
import java.awt.Image;
import java.awt.Toolkit;
import java.util.logging.Level;
import java.util.logging.Logger;


public class ServidorGUI extends javax.swing.JFrame {
    
    private ServerSocket espectadores;
    private ServerSocket players;
    private ArrayList<Socket> cEspectadores; //clietnes espectadores
    private Socket player1; //so para saber quem é o player1
    private Socket player2;//clietnes players 
    private int portaEspectadores;
    private int portaPlayers;
    private boolean estaOnline;
    private String nomePlayer1;
    private String nomePlayer2;
    private int qtdClientes;
    Protocolo protocoloStream;
    
    public ServidorGUI() {
        super("Game POO - (Servidor)");
        this.estaOnline = false;
        this.portaEspectadores = 9999;
        this.portaPlayers = 25000;
        this.cEspectadores = new ArrayList<Socket>();
        this.player1 = null;
        this.player2 = null;
        this.nomePlayer2 = null;
        this.qtdClientes = 0;
        this.protocoloStream = null;
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/icone.png")));
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane5 = new javax.swing.JScrollPane();
        jTextArea5 = new javax.swing.JTextArea();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtChat = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtErros = new javax.swing.JTextArea();
        jScrollPane3 = new javax.swing.JScrollPane();
        txtIpsConectados = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtMsg = new javax.swing.JTextField();
        btnEnviar = new javax.swing.JButton();
        btnIniciarServidor = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        txtLog = new javax.swing.JTextArea();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();

        jTextArea5.setColumns(20);
        jTextArea5.setRows(5);
        jScrollPane5.setViewportView(jTextArea5);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        txtChat.setEditable(false);
        txtChat.setColumns(20);
        txtChat.setRows(5);
        txtChat.setText("Chat Offline");
        jScrollPane1.setViewportView(txtChat);

        txtErros.setEditable(false);
        txtErros.setColumns(20);
        txtErros.setRows(5);
        txtErros.setText("[Origem]:[Método]:[Erro]");
        jScrollPane2.setViewportView(txtErros);

        txtIpsConectados.setEditable(false);
        txtIpsConectados.setColumns(20);
        txtIpsConectados.setRows(5);
        txtIpsConectados.setText("Offline");
        jScrollPane3.setViewportView(txtIpsConectados);

        jLabel1.setFont(new java.awt.Font("Italiana", 0, 14)); // NOI18N
        jLabel1.setText("Chat");

        jLabel2.setFont(new java.awt.Font("Italiana", 0, 14)); // NOI18N
        jLabel2.setText("Erros");

        jLabel3.setFont(new java.awt.Font("Italiana", 0, 14)); // NOI18N
        jLabel3.setText("IP's Conectados");

        btnEnviar.setText("Enviar");
        btnEnviar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEnviarActionPerformed(evt);
            }
        });

        btnIniciarServidor.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnIniciarServidor.setText("Iniciar Servidor");
        btnIniciarServidor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIniciarServidorActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Italiana", 1, 18)); // NOI18N
        jLabel4.setText("SERVIDOR");

        txtLog.setEditable(false);
        txtLog.setColumns(20);
        txtLog.setRows(5);
        txtLog.setText("[comando]:[origem]");
        jScrollPane4.setViewportView(txtLog);

        jLabel5.setFont(new java.awt.Font("Italiana", 0, 14)); // NOI18N
        jLabel5.setText("Log");

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icone.png"))); // NOI18N
        jLabel6.setText("jLabel6");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(txtMsg, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(btnEnviar, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 269, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(3, 3, 3)))
                                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 257, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                        .addGap(113, 113, 113)
                                        .addComponent(jLabel1)
                                        .addGap(220, 220, 220)
                                        .addComponent(jLabel2)
                                        .addGap(227, 227, 227)
                                        .addComponent(jLabel5)))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(6, 6, 6)
                                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel3)
                                        .addGap(62, 62, 62)))))
                        .addGap(0, 26, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnIniciarServidor, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(159, 159, 159)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4)
                .addGap(34, 34, 34)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane4)
                    .addComponent(jScrollPane1)
                    .addComponent(jScrollPane2)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 257, Short.MAX_VALUE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtMsg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnEnviar))
                        .addGap(59, 183, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(btnIniciarServidor, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap())))
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

    //pronto
    private void btnIniciarServidorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIniciarServidorActionPerformed
        try{
            ThreadConectaEspectadores espec = null;
            ThreadConectaPlayers p = null;
            if(!estaOnline){
		espectadores = new ServerSocket(portaEspectadores);
                players = new ServerSocket(portaPlayers);
                espec = new ThreadConectaEspectadores();
                espec.start();
                p = new ThreadConectaPlayers();
                p.start();
                estaOnline = true;
                btnIniciarServidor.setText("Desligar");
                plotarMsg("Chat Online", txtChat);
            }else{
                espec.interrupt();
                p.interrupt();
		espectadores.close();
                players.close();
		plotarMsg("Servidor Offline, clientes desconectados", txtIpsConectados);
                estaOnline = false;
      		btnIniciarServidor.setText("Iniciar Servidor");
                plotarMsg("Chat Offline", txtChat);
            }
        }catch(IOException ee){
            plotarMsg("servidor: Erro ao iniciar o ServerSocket nas portas [ " + portaEspectadores + " ] e [ " + portaPlayers + " ]", txtErros);
	}catch(NullPointerException es){
            plotarMsg("servidor: Interrompendo a Thread ao encerrar o servidor", txtErros);
            players = null;
            espectadores = null;
            btnIniciarServidor.setText("Iniciar Servidor");         
        }
        catch(Exception ex){
            plotarMsg("servidor: btnIniciarServidorActionPerformed(): " + ex.toString(), txtErros);
	}

    }//GEN-LAST:event_btnIniciarServidorActionPerformed
    //pronto
    private void btnEnviarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEnviarActionPerformed
        if(estaOnline){
            try{
                if(!txtMsg.getText().equals("")){
                    String msg = "Servidor: " + txtMsg.getText();
                    Protocolo protocolo = new Protocolo("msg", "servidor", msg);
                    enviarMsg(protocolo);
                    plotarMsg("Servidor: " + txtMsg.getText(), txtChat);
                    txtMsg.setText("");
                    plotarMsg("msg : servidor", txtLog);
                }
            }catch(Exception ex){
		plotarMsg("servidor: btnEnviarActionPerformed(): erro ao gerar protolo com a msg digitada", txtErros);
            }
	}else{
            plotarMsg("servidor: btnEnviarActionPerformed(): Servidor Desligado", txtErros);
	}
    }//GEN-LAST:event_btnEnviarActionPerformed

    //pronto  (plotar dados em um determinado JTextArea)
    private void plotarMsg(String msg, JTextArea ondePlotar){
        ondePlotar.setText(ondePlotar.getText() + "\n" + msg);
    } 
    //pronto  (método para enviar um protocolo para todos os usuarios, incluindo players)
    private void enviarMsg(Protocolo protocolo){ 
        try{
            ObjectOutputStream saida;
            if(cEspectadores != null && cEspectadores.size() > 0){
                for(Socket aux : cEspectadores){
                    saida = new ObjectOutputStream(aux.getOutputStream());
                    saida.writeObject(protocolo);
                }
            }
            if(player1 != null){
                saida = new ObjectOutputStream(player1.getOutputStream());
                saida.writeObject(protocolo);
            }
            if(player2 != null){
                saida = new ObjectOutputStream(player2.getOutputStream());
                saida.writeObject(protocolo);
            }  
	}catch(IOException ee){
            plotarMsg("servidor: enviarMsg(): " + ee.getMessage(), txtErros);
	}catch(Exception ex){
            plotarMsg("servidor: enviarMsg(): " + ex.getMessage(), txtErros);
        }    
    }
    //pronto  (método para enviar um protocolo para um dos players especificos)
    private void enviarDadosGame(Protocolo protocolo, Socket player){ 
        try{
            ObjectOutputStream saida;
            saida = new ObjectOutputStream(player.getOutputStream());
            saida.writeObject(protocolo);
	}catch(IOException ee){
            plotarMsg("servidor: enviarDadosGame(): = " + ee.getMessage(), txtErros);
	}catch(Exception ex){
            plotarMsg("servidor: enviarDadosGame(): " + ex.getMessage(), txtErros);
        }
    }
    //pronto  (método para enviar um protocolo somente para os espectadores)
    private void enviarDadosStream(Protocolo protocolo, ArrayList<Socket> espectadores){
        try{
            ObjectOutputStream saida;
            for(Socket aux : cEspectadores){
		saida = new ObjectOutputStream(aux.getOutputStream());
		saida.writeObject(protocolo);
            }
        }catch (IOException ex) {
            plotarMsg("servidor: enviarDadosStream(): " + ex.getMessage(), txtErros);
        }catch (Exception ee) {
            plotarMsg("servidor: enviarDadosStream(): " + ee.getMessage(), txtErros);
        }
    }
    
    
    /* NÃO MECHER PELO AMOR DE CRISTO */
    //pronto
    class ThreadConectaEspectadores extends Thread{
        public void run(){
            Socket aux;
            try{
		while(espectadores != null){
                    aux = espectadores.accept();
                    qtdClientes++;
                    plotarMsg("ip (espectador): " + aux.getInetAddress().getHostName() +"\nClientes ativos: " + qtdClientes, txtIpsConectados);
                    cEspectadores.add(aux);
                    ThreadRecebeRequisicoes novo = new ThreadRecebeRequisicoes(aux);
                    novo.start();
		}
            }catch(IOException e){
		plotarMsg("servidor: ThreadConectaEspectadores: " + e.getMessage(), txtErros);
            }catch(Exception ex){
		plotarMsg("servidor: ThreadConectaEspectadores: " + ex.getMessage(), txtErros);
            }
        }
    }
    //pronto
    class ThreadConectaPlayers extends Thread{
         public void run(){
            try{
                ThreadRecebeRequisicoes novo;
                Protocolo protocolo;
                boolean sair = false;
		while(!sair && players != null){
                    if(player1 == null){
                        player1 = players.accept();
                        novo = new ThreadRecebeRequisicoes(player1);
                        novo.start();
                        protocolo = new Protocolo("player", "servidor", "player1");
                        enviarDadosGame(protocolo, player1);
                        plotarMsg(protocolo.getComando() + " : servidor", txtLog);                
                        protocolo = new Protocolo("seunome", "servidor", null);
                        enviarDadosGame(protocolo, player1);
                        plotarMsg(protocolo.getComando() + " : servidor", txtLog);                         
                        qtdClientes++;
                        plotarMsg("ip (player): " + player1.getInetAddress().getHostName() +"\nClientes ativos: " + qtdClientes, txtIpsConectados);
                    
                    }else{
                        player2 = players.accept();
                        novo = new ThreadRecebeRequisicoes(player2);
                        novo.start();
                        protocolo = new Protocolo("player", "servidor", "player2");
                        enviarDadosGame(protocolo, player2);
                        plotarMsg(protocolo.getComando() + " : servidor", txtLog);
                        protocolo = new Protocolo("seunome", "servidor", null);
                        enviarDadosGame(protocolo, player2);
                        plotarMsg(protocolo.getComando() + " : servidor", txtLog);                
                        qtdClientes++;
                        plotarMsg("ip (espectador): " + player2.getInetAddress().getHostName() +"\nClientes ativos: " + qtdClientes, txtIpsConectados);
                        sair = true;
                    }
                }
                while(nomePlayer2 == null){
                    System.out.println(); //so para gastar tempo ate que p2 responda
                }
                protocolo = new Protocolo("stream", "servidor", "Jogadores Prontos, Iniciando o game..");
                enviarDadosStream(protocolo, cEspectadores);
                plotarMsg(protocolo.getComando() + " : servidor", txtLog);
                ObjetoTransporteStream obj;
                obj = new ObjetoTransporteStream(nomePlayer1, nomePlayer2, 1, 1, null, null, null);
                protocolo = new Protocolo("start", "servidor", obj);
                enviarMsg(protocolo);
                plotarMsg(protocolo.getComando() + " : servidor", txtLog);
                protocolo = new Protocolo("atacar", "servidor", null);
                enviarDadosGame(protocolo, player1);
                plotarMsg(protocolo.getComando() + " : servidor", txtLog);
            }catch(IOException e){
		plotarMsg("servidor: ThreadConectaEspectadores: " + e.getMessage(), txtErros);
            }catch(Exception ex){
		plotarMsg("servidor: ThreadConectaEspectadores: " + ex.getMessage(), txtErros);
            }
        }
    }
    //pronto
    class ThreadRecebeRequisicoes extends Thread{
        private Socket cliente;
        
        ThreadRecebeRequisicoes(Socket cliente){
            this.cliente = cliente;
        }
        
        public void run(){
            try {
                Protocolo protocolo;
                ObjectInputStream entrada;
                while(espectadores != null && cliente != null){
                    entrada = new ObjectInputStream(cliente.getInputStream());
                    if(entrada != null){
                        protocolo = (Protocolo)entrada.readObject();
                        ThreadAnalisaProtocolo analisa = new ThreadAnalisaProtocolo(protocolo);
                        analisa.start();
                    }
                }
            } catch (IOException ex) {
                plotarMsg("servidor: ThreadRecebeRequisicoes: " + ex.getMessage(), txtErros);
            } catch (ClassNotFoundException ee) {
                plotarMsg("servidor: ThreadRecebeRequisicoes: " + ee.getMessage(), txtErros);
            } catch(Exception er){
                plotarMsg("servidor: ThreadRecebeRequisicoes: " + er.getMessage(), txtErros);
            }
     
        }
    }
     /* NÃO MECHER PELO AMOR DE CRISTO */
    
    //tudo oq for implemtentado de funcionalidade deve estar no analisaProtocolo 
    
    class ThreadAnalisaProtocolo extends Thread{
        private Protocolo protocolo;
        
        ThreadAnalisaProtocolo(Protocolo protocolo){
            this.protocolo = protocolo;
        }
        
        public void run(){
            //há a necessidade de se saber de onde vieram
            if(protocolo.getOrigem().equals("player1")){
                
                if(protocolo.getComando().equals("ataque")){ //ele mandou um objeto a ser direcionado ao outro player somente
                    enviarDadosGame(protocolo, player2);
                    enviarDadosGame(new Protocolo("stop", "servidor", null), player1);

                }
                if(protocolo.getComando().equals("meunome")){
                    nomePlayer1 = String.valueOf(protocolo.getDados());
                }
                if(protocolo.getComando().equals("stream")){
                    enviarMsg(protocolo);
                    enviarDadosGame(new Protocolo("atacar", "servidor", null), player1);
                }
             
            }
            if(protocolo.getOrigem().equals("player2")){
                
                if(protocolo.getComando().equals("ataque")){ //ele mandou um objeto a ser direcionado ao outro player somente
                    enviarDadosGame(protocolo, player1);
                    enviarDadosGame(new Protocolo("stop", "servidor", null), player2);

                }
                if(protocolo.getComando().equals("meunome")){
                    nomePlayer2 = String.valueOf(protocolo.getDados());
                }
                if(protocolo.getComando().equals("stream")){
                    enviarMsg(protocolo);
                    enviarDadosGame(new Protocolo("atacar", "servidor", null), player2);

                }
            }
            
            //não tem necessidade de saber de onde veio
            if(protocolo.getComando().equals("gameover")){
                    ObjetoTransporteStream ultimaStream = ((ObjetoTransporteStream)protocolo.getDados());
                    enviarMsg(new Protocolo("stream", "servidor", ultimaStream));
                    Protocolo novo = new Protocolo("stop", "servidor", null);
                    enviarMsg(novo);
            }
            if(protocolo.getComando().equals("erro")){
                    plotarMsg(protocolo.getOrigem() + ": " + String.valueOf(protocolo.getDados()), txtErros);
            }
            if(protocolo.getComando().equals("msg")){
                    enviarMsg(protocolo);
                    plotarMsg((String)(protocolo.getDados()), txtChat);
            }
            
                        
            plotarMsg(protocolo.getComando() + " : " + protocolo.getOrigem(), txtLog);
        }
    }
    
    public static void main(String args[]) {
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ServidorGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEnviar;
    private javax.swing.JButton btnIniciarServidor;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JTextArea jTextArea5;
    private javax.swing.JTextArea txtChat;
    private javax.swing.JTextArea txtErros;
    private javax.swing.JTextArea txtIpsConectados;
    private javax.swing.JTextArea txtLog;
    private javax.swing.JTextField txtMsg;
    // End of variables declaration//GEN-END:variables
}
