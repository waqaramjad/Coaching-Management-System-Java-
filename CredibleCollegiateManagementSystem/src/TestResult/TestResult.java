/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TestResult;

import crediblecollegiatemanagementsystem.*;
import List.*;
import java.util.*;
import Attendence.Attendence;

import java.io.*;

/**
 *
 * @author hp2
 */
public class TestResult {
    
  public  StudentList getStudentNameAndId =new StudentList();
  public  StudentList getStudentId =new StudentList();
  Scanner input=new Scanner(System.in);
  int smallRollNo=0;
  int bigRollNo=0; // is ki value ko nai access kr pa raha tha
  CredibleCollegiateManagementSystem  object=new CredibleCollegiateManagementSystem();
  // creatTestResult
    public void creatTestResult(StudentList Obj){
        
//        getStudentId
        getStudentId=Obj;
        System.out.println("counter is "+getStudentId.count);
    String[]  saveStudentIds=new  String[getStudentId.count];
            bigRollNo=getStudentId.sList[0].getClassRollNo();
           smallRollNo=getStudentId.sList[0].getClassRollNo();
    for(int i=0;i<getStudentId.count;i++)
        {
            if(bigRollNo<getStudentId.sList[i].getClassRollNo())
            {
             bigRollNo= getStudentId.sList[i].getClassRollNo();   
            }
            else if(smallRollNo>getStudentId.sList[i].getClassRollNo()){
        
            smallRollNo=getStudentId.sList[i].getClassRollNo();
           
         //   if(saveStudentIds[0]>getStudentId.sList[i].getId())
           
    
//      String[]  getStudentName=new String[getStudentNameAndId.count];
//  String[]  getStudentID=new String[getStudentNameA
//          ndId.count];
            } } 
//                 System.out.println("big roll no is"+bigRollNo);
//                     System.out.println("small roll is"+ smallRollNo);
//    
//    this.bigRollNo=bigRollNo;
//    this.smallRollNo=smallRollNo;
//return this.bigRollNo;
    }
    
    public int sendNumber()
    {
        System.out.println("            hbkds ksd  sdkf dsk fkjds f"+bigRollNo);
    
        return bigRollNo;
    }
    double[] chemistry=new  double[sendNumber()+1];                    
                double[] physics=new  double[sendNumber()+1];                    
                double[] Mathmatics=new  double[bigRollNo+1]; 
    
                  String[]  getStudentName=new String[this.bigRollNo+1];
                  int[]  getStudentID=new int[this.bigRollNo+1];
    
     
  //int bigRollNo=getStudentNameAndId.sList[getStudentNameAndId.count].getClassRollNo();
        
