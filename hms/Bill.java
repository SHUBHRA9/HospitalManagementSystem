/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hms;

import java.awt.Color;
import java.awt.print.PrinterException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author HP
 */
public class Bill extends javax.swing.JFrame {

    /**
     * Creates new form Bill
     */
    public Bill() {
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
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jTextField6 = new javax.swing.JTextField();
        jTextField7 = new javax.swing.JTextField();
        jTextField8 = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(null);

        jLabel1.setBackground(new java.awt.Color(0, 0, 0));
        jLabel1.setFont(new java.awt.Font("Segoe Print", 3, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("BILL GENERATE :");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(480, 50, 320, 50);

        jLabel2.setFont(new java.awt.Font("Segoe Print", 3, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("BILL  ID :");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(100, 190, 200, 40);

        jLabel3.setFont(new java.awt.Font("Segoe Print", 3, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("PATIENT  ID :");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(100, 250, 210, 40);

        jLabel5.setFont(new java.awt.Font("Segoe Print", 3, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("MEDICINE PRESCRIBED :");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(100, 320, 240, 30);

        jLabel6.setFont(new java.awt.Font("Segoe Print", 3, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("TOTAL  AMOUNT :");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(100, 380, 210, 40);

        jLabel7.setFont(new java.awt.Font("Segoe Print", 3, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("AMOUNT PAID :");
        jPanel1.add(jLabel7);
        jLabel7.setBounds(110, 440, 240, 50);

        jLabel8.setFont(new java.awt.Font("Segoe Print", 3, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("DATE :");
        jPanel1.add(jLabel8);
        jLabel8.setBounds(110, 590, 230, 40);

        jTextField1.setFont(new java.awt.Font("Segoe Print", 3, 14)); // NOI18N
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        jPanel1.add(jTextField1);
        jTextField1.setBounds(300, 190, 240, 40);

        jTextField2.setFont(new java.awt.Font("Segoe Print", 3, 14)); // NOI18N
        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });
        jPanel1.add(jTextField2);
        jTextField2.setBounds(300, 250, 240, 40);

        jTextField4.setFont(new java.awt.Font("Segoe Print", 3, 14)); // NOI18N
        jPanel1.add(jTextField4);
        jTextField4.setBounds(300, 310, 240, 40);

        jTextField5.setFont(new java.awt.Font("Segoe Print", 3, 14)); // NOI18N
        jPanel1.add(jTextField5);
        jTextField5.setBounds(300, 380, 240, 40);

        jTextField6.setFont(new java.awt.Font("Segoe Print", 3, 14)); // NOI18N
        jPanel1.add(jTextField6);
        jTextField6.setBounds(300, 440, 240, 40);

        jTextField7.setFont(new java.awt.Font("Segoe Print", 3, 14)); // NOI18N
        jTextField7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextField7MouseClicked(evt);
            }
        });
        jPanel1.add(jTextField7);
        jTextField7.setBounds(300, 520, 240, 40);

        jTextField8.setFont(new java.awt.Font("Segoe Print", 3, 14)); // NOI18N
        jPanel1.add(jTextField8);
        jTextField8.setBounds(300, 580, 240, 40);

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imgs/left.png"))); // NOI18N
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2);
        jButton2.setBounds(0, 0, 50, 40);

        jTextArea1.setColumns(20);
        jTextArea1.setFont(new java.awt.Font("Segoe Print", 3, 14)); // NOI18N
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(560, 150, 490, 510);

        jButton4.setFont(new java.awt.Font("Segoe Print", 3, 14)); // NOI18N
        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imgs/update.png"))); // NOI18N
        jButton4.setText("SHOW BILL");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton4);
        jButton4.setBounds(220, 720, 190, 40);

        jButton5.setFont(new java.awt.Font("Segoe Print", 3, 14)); // NOI18N
        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imgs/view.png"))); // NOI18N
        jButton5.setText("VIEW BILL");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton5);
        jButton5.setBounds(410, 720, 190, 40);

        jButton6.setFont(new java.awt.Font("Segoe Print", 3, 14)); // NOI18N
        jButton6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imgs/icons8-print-50.png"))); // NOI18N
        jButton6.setText("PRINT BILL");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton6);
        jButton6.setBounds(780, 700, 240, 40);

        jButton7.setFont(new java.awt.Font("Segoe Print", 3, 14)); // NOI18N
        jButton7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imgs/add.png"))); // NOI18N
        jButton7.setText("ADD BILL");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton7);
        jButton7.setBounds(60, 720, 160, 40);

        jLabel9.setFont(new java.awt.Font("Segoe Print", 3, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("BALANCE AMOUNT :");
        jPanel1.add(jLabel9);
        jLabel9.setBounds(110, 520, 230, 40);

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imgs/bill.jpg"))); // NOI18N
        jPanel1.add(jLabel10);
        jLabel10.setBounds(0, 0, 1420, 770);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1422, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 767, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        setSize(new java.awt.Dimension(1440, 814));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        try{
            jTextArea1.print();
            
        } catch (PrinterException ex) {
        }
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2ActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        Bill2 bb=new Bill2();
        this.dispose();
        bb.setVisible(true);
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        jTextArea1.setText ("\n\n\t\t HOSPITAL MANAGEMENT \n \t\tPh No. : 9876543211\n"+
                "\n--------------------------------------------------------------------------------------------------------------------------"+
                "\n\tBILL_ID="+jTextField1.getText()+
                 "\n\tPT_ID="+jTextField2.getText()+
                "\n\tMEDICINE="+jTextField4.getText());
        
        jTextArea1.append("\n\tTOTAL AMOUNT="+jTextField5.getText()+
                "\n\tAMOUNT PAID="+jTextField6.getText()+
                "\n\tBALANCE="+jTextField7.getText()+
                "\n\t THANKYOU !!! VISIT AGAIN");
        
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        PatientPortal pp=new PatientPortal();
        this.dispose();
        pp.setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
       String s1=jTextField1.getText();
        String s2=jTextField2.getText();
        String s4=jTextField4.getText();
        String s5=jTextField5.getText();
        String s6=jTextField6.getText();
        String s7=jTextField7.getText();
        String s8=jTextField8.getText();
        
        try
        {
            DriverManager.registerDriver(new com.mysql.jdbc.Driver());
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3307/hms?user=root&password=");
            Statement st=con.createStatement();
            int a=st.executeUpdate("INSERT INTO `bill` VALUES('"+s1+"','"+s2+"','"+s4+"','"+s5+"','"+s6+"','"+s7+"','"+s8+"')");
            if(a==1)
            {
                JOptionPane.showMessageDialog(this,"Added and Saved Successfully !!!","Added",1);
            }

            else
            {
                JOptionPane.showMessageDialog(this,"Not Added and Not Saved!!!","",2);
            }

        } catch (SQLException e) {
            System.out.println(e);
        }
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jTextField7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField7MouseClicked
        int paid= Integer.parseInt(jTextField6.getText());
        int total= Integer.parseInt(jTextField5.getText());
        int bal=total-paid;
    }//GEN-LAST:event_jTextField7MouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Bill.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Bill.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Bill.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Bill.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Bill().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField8;
    // End of variables declaration//GEN-END:variables
}
