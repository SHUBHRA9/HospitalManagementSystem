/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hms;

/**
 *
 * @author HP
 */
public class Splash extends javax.swing.JFrame {

    /**
     * Creates new form Splash
     */
    public Splash() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jProgressBar1 = new javax.swing.JProgressBar();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Segoe Print", 3, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("0%");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(940, 680, 110, 60);

        jProgressBar1.setBackground(new java.awt.Color(0, 0, 0));
        jProgressBar1.setForeground(new java.awt.Color(255, 255, 255));
        jProgressBar1.setBorder(javax.swing.BorderFactory.createMatteBorder(5, 5, 5, 5, new java.awt.Color(0, 0, 0)));
        jPanel1.add(jProgressBar1);
        jProgressBar1.setBounds(660, 760, 620, 50);

        jLabel3.setFont(new java.awt.Font("Segoe Print", 3, 36)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("HOSPITAL  MANAGEMENT  SYSTEM");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(350, 40, 740, 60);

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imgs/splash.jpg"))); // NOI18N
        jPanel1.add(jLabel4);
        jLabel4.setBounds(0, 0, 1290, 830);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1304, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 823, Short.MAX_VALUE)
        );

        setSize(new java.awt.Dimension(1314, 870));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
       Splash sp=new Splash();
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                sp.setVisible(true);
            }
        });
        Index in=new Index();
        try{
            for(int i=0;i<=100;i++){
                Thread.sleep(40);
                sp.jProgressBar1.setValue(i);
                sp.jLabel1.setText(Integer.toString(i)+"%");
                if(i==100){
                    sp.setVisible(false);
                    in.setVisible(true);
                }
            }
        }
        catch(Exception e){
            
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JProgressBar jProgressBar1;
    // End of variables declaration//GEN-END:variables
}
