
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import java.awt.*;
import javax.swing.*;


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author dip82
 */
public class Signup extends javax.swing.JFrame {
 Connection connection;
ResultSet rs;
PreparedStatement pst;

    /**
     * Creates new form Login
     */
    public Signup() {
        initComponents();
         connection=ConnectMSSQL.connectDB();
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        this.setLocation(dim.width/2-this.getSize().width/2, dim.height/2-this.getSize().height/2);
        this.setBackground(new Color(0,0,0,0));
        jPanel5.setBackground(new Color(0,0,0,0));
        jTextField1.setBackground(new Color(0,0,0,0));
        jPasswordField1.setBackground(new Color(0,0,0,0));
         jTextField2.setBackground(new Color(0,0,0,0));
          jTextField3.setBackground(new Color(0,0,0,0));
           jTextField4.setBackground(new Color(0,0,0,0));
            jTextField6.setBackground(new Color(0,0,0,0));
             
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel5 = new javax.swing.JPanel();
        jSeparator1 = new javax.swing.JSeparator();
        jPasswordField1 = new javax.swing.JPasswordField();
        jTextField1 = new javax.swing.JTextField();
        jSeparator4 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jTextField4 = new javax.swing.JTextField();
        jSeparator6 = new javax.swing.JSeparator();
        jTextField6 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jSeparator5 = new javax.swing.JSeparator();
        jLabel13 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jSeparator1.setBackground(new java.awt.Color(255, 255, 0));
        jSeparator1.setForeground(new java.awt.Color(255, 255, 0));
        jSeparator1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jPanel5.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 340, 310, 20));

        jPasswordField1.setFont(new java.awt.Font("Trebuchet MS", 0, 16)); // NOI18N
        jPasswordField1.setForeground(new java.awt.Color(204, 204, 204));
        jPasswordField1.setText("jPasswordField1");
        jPasswordField1.setBorder(null);
        jPasswordField1.setOpaque(false);
        jPasswordField1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jPasswordField1FocusGained(evt);
            }
        });
        jPanel5.add(jPasswordField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 310, 310, 30));

        jTextField1.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        jTextField1.setForeground(new java.awt.Color(153, 153, 153));
        jTextField1.setText("Enter Email");
        jTextField1.setBorder(null);
        jTextField1.setOpaque(false);
        jTextField1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTextField1FocusGained(evt);
            }
        });
        jPanel5.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 190, 310, 40));

        jSeparator4.setBackground(new java.awt.Color(255, 255, 0));
        jSeparator4.setForeground(new java.awt.Color(255, 255, 0));
        jSeparator4.setPreferredSize(new java.awt.Dimension(0, 3));
        jPanel5.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 220, 310, 30));

        jSeparator3.setBackground(new java.awt.Color(255, 255, 0));
        jSeparator3.setForeground(new java.awt.Color(255, 255, 0));
        jSeparator3.setPreferredSize(new java.awt.Dimension(0, 3));
        jPanel5.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 460, 310, 30));

        jSeparator2.setBackground(new java.awt.Color(255, 255, 0));
        jSeparator2.setForeground(new java.awt.Color(255, 255, 0));
        jSeparator2.setPreferredSize(new java.awt.Dimension(0, 3));
        jPanel5.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 400, 310, 30));

        jTextField4.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        jTextField4.setForeground(new java.awt.Color(153, 153, 153));
        jTextField4.setText("Enter Age");
        jTextField4.setBorder(null);
        jTextField4.setOpaque(false);
        jTextField4.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTextField4FocusGained(evt);
            }
        });
        jPanel5.add(jTextField4, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 430, 310, 40));

        jSeparator6.setBackground(new java.awt.Color(255, 255, 0));
        jSeparator6.setForeground(new java.awt.Color(255, 255, 0));
        jSeparator6.setPreferredSize(new java.awt.Dimension(0, 3));
        jPanel5.add(jSeparator6, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 280, 310, 30));

        jTextField6.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        jTextField6.setForeground(new java.awt.Color(153, 153, 153));
        jTextField6.setText("Enter Region");
        jTextField6.setBorder(null);
        jTextField6.setOpaque(false);
        jTextField6.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTextField6FocusGained(evt);
            }
        });
        jPanel5.add(jTextField6, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 370, 310, 40));

        jTextField3.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        jTextField3.setForeground(new java.awt.Color(153, 153, 153));
        jTextField3.setText("Enter Phone");
        jTextField3.setBorder(null);
        jTextField3.setOpaque(false);
        jTextField3.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTextField3FocusGained(evt);
            }
        });
        jPanel5.add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 250, 310, 40));

        jLabel7.setIcon(new javax.swing.ImageIcon("D:\\3.1\\Lab\\db\\IGDB\\images\\home.png")); // NOI18N
        jLabel7.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel7MouseClicked(evt);
            }
        });
        jPanel5.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(1110, 30, 50, 50));

        jSeparator5.setBackground(new java.awt.Color(255, 255, 0));
        jSeparator5.setForeground(new java.awt.Color(255, 255, 0));
        jSeparator5.setPreferredSize(new java.awt.Dimension(0, 3));
        jPanel5.add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 160, 310, 40));

        jLabel13.setFont(new java.awt.Font("Trebuchet MS", 0, 20)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("Age");
        jPanel5.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 440, -1, -1));

        jLabel12.setFont(new java.awt.Font("Trebuchet MS", 0, 20)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Region");
        jPanel5.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 380, -1, -1));

        jLabel11.setFont(new java.awt.Font("Trebuchet MS", 0, 20)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Phone");
        jPanel5.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 260, -1, -1));

        jTextField2.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        jTextField2.setForeground(new java.awt.Color(153, 153, 153));
        jTextField2.setText("Enter Username");
        jTextField2.setBorder(null);
        jTextField2.setOpaque(false);
        jTextField2.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTextField2FocusGained(evt);
            }
        });
        jPanel5.add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 120, 310, 40));

        jLabel10.setFont(new java.awt.Font("Trebuchet MS", 0, 20)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Email");
        jPanel5.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 200, -1, -1));

        jLabel1.setFont(new java.awt.Font("Trebuchet MS", 0, 20)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Username");
        jPanel5.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 130, -1, -1));

        jLabel8.setIcon(new javax.swing.ImageIcon("D:\\3.1\\Lab\\db\\IGDB\\images\\signup.png")); // NOI18N
        jLabel8.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel8MouseClicked(evt);
            }
        });
        jPanel5.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 520, 150, 50));

        jLabel3.setIcon(new javax.swing.ImageIcon("D:\\3.1\\Lab\\db\\IGDB\\images\\close.png")); // NOI18N
        jLabel3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
        });
        jPanel5.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(1170, 30, -1, -1));

        jLabel2.setFont(new java.awt.Font("Trebuchet MS", 0, 20)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Password");
        jPanel5.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 320, -1, -1));

        jLabel5.setBackground(new java.awt.Color(0, 204, 204));
        jLabel5.setForeground(new java.awt.Color(0, 204, 204));
        jLabel5.setIcon(new javax.swing.ImageIcon("D:\\3.1\\Lab\\db\\IGDB\\images\\backright.png")); // NOI18N
        jPanel5.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, -20, 680, 740));

        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setIcon(new javax.swing.ImageIcon("D:\\3.1\\Lab\\db\\IGDB\\images\\1_a5NKkiU55ENlSE2l8Al6YA.jpeg")); // NOI18N
        jLabel6.setText("jLabel4");
        jPanel5.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 250, 540, -1));

        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setIcon(new javax.swing.ImageIcon("D:\\3.1\\Lab\\db\\IGDB\\images\\backleft.png")); // NOI18N
        jLabel4.setText("jLabel4");
        jPanel5.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(-130, -20, 1140, 740));

        getContentPane().add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 1348, 700));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField1FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField1FocusGained
        // TODO add your handling code here:
        jTextField1.setText("");
     //  jSeparator1.setForeground(Color.yellow);
     //     jSeparator1.setForeground(Color.yellow);
    }//GEN-LAST:event_jTextField1FocusGained

    private void jPasswordField1FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jPasswordField1FocusGained
        // TODO add your handling code here:
        jPasswordField1.setText("");
        //  jSeparator1.setForeground(Color.yellow);
        //  jSeparator1.setForeground(Color.yellow);
    }//GEN-LAST:event_jPasswordField1FocusGained

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_jLabel3MouseClicked

    private void jTextField2FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField2FocusGained
        // TODO add your handling code here:
         jTextField2.setText("");
    }//GEN-LAST:event_jTextField2FocusGained

    private void jTextField3FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField3FocusGained
        // TODO add your handling code here:
         jTextField3.setText("");
    }//GEN-LAST:event_jTextField3FocusGained

    private void jTextField4FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField4FocusGained
        // TODO add your handling code here:
         jTextField4.setText("");
    }//GEN-LAST:event_jTextField4FocusGained

    private void jTextField6FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField6FocusGained
        // TODO add your handling code here:
         jTextField6.setText("");
    }//GEN-LAST:event_jTextField6FocusGained

    private void jLabel8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel8MouseClicked
        // TODO add your handling code here:
           String sql1="select * from USERS where UserName=?";
        try{
            pst=connection.prepareStatement(sql1);
            pst.setString(1,jTextField2.getText());
            rs=pst.executeQuery();
            if(rs.next()){
                JOptionPane.showMessageDialog(null, "Username already registered");
            }
            else{
                        try{
            String sql="Insert into USERS (UserName,Email,Phone,Password,Region, Age) values(?,?,?,?,?,?)";
            pst=connection.prepareStatement(sql);
            pst.setString(1,jTextField2.getText());                                             
            pst.setString(2,jTextField1.getText());
            pst.setString(3,jTextField3.getText());
            pst.setString(4,jPasswordField1.getText());
            pst.setString(5,jTextField6.getText());
            pst.setString(6,jTextField4.getText());
            pst.execute();
            JOptionPane.showMessageDialog(null, "New Account Created");
            
              //rs.close();
            //pst.close();
            
            }catch(Exception e){
                JOptionPane.showMessageDialog(null, e);
            
            }
            }
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }    
        
        
        
        
        
        

    }//GEN-LAST:event_jLabel8MouseClicked

    private void jLabel7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel7MouseClicked
        // TODO add your handling code here:
           setVisible(false);
        Login1 ob=new Login1();
        ob.setVisible(true);
    }//GEN-LAST:event_jLabel7MouseClicked

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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Signup().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField6;
    // End of variables declaration//GEN-END:variables
}