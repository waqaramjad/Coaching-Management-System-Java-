/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Login;

import javax.swing.JOptionPane;
import Login.*;
import List.*;
import java.util.*;
//import java.util.Scanner;
import Accounts.*;
import Attendence.Attendence;
import TestResult.TestResult;
import java.io.*;
import javax.swing.JOptionPane;
import AdministratorUse.AdminSelectionPage;
import AdministratorUse.*;
import crediblecollegiatemanagementsystem.clone;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
/**
 *
 * @author hp2
 */
public class LoginForm extends javax.swing.JFrame {

    /**
     * Creates new form LoginForm
     */
    public LoginForm() {
        initComponents();
    }
    
     public        StudentList sObj=new StudentList();
public ParentLogin pLogin=new ParentLogin();
public StudentLogin sLogin=new StudentLogin();
public TeacherLogin tLogin=new TeacherLogin();
public TeacherList tObj=new TeacherList();
public  ParentList pObj=new ParentList(); 
        TestResult testObj=new  TestResult();
        clone cloneObject=new clone();
                
             

   
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
             public boolean tLoginCheck;


public void objectAddition()
{
//            JOptionPane.showMessageDialog(null, "LOGIN SUCCESS  as student");

    tObj.add("cam", "amjad ali", "naval colony", "03332145698","T001","a");
           tObj.add("Ali", "amjad ali", "naval colony",  "03332145698","T002","123");
           tObj.add("bilu", "amjad ali", "naval colony", "03332145698","T003","123");
           tObj.add("cat", "amjad ali", "naval colony", "03332145698","T004","123");

           sObj.add("ASAD", "ali", "SHARA H FAISAL", "03332145698", "F001","a", "bsse", "software engin","p",316);
           sObj.add("KAINAAT", "SALEEM", "MODEL COLNY", "03332145698", "F002","mmm", "bsse", "software engin","L",317);
           sObj.add("SARA", "ALI KHAN", "naval colony", "03332145698", "F003","wiki", "bsse", "software engin","L",318);
           sObj.add("SHAFIQ", "UMAR", "naval colony","03332145698", "F004","wiki", "bsse", "software engin","L",319);
           sObj.add("UMAIR", "RZZAQ", "naval colony", "03332145698", "F005","wiki", "bsse", "software engin","L",319);
          
            pObj.add("A parent", "amjad ali", "naval colony",  "03332145698","P001","a");
           pObj.add("b parent", "amjad ali", "naval colony",  "03332145698","P002","abc");
           pObj.add("c parent", "amjad ali", "naval colony", "03332145698","P003","abc");
           pObj.add("c", "amjad ali", "naval colony",  "03332145698","P004","abc");
 

 // object copy

tLogin.getTIdInfo=tObj; 
sLogin.getSIdInfo=sObj; 
//pLogin.getIdInfo=pObj; // is ka aik alg object banaya hua ha
}
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jTextField1 = new javax.swing.JTextField();
        jPasswordField1 = new javax.swing.JPasswordField();
        jLabel4 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 153, 204));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Login/Capture.PNG"))); // NOI18N
        jLabel4.setText("jLabel4");

        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Login/AL.png"))); // NOI18N
        jButton4.setText("Login AS ADMINISTRATOR");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Login/TL.png"))); // NOI18N
        jButton3.setText("Login AS TEACHER");
        jButton3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton3MouseClicked(evt);
            }
        });
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Login/SL.png"))); // NOI18N
        jButton1.setText("Login AS STUDENT");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("PASSWORD");

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Login/PL.png"))); // NOI18N
        jButton2.setText("Parents Login");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("USER NAME");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(87, 87, 87)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jPasswordField1, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGap(54, 54, 54)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(54, 54, 54)
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(46, 46, 46)))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(29, Short.MAX_VALUE)
                .addComponent(jLabel4)
                .addGap(72, 72, 72)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jPasswordField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(56, 56, 56)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton4)
                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2)
                    .addComponent(jButton1)))
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

        setSize(new java.awt.Dimension(406, 590));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       // TODO add your handling code here
       // student login
          String pass=new String(jPasswordField1.getPassword());
           String name=new String(jTextField1.getText());
           
        tLoginCheck=   sLogin.loginCecker(name, pass);
           
        if(tLoginCheck==true)
        {
        JOptionPane.showMessageDialog(null, "LOGIN SUCCESS  as student");
        StudentLoginOutput StloginLinking=new StudentLoginOutput();
        StloginLinking.setVisible(true);
        
        }
        else
            JOptionPane.showMessageDialog(null, "LOGIN fail yooooo  stu");

       
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        // TODO add your handling code here:
        //admin login
       
    }//GEN-LAST:event_jButton1MouseClicked

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
    