            public void creatTestResult()
            {    
                
                System.out.println(";kf/////////////////////////////////          "+this.bigRollNo);
                System.out.println(";kf/////////////////////////////////          "+getStudentId.count);
          //  System.out.println("lerniow eroiw eoirw eoir w  "+smallRollNo);
//                double[] chemistry=new  double[this.bigRollNo+1];                    
//                double[] physics=new  double[this.bigRollNo+1];                    
//                double[] Mathmatics=new  double[this.bigRollNo+1];  
            
//                double[] urdu =new  double[this.bigRollNo];                    
//                double[] english=new  double[this.bigRollNo];                    
//                double[] islamiat=new  double[this.bigRollNo];
//                System.out.println("which subjects marks do you want to enter");

            for(int i=0;i<getStudentId.count;i++)
                {   getStudentName[i]=getStudentId.sList[i].getName();
            getStudentID[i]=getStudentId.sList[i].getClassRollNo();
//                    System.out.println("lerniow eroiw eoirw eoir w  "+getStudentName[i]);
//                    System.out.println("wien weir wioer weroiw eriow er   "+getStudentID[i]);
                     }
        
                     
                //for(int i=smallRollNo;i<=bigRollNo;i++)
        // chemistry
                  System.out.println("enter chemistry marks ");
                 System.out.println("Student name    "+"      id "+"       chemitry marks");
                for(int i=0;i<getStudentId.count;i++)
                {   
                   System.out.print(getStudentName[i]+"                     "+ getStudentID[i]+"             ");  
                    chemistry[smallRollNo]=input.nextDouble();
                    smallRollNo++;
                }
                smallRollNo=316;
          // mathmatics 
                  System.out.println("enter chemistry marks ");
                 System.out.println("Student name    "+"      id "+"       Mathmatics marks");
                for(int i=0;i<getStudentId.count;i++)
                {   
                   System.out.print(getStudentName[i]+"                     "+ getStudentID[i]+"             ");  
                    Mathmatics[smallRollNo]=input.nextDouble();
                    smallRollNo++;
                }
                smallRollNo=316; // ya is liya lia ha ion ka ya ++ ho ka value change ho jaye gi
        //physics  
                  System.out.println("enter chemistry marks ");
                 System.out.println("Student name    "+"      id "+"       physics marks");
                for(int i=0;i<getStudentId.count;i++)
                {   
                   System.out.print(getStudentName[i]+"                     "+ getStudentID[i]+"             ");  
                    physics[smallRollNo]=input.nextDouble();
                    smallRollNo++;
                }
               smallRollNo=316;
               
  // create report card
   // report card is 
//      double[] ResultCard=new double[bigRollNo+1];
//                System.out.println(" Students report card is ");
//                int total =300;
//                   for(int i=smallRollNo;i<=bigRollNo;i++)
//                   {    
//                      ResultCard[i]= physics[i]+Mathmatics[i]+chemistry[i];
//                       ResultCard[i]=ResultCard[i]*100;
//                       ResultCard[i]=ResultCard[i]/300;
//                       }
//                   int w=0;
//                   System.out.println("Student name    "+"      id "+"       RESULT");
//                   for(int i=smallRollNo;i<=bigRollNo;i++)
//                   { System.out.println(i+"              "+getStudentName[w]+"               " +ResultCard[i]); 
//                w++;}
    }
       public void reportCard() throws IOException
               
    {  
         FileWriter resultCard=new FileWriter("C:\\Users\\hp2\\Documents\\NetBeansProjects\\CredibleCollegiateManagementSystem\\src\\TestResult\\Test Result.txt",false);
                BufferedWriter resultCardObject = new BufferedWriter(resultCard);
                
                double[] ResultCard=new double[bigRollNo+1];
                System.out.println(" Students report card is ");
                int total =300;
                   for(int i=smallRollNo;i<=bigRollNo;i++)
                   {    
                      ResultCard[i]= physics[i]+Mathmatics[i]+chemistry[i];
                       ResultCard[i]=ResultCard[i]*100;
                       ResultCard[i]=ResultCard[i]/300;
                       }
                   int w=0;
                   System.out.println("Student name    "+"      id "+"       RESULT");
                   for(int i=smallRollNo;i<=bigRollNo;i++)
                   { System.out.println(i+"              "+getStudentName[w]+"               " +ResultCard[i]); 
                   
               
//                  String    sendResultCardDataThroughFilling=testObj.reportCard();
                   String    sendResultCardDataThroughFilling=i+"              "+getStudentName[w]+"               " +ResultCard[i]+System.getProperty("line.separator");
                    resultCardObject.write(sendResultCardDataThroughFilling);
                 
                 w++;
               
             //  for(int i=smallRollNo;i<=bigRollNo;i++)
////                {System.out.println(" hpysics marks"+;}
            }    
                    resultCardObject.close();
                   
//                        FileWriter resultCard=new FileWriter("C:\\Users\\hp2\\Documents\\NetBeansProjects\\CredibleCollegiateManagementSystem\\src\\List\\Parent List.txt",false);
//                try (BufferedWriter resultCardObject = new BufferedWriter(resultCard)) {
//                String    sendResultCardDataThroughFilling=testObj.reportCard();

//                    resultCardObject.write(sendResultCardDataThroughFilling);
//                    resultCardObject.close();
}}