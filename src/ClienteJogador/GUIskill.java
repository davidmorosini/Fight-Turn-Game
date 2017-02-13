
package ClienteJogador;
import java.awt.Color;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;


public class GUIskill extends javax.swing.JFrame {
    int valor = 20;
    int iniciaRetorno = 0;
    boolean status = false;
    Clica clica = new Clica();
    
    public GUIskill() {
        initComponents();
        progress.setForeground(new Color(208, 37, 61)); //vermelho
        new verThreads().start();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        progress = new javax.swing.JProgressBar();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("Vaaaaaaaai Filhão");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Seta Direita + Seta Esquerda");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(progress, javax.swing.GroupLayout.DEFAULT_SIZE, 328, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 97, Short.MAX_VALUE)
                        .addComponent(jLabel1)
                        .addGap(102, 102, 102))))
            .addGroup(layout.createSequentialGroup()
                .addGap(84, 84, 84)
                .addComponent(jLabel2)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(progress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2)
                .addContainerGap(58, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    public class verThreads extends Thread{
        @Override
        @SuppressWarnings("empty-statement")
        public void run() {
            status = true;
            clica.start();
            while(valor <= 100 && valor >= 0)
                System.out.print("");
            status = false;
            if(valor <= 0){
                GUIDefesa.conseguiu(false, false);
                dispose();
                //System.out.println("Você não conseguiu se defender!");
            }
            if(valor >= 100)
                GUIDefesa.conseguiu(true, false);
                dispose();
                //System.out.println("Você se defendeu do ataque!");
        }
    }
    
    public class Clica extends Thread implements KeyListener{
        @Override
        public void run() {
            addKeyListener(this);
        } 

        @Override
        public void keyTyped(KeyEvent e) {
        }

        @Override
        public void keyPressed(KeyEvent e) {
            if(status){
                if (e.getKeyCode() == KeyEvent.VK_RIGHT ) {
                    new Progresso().start();
                } else if (e.getKeyCode() == KeyEvent.VK_LEFT ) {
                    new Progresso().start();
                }
                if(iniciaRetorno == 0){
                    new Retorno().start();
                    iniciaRetorno++;
                }
            }
        }

        @Override
        public void keyReleased(KeyEvent e) {
        }
    }
    
    public class Retorno extends Thread{
     
        @Override
        public void run() {
            while(valor <= 100 && valor >= 0){
                progress.setValue(valor - 2);
                valor -= valorRetorno(valor);
                try {
                    Thread.sleep(100);
                } catch (InterruptedException ex) {
                    System.out.println("Erro no tempo");
                }
                if(valor <= 30){
                    progress.setForeground(new Color(208, 37, 61)); //vermelho
                }
                if(valor > 30 && valor <= 70){
                    progress.setForeground(new Color(208, 206, 37)); //amarelo
                }
                if(valor > 70){
                    progress.setForeground(new Color(113, 208, 37)); //verde
                }
            }
        }
        
        public int valorRetorno(int num){
            if (valor > 10 && valor < 20) num = 2;
            else if (valor > 20 && valor < 40) num = 3;
            else if (valor > 40 && valor < 100) num = 4;
            else num = 3;
            return num;
        }
    }
    
    public class Progresso extends Thread{
        @Override
        public void run() {
            progress.setValue(valor + 5);
            valor += 5;
        } 
    }
    
   
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JProgressBar progress;
    // End of variables declaration//GEN-END:variables
}
