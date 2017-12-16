/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AdministratorUse;

import List.*;
import Accounts.*;
import Login.LoginForm;
import crediblecollegiatemanagementsystem.Student;
import java.io.BufferedReader;
import java.io.FileReader;
import javax.swing.JOptionPane;

/**
 *
 * @author hp2
 */
public class AdminSelectionPage extends javax.swing.JFrame {

    /**
     * Creates new form AdminSelectionPage
     */
    
    public        StudentList sObj=new StudentList();
 public    LoginForm ObjectCopy=new LoginForm();

 public    AddStudent addFunctionality=new AddStudent();
 public    ADDTEACHER addTeach=new ADDTEACHER();
 public AddParent addParent=new AddParent();
    public TeacherList tObj=new TeacherList();
public  ParentList pObj=new ParentList(); 

    public AdminSelectionPage() {
        initComponents();
        ObjectCopy.objectAddition();
        this.tObj=ObjectCopy.tObj;
        this.sObj=ObjectCopy.sObj;
        this.pObj=ObjectCopy.pObj;
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jComboBox1 = new javax.swing.JComboBox<>();
        jButton5 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jButton5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton5.setText("ACCOUNT SECTION");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton5);
        jButton5.setBounds(220, 430, 200, 25);

        jButton4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton4.setText("NET $");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4);
        jButton4.setBounds(350, 350, 180, 30);

        jButton2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton2.setForeground(new java.awt.Color(0, 0, 51));
        jButton2.setText("DELETE ACCOUNT");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(360, 270, 170, 30);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("SELECT ONE OF THE FOLLOWING");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(170, 180, 320, 50);

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton1.setText("ADD ACOUNT");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(110, 270, 180, 25);

        jButton3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton3.setText("FIND ACCOUNT");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3);
        jButton3.setBounds(110, 350, 170, 25);

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/picture/L5.PNG"))); // NOI18N
        getContentPane().add(jLabel5);
        jLabel5.setBounds(190, 10, 280, 150);

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/AdministratorUse/cool-background.jpg"))); // NOI18N
        getContentPane().add(jLabel6);
        jLabel6.setBounds(0, 0, 640, 520);

        setSize(new java.awt.Dimension(657, 557));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        int userSelectionInteger = Integer.parseInt(JOptionPane.showInputDialog("CREDIBLE COLLIGIATE SYSTEM\n\n"
                + " SELECT ONE OF THE FOLLOWING TO DELETE or\n"
                              + "1) STUDENT\n"
                              + "2)Teacher\n"
                             + "3) Parent\n" ));
                             switch(userSelectionInteger)
                             {
                                 case 1:
                                 { String   nameToFind = JOptionPane.showInputDialog("enter name to find\n\n");
//                                                          sObj.find(nameToFind);
                                                          sObj.findStudent(nameToFind);
                                                          break;}
                                 case 2:
                                 {  String   nameToFind = JOptionPane.showInputDialog("enter name to find\n\n");
                                                          tObj.findTeacher(nameToFind);
                                                          break;}
                                     
                                 case 3:
                                 { String   nameToFind = JOptionPane.showInputDialog("enter name to find\n\n");
                                                          pObj.findParent(nameToFind);
                                                          break;}
                                    
                             }
    }//GEN-LAST:event_jButton3ActionPerformed

    public void clculateProfit()
    {
    Student[] paid=new Student[sObj.count];
        Student[] late=new Student[sObj.count];
        int noOfLatePaidStudents=0,noOfPaidStudents=0;
          
            for(int i=0;i<sObj.count;i++)
        {
            if("L".equals(sObj.sList[i].getFeeStatus()))
            { late[noOfLatePaidStudents]=sObj.sList[i]; 
            noOfLatePaidStudents++;    }
            else
                {paid[noOfPaidStudents]= sObj.sList[i]; 
                noOfPaidStudents++;}}
    
            }
    
    
    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        Student[] paid=new Student[sObj.count];
        Student[] late=new Student[sObj.count];
        int noOfLatePaidStudents=0,noOfPaidStudents=0;
          
            for(int i=0;i<sObj.count;i++)
        {
            if("L".equals(sObj.sList[i].getFeeStatus()))
            { late[noOfLatePaidStudents]=sObj.sList[i]; 
            noOfLatePaidStudents++;    }
            else
                {paid[noOfPaidStudents]= sObj.sList[i]; 
                noOfPaidStudents++;}}
            
            this.clculateProfit();
    JOptionPane.showMessageDialog(null,"No of Paid student is "+noOfPaidStudents+"\n\n"+
                                         "No of LATE student is "+noOfLatePaidStudents+"\n\n");

            if( noOfLatePaidStudents<noOfPaidStudents)
     JOptionPane.showMessageDialog(null,"YOU ARE IN PROFIT ");
                                            else 
     JOptionPane.showMessageDialog(null,"YOU ARE IN LOSS");

                                                
                                            
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
// delete
// un boxing
Integer w=new Integer(0);
          int userSelectionInteger=w.intValue();

     userSelectionInteger = Integer.parseInt(JOptionPane.showInputDialog("CREDIBLE COLLIGIATE SYSTEM\n\n"
                + " SELECT ONE OF THE FOLLOWING TO DELETE or\n"
                              + "1) STUDENT\n"
                              + "2)Teacher\n"
                             + "3) Parent\n" ));
                                switch(userSelectionInteger){
                             case 1:
                            
                             {
//                                 studentObjectCopy.objectAddition();
//                                            this.sObj=studentObjectCopy.sObj;
                                            String   nameToDelete = JOptionPane.showInputDialog("enter name to delete\n\n");

//                                            sObj.delete(nameToDelete);
                                            sObj.deleteSrudentsFromFile(nameToDelete);
//                                          JOptionPane.showMessageDialog(null,sObj.toString());
 String getStringFromFile;
       try{
         
                                                    String savingValues="";
                                                    BufferedReader f5=new  BufferedReader(new FileReader("C:\\Users\\hp2\\Documents\\NetBeansProjects\\CredibleCollegiateManagementSystem\\src\\List\\Student List.txt"));  
                                                            while((getStringFromFile=f5.readLine())!=null)
                                                                {
//                                                                     
                                                          savingValues+=getStringFromFile+System.getProperty("line.separator");       
                                                                  }
                                                        JOptionPane.showMessageDialog(null,savingValues);
                                                            
       } catch(Exception e){}

                             break;}
                                            
                             case 2:{
                                 String   nameToDelete = JOptionPane.showInputDialog("enter name to delete\n\n");

                                            tObj.deleteTeacherFromFile(nameToDelete);
//                                          JOptionPane.showMessageDialog(null,tObj.toString());
 String getStringFromFile;
       try{
         
                                                    String savingValues="";
                                                    BufferedReader f5=new  BufferedReader(new FileReader("C:\\Users\\hp2\\Documents\\NetBeansProjects\\CredibleCollegiateManagementSystem\\src\\List\\Teacher List.txt"));  
                                                            while((getStringFromFile=f5.readLine())!=null)
                                                                {
//                                                                     
                                                          savingValues+=getStringFromFile+System.getProperty("line.separator");       
                                                                  }
                                                        JOptionPane.showMessageDialog(null,savingValues);
                                                            
       } catch(Exception e){}
//                                 addTeach.setVisible(true);
                                 break;}
                             case 3:
                                 {
                                 String   nameToDelete = JOptionPane.showInputDialog("enter name to delete\n\n");

                                            pObj.deleteParentFromFile(nameToDelete);
//                                          JOptionPane.showMessageDialog(null,pObj.toString());
 String getStringFromFile;
       try{
         
                                                    String savingValues="";
                                                    BufferedReader f5=new  BufferedReader(new FileReader("C:\\Users\\hp2\\Documents\\NetBeansProjects\\CredibleCollegiateManagementSystem\\src\\List\\Parent List.txt"));  
                                                            while((getStringFromFile=f5.readLine())!=null)
                                                                {
//                                                                     
                                                          savingValues+=getStringFromFile+System.getProperty("line.separator");       
                                                                  }
                                                        JOptionPane.showMessageDialog(null,savingValues);
                                                            
       } catch(Exception e){}
//                                 addTeach.setVisible(true);
                                 break;}
                                 
                                } 
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        // add 
      
        // un boxing
        
int userSelection=0;
         Integer userSelectionInteger= Integer.valueOf(userSelection);

 userSelectionInteger = Integer.parseInt(JOptionPane.showInputDialog("CREDIBLE COLLIGIATE SYSTEM\n\n"
                + " SELECT ONE OF THE FOLLOWING TO ADD or\n"
                              + "1) STUDENT\n"
                              + "2)Teacher\n"
                             + "3) Parent\n" ));

                             switch(userSelectionInteger)
                             {case 1:
                              addFunctionality.setVisible(true);
                              break;
                             case 2:
                                 addTeach.setVisible(true);
                                 break;
                             case 3:
                                 addParent.setVisible(true);
                                 break;
                                }

    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        ListOfPaidAndUnPaidStudents LinkToListOfPaidAndUnPaidStudents=new ListOfPaidAndUnPaidStudents();
        LinkToListOfPaidAndUnPaidStudents.setVisible(true);
      
    }//GEN-LAST:event_jButton5ActionPerformed

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
            java.util.logging.Logger.getLogger(AdminSelectionPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AdminSelectionPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AdminSelectionPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AdminSelectionPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AdminSelectionPage().setVisible(true);
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    // End of variables declaration//GEN-END:variables
}