// admin login

        // TODO add your handling code here:
        
           String pass=new String(jPasswordField1.getPassword());
        if(jTextField1.getText().equalsIgnoreCase("user")&& pass.equalsIgnoreCase("admin"))
        {
        JOptionPane.showMessageDialog(null, "LOGIN SUCCESS  ");
//        JOptionPane.showMessageDialog(null, sObj.toString());
                          AddStudent objectCopyForStudent=new AddStudent();
                     objectCopyForStudent.stObj=sObj;
        
                     AdminSelectionPage moveTowardAdmin=new AdminSelectionPage();
        moveTowardAdmin.setVisible(true);
        

        }
        else
            JOptionPane.showMessageDialog(null, "LOGIN fail hahaha ");
    }//GEN-LAST:event_jButton4ActionPerformed
    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        // teacher login
        
           String pass=new String(jPasswordField1.getPassword());
           String name=new String(jTextField1.getText());
           
        tLoginCheck=   tLogin.loginCecker(name, pass);
           
        if(tLoginCheck==true)
        {
        JOptionPane.showMessageDialog(null, "LOGIN SUCCESS  congr");
        TeacherLoginOutput linkTowardTeacherLoginOutput=new TeacherLoginOutput();
        linkTowardTeacherLoginOutput.setVisible(true);
        }
        else
            JOptionPane.showMessageDialog(null, "LOGIN fail yooooo  ");
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton3MouseClicked
        // TODO add your handling code here:
           String pass=new String(jPasswordField1.getPassword());
           String name=new String(jTextField1.getText());
           
        tLoginCheck=   tLogin.loginCecker(name, pass);
           
        if(tLoginCheck==true)
        {
        JOptionPane.showMessageDialog(null, "LOGIN SUCCESS  waoo");
        }
        else
            JOptionPane.showMessageDialog(null, "LOGIN fail yooooo  ");
    }//GEN-LAST:event_jButton3MouseClicked

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        try {
            // TODO add your handling code here:
            ParentList  parentObjectForItsLogin=new ParentList();
            parentObjectForItsLogin  =  (ParentList)cloneObject.clone();
            parentObjectForItsLogin=pObj;
            
            
           String pass=new String(jPasswordField1.getPassword());
           String name=new String(jTextField1.getText());
           
        tLoginCheck=   pLogin.loginCecker(name, pass,parentObjectForItsLogin);
           
        if(tLoginCheck==true)
        {
        JOptionPane.showMessageDialog(null, "LOGIN SUCCESS  congr");
        ParentsLoginOutput  ParentsLogin=new ParentsLoginOutput();
        ParentsLogin.setVisible(true);
        
        }
        else
        { JOptionPane.showMessageDialog(null, "LOGIN fail yooooo  ");
        
        }
            
        } catch (CloneNotSupportedException ex) {
            Logger.getLogger(LoginForm.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        
    }//GEN-LAST:event_jButton2ActionPerformed
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
            java.util.logging.Logger.getLogger(LoginForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LoginForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LoginForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LoginForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new LoginForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables

    
}
