/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TestResult;

import List.StudentList;
import java.util.Scanner;
  import javax.swing.JFrame;
    import javax.swing.*;
import Login.*;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author hp2
 */
public class ObtainSubjectsMarks extends JFrame{

    public ObtainSubjectsMarks() {
        
    }
    

     
    
    
    LoginForm getObject=new LoginForm();
  
  
  Scanner input=new Scanner(System.in);
  int smallRollNo=316;
            static int bigRollNo=322;


            
            
            
    StudentList getStudentId =new StudentList();
  double[] chemistry=new  double[bigRollNo+1];                    
                  String[]  getStudentName=new String[1000];
                  String[]  getStudentID=new String[1000];
    
                double[] Mathmatics=new  double[bigRollNo+1]; 
                double[] english=new  double[bigRollNo+1]; 
                double[] urdu=new  double[bigRollNo+1]; 
                double[] islamiat=new  double[bigRollNo+1]; 
                double[] physics=new  double[bigRollNo+1]; 
    
    
                  
    
     public void getNameAndId()
     {
    getObject.objectAddition();
    getStudentId=getObject.sObj;
     
      for(int i=0;i<getStudentId.count;i++){
                {   getStudentName[i]=getStudentId.sList[i].getName();
            getStudentID[i]=getStudentId.sList[i].getId();}
        }
     }  
     
     

     
                  
              
    public void physics()
    {
    System.out.println("enter chemistry marks ");
                 System.out.println("Student name    "+"      id "+"       physics marks");
                for(int i=0;i<getStudentId.count;i++)
                {   
                   System.out.print(getStudentName[i]+"                     "+ getStudentID[i]+"             ");  
                    physics[i]=input.nextDouble();
                    
                    
                }
               
                
        }

    public void math()
    {
    System.out.println("enter mathmatics marks ");
                 System.out.println("Student name    "+"      id "+"       Mathmatics marks");
                for(int i=0;i<getStudentId.count;i++)
                {   
                   System.out.print(getStudentName[i]+"                     "+ getStudentID[i]+"             ");  
                    Mathmatics[i]=input.nextDouble();
                }
                System.out.println("\n//////******************ENDED*****************************/////////\n");
    }
    public void chemistry()
    {System.out.println("enter chemistry marks ");
        System.out.println("\n\nsld sd fsd flk s"+getStudentId.count);
                 System.out.println("Student name    "+"      id "+"       chemitry marks");
                for(int i=0;i<getStudentId.count;i++)
                {   
                   System.out.print(getStudentName[i]+"                     "+ getStudentID[i]+"             ");  
                    chemistry[i]=input.nextDouble();
                }
                                System.out.println("\n//////******************ENDED*****************************/////////\n");

                }
    public void english()
    {
     System.out.println("enter english marks ");
                 System.out.println("Student name    "+"      id "+"       english marks");
                for(int i=0;i<getStudentId.count;i++)
                {   
                   System.out.print(getStudentName[i]+"                     "+ getStudentID[i]+"             ");  
                    english[i]=input.nextDouble();
                }
                System.out.println("\n//////******************ENDED*****************************/////////\n");
                
    
    }
    public void urdu()
    { System.out.println("enter urdu marks ");
                 System.out.println("Student name    "+"      id "+"       urdu marks");
                for(int i=0;i<getStudentId.count;i++)
                {   
                   System.out.print(getStudentName[i]+"                     "+ getStudentID[i]+"             ");  
                    urdu[i]=input.nextDouble();
                }
                System.out.println("\n//////******************ENDED*****************************/////////\n");
    }
    
    public void islmiat()
    { System.out.println("enter islamiat marks ");
                 System.out.println("Student name    "+"      id "+"       islamiat marks");
                for(int i=0;i<getStudentId.count;i++)
                {   
                   System.out.print(getStudentName[i]+"                     "+ getStudentID[i]+"             ");  
                    islamiat[i]=input.nextDouble();
                }
                System.out.println("\n//////******************ENDED*****************************/////////\n");
                
                }
      double[] obtainMarks=new double[100];
        double[] percentage=new double[100];
      
    public void createResult()
    {
    // calculate %
        
        int totalMarks=600;
        for(int i=0;i<getStudentId.count;i++)
        {
            obtainMarks[i]=chemistry[i]+physics[i]+Mathmatics[i]+english[i]+urdu[i]+islamiat[i];
            percentage[i]=obtainMarks[i]*100;
            percentage[i]=percentage[i]/100;
        }
    
    
    } 
     
    public void returnResult() throws IOException
    {
//        this.getNameAndId();
//        this.chemistry();
//        this.math();
//        this.physics();
//        this.islmiat();
//        this.english();
//        this.urdu();
//        this.createResult();
        FileWriter resultCard=new FileWriter("C:\\Users\\hp2\\Documents\\NetBeansProjects\\CredibleCollegiateManagementSystem\\src\\TestResult\\Test Result.txt",false);
                BufferedWriter resultCardObject = new BufferedWriter(resultCard);
        int totalMarks=600;
  
        for(int i=0;i<getStudentId.count;i++)
        {
//        this.getNameAndId();
            obtainMarks[i]=chemistry[i]+physics[i]+Mathmatics[i]+english[i]+urdu[i]+islamiat[i];
            percentage[i]=obtainMarks[i]*100;
            percentage[i]=percentage[i]/600;}
        
         for(int i=0;i<getStudentId.count;i++)
                   { 
                   
               
//                  String    sendResultCardDataThroughFilling=testObj.reportCard();
    String    sendResultCardDataThroughFilling="Id "+getStudentID[i]+ "       NAME : "  +getStudentName[i]+"          PERCENTAGE : " +percentage[i]+System.getProperty("line.separator");

                       
                    resultCardObject.write(sendResultCardDataThroughFilling);
                 
                 i++;
            }    
               
           
                    resultCardObject.close();
        
//                JOptionPane.showMessageDialog(null, "RESULT CARD \n"
//                        + "NAME :  "+getStudentName[i]+"\n"
//                        + "ID  "+ getStudentID[i]+"\n"
//                        + "SUBJECTS  MARKS\n"
//                        + "CHEMISTRY "+chemistry[i]+"\n"
//                        + "PHYSICS "+physics[i]+"\n"
//                        + "MATH "+Mathmatics[i]+"\n"
//                        + "ISLAMIAT "+islamiat[i]+"\n"
//                        + "ENGLISH "+english[i]+"\n"
//                        + "URDU "+urdu[i] +"\n\n"
//                        + "TOTAL MARKS 600\n"
//                        + "MARKS OBTAIN  "+obtainMarks[i]+"\n"
//                        + "PERCENTAGE  "+percentage[i]);

                
        }
   
     
     public void returnResult(String name)
    {
    
    try{
                BufferedReader file = new BufferedReader(new FileReader("C:\\Users\\hp2\\Documents\\NetBeansProjects\\CredibleCollegiateManagementSystem\\src\\TestResult\\Test Result.txt"));
                String line;
                int noResultFound=0;
                while ((line = file.readLine()) != null) 
                {
                    
                    if (line.contains(name))
                    {
                        
                          JOptionPane.showMessageDialog(null," REPORT CARD \n\n "+line);
                       noResultFound++; 
                    }
                }
                if(noResultFound==0)
                  JOptionPane.showMessageDialog(null,"Sorry no Result Found");  
                file.close();
        }
        catch(IOException e)
        {}
        }
    
        
}
