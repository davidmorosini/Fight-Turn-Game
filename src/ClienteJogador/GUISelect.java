package ClienteJogador;

import java.awt.Color;
import java.awt.Toolkit;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import logicaGame.*;

public class GUISelect extends javax.swing.JFrame {
    ArrayList<Personagem> personagens;
    private boolean encerrarThread;
    private Personagem escolhido;
    private boolean sair;
    private Personagem Rambo;
    private Personagem johnCena;
    
    public GUISelect() {
        Rambo = new Rambo("Rambo");
        johnCena = new JohnCena("JohnCena");
        personagens = new ArrayList<Personagem>();
        personagens.add(new BamBam("BamBam"));
        personagens.add(new BotCT("BotCT"));
        personagens.add(new Boxeador("Boxeador"));
        personagens.add(new Gladiador("Gladiador"));
        personagens.add(new MMA("Lutador MMA"));
        personagens.add(new Ninja("Ninja"));
        personagens.add(new Kratos("Kratos"));
        personagens.add(new Vandalo("Vandalo"));
        personagens.add(new Ryu("Ryu"));
        sair = false;
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/icone.png")));
        initComponents();
        addItems();
        AttPersonagem att = new AttPersonagem();
        att.start();
    }

    public void addItems(){
        jComboBox1.removeItemAt(0);
        jComboBox1.removeItemAt(0);
        jComboBox1.removeItemAt(0);
        jComboBox1.removeItemAt(0);
        
        for(Personagem aux : personagens){
            jComboBox1.addItem(aux.getDescricao());
        }
        
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        arte = new javax.swing.JPanel();
        mostraPersonagem = new javax.swing.JLabel();
        pAtaque = new javax.swing.JProgressBar();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        pDefesa = new javax.swing.JProgressBar();
        jLabel1 = new javax.swing.JLabel();
        btnC = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setResizable(false);

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        jButton1.setText("Confirmar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addComponent(jButton1))
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(38, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton1)
                .addContainerGap(34, Short.MAX_VALUE))
        );

        arte.setBackground(new java.awt.Color(255, 255, 255));
        arte.setLayout(new java.awt.BorderLayout());

        mostraPersonagem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/BamBam.png"))); // NOI18N
        mostraPersonagem.setText("jLabel2");

        jLabel2.setText("Ataque");

        jLabel3.setText("Defesa");

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText("Escolha seu Personagem");

        btnC.setBackground(new java.awt.Color(238, 238, 238));
        btnC.setBorder(null);
        btnC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pDefesa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pAtaque, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(54, 54, 54)
                        .addComponent(jLabel2))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(52, 52, 52)
                        .addComponent(jLabel3)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                .addComponent(mostraPersonagem, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(arte, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(217, 217, 217)))
                .addGap(18, 18, 18)
                .addComponent(btnC, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnC, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(arte, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(11, 11, 11)
                        .addComponent(jLabel1)))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(mostraPersonagem)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel2)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(pAtaque, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(22, 22, 22)
                            .addComponent(jLabel3)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(pDefesa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(40, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        escolhido = personagens.get(jComboBox1.getSelectedIndex());
        PlayerGUI.setarPersonagem(escolhido);
        encerrarThread = true;
        sair = true;
        dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void btnCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCActionPerformed
        String cheat = JOptionPane.showInputDialog("Digite um código:");
        if(cheat.equals(":rambo")){
            personagens.add(Rambo);
            jComboBox1.addItem(Rambo.getDescricao());
            JOptionPane.showMessageDialog(null, "Rambo desbloqueado!");
       }
       if(cheat.equals(":cena")){
            personagens.add(johnCena);
            jComboBox1.addItem(johnCena.getDescricao());
            JOptionPane.showMessageDialog(null, "John Cena desbloqueado!");
       }
       else{
            JOptionPane.showMessageDialog(null, "Código incorreto!");
        }
        
    }//GEN-LAST:event_btnCActionPerformed
    
    class AttPersonagem extends Thread{
        public void run(){
            while(!sair){
                String caminho = "/"+personagens.get(jComboBox1.getSelectedIndex()).getDescricao() + ".png";
                mostraPersonagem.setIcon(new javax.swing.ImageIcon(getClass().getResource(caminho)));
                int valorA = 0, valorD = 0;
                Personagem p = personagens.get(jComboBox1.getSelectedIndex());
                if(p instanceof Desarmados){
                    valorA = (int)(100 * ((Desarmados)p).getHabilidadeDesarmados());
                    valorD = (int)(100 * ((Desarmados)p).getHabDesarmadosDefesa());
                }else{
                    valorA = (int)(100 * ((CombatenteArmado)p).getHabilidadeArmados());
                    valorD = (int)(100 * ((CombatenteArmado)p).getHabArmadosDefesa());
                }
                pAtaque.setForeground(new Color(12, 43, 227));
                pAtaque.setValue(valorA);
                pDefesa.setForeground(new Color(227, 12, 23));
                pDefesa.setValue(valorD);
                
            }
        }
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel arte;
    private javax.swing.JButton btnC;
    private javax.swing.JButton jButton1;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel mostraPersonagem;
    private javax.swing.JProgressBar pAtaque;
    private javax.swing.JProgressBar pDefesa;
    // End of variables declaration//GEN-END:variables
}
