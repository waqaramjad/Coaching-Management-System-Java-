/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package crediblecollegiatemanagementsystem;
import Login.*;
import List.*;
import java.util.*;
//import java.util.Scanner;
import Accounts.*;
import Attendence.Attendence;
import TestResult.TestResult;
import java.io.*;
import javax.swing.JOptionPane;
import AdministratorUse.*;
/**
 * @author 
  waqar amjad
*/

public class CredibleCollegiateManagementSystem {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args){ //throws CloneNotSupportedException,IOException {
        // TODO code application logic here
      
    try{    
// object potion
  // array type object for profit calculate
        
 // log in type object       
        
        
        LoginForm log=new LoginForm();
        log.objectAddition();
        log.setVisible(true);
        AdministratorLogin AdLog=new AdministratorLogin();
// attendence object
    Attendence StudentAttendence=new Attendence();
 
  /// list type object
     StudentList sObj=new StudentList();
        TeacherList tObj=new TeacherList(); 
//        

        
        ParentList pObj=new ParentList(); 
        TeacherLogin tLogin =new TeacherLogin();
        TestResult testObj=new  TestResult();
        
        // boxin and un-boxing
        Integer w=new Integer(0);
          int userEndingSelection=w.intValue();
        
        // LOGIN OBJECT
        Login LObj ;
        
//          sObj.add("A", "amjad ali", "naval colony", 033, "315","wiki", "bsse", "software engin","p",315);
//
//           sObj.add("t", "amjad ali", "naval colony", 033, "a","a", "bsse", "software engin","p",316);
//           sObj.add("j", "amjad ali", "naval colony", 033, "mm","mmm", "bsse", "software engin","L",317);
//           sObj.add("m", "amjad ali", "naval colony", 033, "a318","wiki", "bsse", "software engin","L",318);
//           sObj.add("q", "amjad ali", "naval colony", 033, "319","wiki", "bsse", "software engin","L",319);
//           sObj.add("q", "amjad ali", "naval colony", 033, "319","wiki", "bsse", "software engin","L",319);
//        
           
        String sendStudentDataThroughFilling;
        String sendParentsDataThroughFilling;
        String sendTeachersDataThroughFilling;
        

        
//           System.out.println(sObj);

//           tObj.add("cam", "amjad ali", "naval colony",  993045790,"a","a");
//           tObj.add("Ali", "amjad ali", "naval colony",  993045790,"abc","123");
//           tObj.add("bilu", "amjad ali", "naval colony",  993045790,"123","123");
//           tObj.add("cat", "amjad ali", "naval colony",  993045790,"b123","123");
//              System.out.println(tObj);
           
      
        // parent initialization   
           
//
//           pObj.add("A parent", "amjad ali", "naval colony",  993045790,"a","a");
//           pObj.add("b parent", "amjad ali", "naval colony",  993045790,"amjad","abc");
//           pObj.add("c parent", "amjad ali", "naval colony",  993045790,"ali","abc");
//           pObj.add("c", "amjad ali", "naval colony",  993045790,"waqar","abc");
      
//                System.out.println(pObj);
                

        
        
 ///  object copy logic yoooo    
           
        
        
        
      
        
      
        // output
        
        
         // profit logic  
         
        Student[] paid=new Student[1000000];
        Student[] late=new Student[1000000];
        int noOfLatePaidStudents=0,noOfPaidStudents=0;
          
            for(int i=0;i<sObj.count;i++)
        {
            if("L".equals(sObj.sList[i].getFeeStatus()))
            { late[noOfLatePaidStudents]=sObj.sList[i]; 
            noOfLatePaidStudents++;    }
            else
                {paid[noOfPaidStudents]= sObj.sList[i]; 
                noOfPaidStudents++;}
            }
            System.out.println("\n\npaid studemts list \n\n ");
            for(int i=0;i<noOfPaidStudents;i++)
            System.out.println(paid[i].toString());
            
            System.out.println("late paid students list ");
            for(int i=0;i<noOfLatePaidStudents;i++)
            System.out.println(late[i].toString());


//           LoginForm login=new LoginForm(); 
//           login.objectAddition();
//                          login.setVisible(true);

/////////////************************** commment for check up*****************////////////////////////
         
         Scanner in=new Scanner(System.in);
         
         // boxing
         int userSelection=0;
  do{      
         Integer userSelectionInteger= Integer.valueOf(userSelection);
//                   
//        System.out.println("WELCOME TO CREDIBLE COLLIGIATE SYSTEM");
//                                                                       System.out.println(addSt.sObj.toString());  //addSt.sObj.toString();
//            userSelectionInteger = Integer.parseInt(JOptionPane.showInputDialog("WELCOME TO CREDIBLE COLLIGIATE SYSTEM\n\n"
//                + " 1) login as Administrator\n"
//                              + "2) login as Accountant\n"
//                              + "3)login as Teacher\n"
//                             + "4) login as Parent\n"
//                              + "5) login as Student\n"));
                            
//         System.out.println("TELL US HOW YOU WANT TO LOGIN\n");
//         System.out.println("press any of the following\n\n");
//         System.out.println(" 1) login as Administrator\n"
//                              + "2) login as Accountant\n"
//                              + "3)login as Teacher\n"
//                             + "4) login as Parent\n"
//                              + "5) login as Student\n");
//        / =in.nextInt();
     
// un boxing
         userSelectionInteger=in.nextInt();
         
         {
             switch(userSelectionInteger)
                     {
  //************************************** ADMIN LOGIN************************************************///////////////                   
             
                 case 1:{
                     System.out.println("ener your login id ");
                     String  Aid=in.next();
                     System.out.println("ener your login password");
                     String  Apassword=in.next();
                     boolean AloginInfo=  AdLog.AdministratorLoginCheck(Aid, Apassword);//loginCecker(Aid,  Apassword);//LoginCheck(Aid, Apassword);
                           
                
                        if(AloginInfo==true)
          
                                { System.out.println("Welcome to login as an ADMINISTRATOR"
                                                     + "\n SELECT ANY ONE OF THE FOLLOWING "
                                                     + "1) ADD 2) DELETE 3) FIND 4) PROFIT 5)output");
                                 int adminSelect=in.nextInt();
                                    switch(adminSelect)
                                        {
                                        case 1: {
                                            System.out.println("tell us what you are want to add "
                                                    + "press \n 1) for student 2) teacher 3) parent");
                                                       int addInfo=in.nextInt();
                                                       
                                                       switch(addInfo)
                                                       {
                                     // add                      
                                                           case 1:
                                                              // AdministratorFunction addSt=new AdministratorFunction();
                                                               //addSt.setVisible(true);
                                                            String name,fatherName,adress,password,studyClass,course,id;
                                                               int contactNo;
//                                                               System.out.println("enter name");
//                                                                  name=in.next();
//                                                               System.out.println("enter father name");
//                                                                  fatherName=in.next();;
//                                                               System.out.println("enter adress");
//                                                                 adress=in.next();
//                                                               System.out.println("enter contact no");
//                                                                  contactNo=in.nextInt();
//                                                               System.out.println("enter id ");
//                                                                   id=in.next();
//                                                               System.out.println("enter password ");
//                                                                password=in.next();
//                                                               System.out.println("enter Study class ");
//                                                                 studyClass=in.next();
//                                                               System.out.println("enter course  ");
//                                                                    course=in.next();
//                                                                    System.out.println("enter fee status");
//                                                                    String feeStatus=in.next();
//                                                                    System.out.println("enter roll no");
//                                                                    int rollNo=in.nextInt();
                                                                    
//                                                           sObj.add(name,fatherName,adress,contactNo,id,password,studyClass,course,feeStatus,rollNo);
                                                             sendStudentDataThroughFilling=  sObj.sList[sObj.sList.length-1].toString()+"\n";
//                                                        
                                                               //System.out.println(addSt.sObj.toString());  //addSt.sObj.toString();
                                                              FileWriter students=new FileWriter("C:\\Users\\hp2\\Documents\\NetBeansProjects\\CredibleCollegiateManagementSystem\\src\\List\\Student List.txt",true);
                                                                 BufferedWriter studentsObject = new BufferedWriter(students);
                                                                  //  sendStudentDataThroughFilling=sObj.toString();
                                                               studentsObject.write(sendStudentDataThroughFilling);
                                                                   studentsObject.close();
//                                                             l=sObj.toString();
//                                                              bf.write(l);
//                                                                 bf.close();
                                                           
                                                           break; 
                                                           
                                                           case 2:{
                                                               in.nextLine();
                                                               System.out.println("enter name");
                                                                     name=in.nextLine();
                                                               System.out.println("enter father name");
                                                                  fatherName=in.nextLine();
                                                               System.out.println("enter adress");
                                                                 adress=in.nextLine();
                                                               System.out.println("enter contact no");
                                                                  contactNo=in.nextInt();
                                                               System.out.println("enter id ");
                                                               String tid;
                                                                   tid=in.nextLine();
                                                               System.out.println("enter password ");
                                                                password=in.nextLine();
//                                                                tObj.add(name,fatherName,adress,contactNo,tid,password);
                                                                break;}
                                                           case 3:
                                                                System.out.println("enter name");
                                                                  name=in.next();
                                                               System.out.println("enter father name");
                                                                  fatherName=in.next();;
                                                               System.out.println("enter adress");
                                                                 adress=in.next();;
                                                               System.out.println("enter contact no");
                                                                  contactNo=in.nextInt();
                                                               System.out.println("enter id ");
                                                                   id=in.next();
                                                               System.out.println("enter password ");
                                                                password=in.next();
//                                                              pObj.add(name,fatherName,adress,contactNo,id,password);
//                                                                  System.out.println("if you want to see output press 1 else press any key");
//                                                                  int userSeeOutput=in.nextInt();
                                                                  System.out.println(pObj);
                                                                  break;
                                                                  
                                                       }
                                                       break;}
                                    //delete function                   
                                                case 2:{
                                                           System.out.println("tell which person do you want to delete"
                                                          + "press 1) teacher 2) student 3) parent");
                                                          int  adminSelectForDelete=in.nextInt();
                                                   
                                                            switch(adminSelectForDelete) 
                                                                {
                                                                case 1:
                                                                { System.out.println("Enter teacher  name to DELETE it");
                                                                      String name=in.next();
                                                                      tObj.delete(name);
                                                                      System.out.println("your output is here/n"+tObj);
                                                                      tObj.deleteTeacherFromFile(name);
                                                                      
                                                                      
                                                                      
                                                                    break;}
                                                                case 2:
                                                                    {System.out.println("Enter student  name to DELETE it");
                                                                      String name=in.next();
                                                                      sObj.delete(name);
                                                                      System.out.println("your output is here/n"+sObj);
                                                                       sObj.deleteSrudentsFromFile(name);
                                                                      
                                                                      break;}
                                                                case 3:
                                                                        {System.out.println("Enter parent  name to DELETE it");
                                                                      String Name=in.next();
                                                                      pObj.delete(Name);
                                                                      System.out.println("your output is here/n"+pObj);
                                                                      pObj.deleteParentFromFile(Name);}
                                                                       break; }
                                                            
                                                                      break;}
                           //find                                           
                                       case 3:{
                                            System.out.println("for find user\n "
                                                    + "press 1) Student 2) techer 3) parent");
                                              int adminSelectForFind=in.nextInt();
                                                 switch(adminSelectForFind)
                                                        {
                                                     case 1:
                                                         System.out.println("Enter student name to FIND in the list");
                                                          String name=in.next();
//                                                          sObj.find(name);
                                                          sObj.findStudent(name);
                                                          break;
                                                     case 2:
                                                         System.out.println("Enter teacher name to FIND in the list");
                                                         String  teacherName=in.next();
//                                                          tObj.find(name);
                                                           tObj.findTeacher(teacherName);
                                                          break;
                                                     case 3:
                                                         System.out.println("Enter parent name to FIND in the list");
                                                           name=in.next();
//                                                          pObj.find(name);
                                                          pObj.findParent(name);
                                                          break;
                                                                                                          
                                                           }
                                                            break;}
                                        
                           // profit logic 
                                        case 4: {
                                            if( noOfLatePaidStudents<noOfPaidStudents)
                                                System.out.println("you are in profit");
                                            else 
                                                System.out.println("you are in loss");
                                                
                                            break;}
                                        case 5: 
                                        {
//                                            System.out.println(pObj+"\n\n\n\n");
//                                            System.out.println(tObj+"\n\n\n\n");
//                                            System.out.println(sObj+"\n\n\n\n");
                                            
                                            System.out.println("which thing do want to see"
                                                    + "1"
                                                    + "1) Students 2) Teachers 3) Parents");
                                            
                                              int adminSelectForOutput=in.nextInt();
                                                 switch(adminSelectForOutput)
                                                 {
                                                     case 1:{
                                                    String ab;
                                                    
                                                    BufferedReader f5=new  BufferedReader(new FileReader("C:\\Users\\hp2\\Documents\\NetBeansProjects\\CredibleCollegiateManagementSystem\\src\\List\\Student List.txt"));  
                                                            while((ab=f5.readLine())!=null)
                                                                {
//                                                                     System.out.print(ab+System.getProperty("line.separator"));
                                                                     
                                                 JOptionPane.showMessageDialog(null,ab+System.getProperty("line.separator") );

                
                                                                  }
                                                            break;    }
                                                     case 2:
                                                     {
                                                    String ab;
                                                    BufferedReader f5=new  BufferedReader(new FileReader("C:\\Users\\hp2\\Documents\\NetBeansProjects\\CredibleCollegiateManagementSystem\\src\\List\\Teacher List.txt"));  
                                                            while((ab=f5.readLine())!=null)
                                                                {
                                                                     System.out.print(ab+System.getProperty("line.separator"));
                
                                                                  }
                                                            break;    }
                                                 
                                                     case 3:
                                                     {
                                                    String ab;
                                                    BufferedReader f5=new  BufferedReader(new FileReader("C:\\Users\\hp2\\Documents\\NetBeansProjects\\CredibleCollegiateManagementSystem\\src\\List\\Parent List.txt"));  
                                                            while((ab=f5.readLine())!=null)
                                                                {
                                                                     System.out.print(ab+System.getProperty("line.separator"));
                
                                                                  }
                                                            break;    }
                                                 
                                                 }
                                        
                                    break;}
                                }
                
                }
            
            //////////////////////////////  //// stop admin **************************************////////////
                    else
                         System.out.println("your login info are not correct please try again");
                 break;}
  //**************************************accountant LOGIN************************************************///////////////                   
 // accountant
            
                 case 2:                    
                     break;
//  /////********************************* teacher login ******************************************************/////          
//                 
                 case 3:
//object coipying 
                 {
                     clone cloneObject=new clone();
//                   teacherObjectForItsLogin=  cloneObject.clone();
                   //teacherObjectForItsLogin=tObj;
//                          tLogin.getTIdInfo=tObj;
                          
//                      tLogin.getLoginDataOfTeachers();
//                       System.out.println("ener your login id ");
//                       String  tId=in.next();
//                       System.out.println("ener your login password");
//                       String  tPassword=in.next();
                       boolean recieveTeacherLoginInfo=true;//login.tLoginCheck; //tLogin.loginCecker(tId,tPassword);
                       if(recieveTeacherLoginInfo==true)
                       { System.out.println("YOU LOGIN AS TEACHER \n 1) ATTENDENCE 2) to create test result"); 
                               int TeacherInput=in.nextInt();
                                    switch(TeacherInput){
                                        
                                        case 1:{
                                            StudentAttendence.studentAttendence=sObj;
                                            StudentAttendence.takeAttendence();
                                            
                                        break;}
                                            
                                        case 2:{
                                           // testObj.getStudentId=sObj;
                                          //  testObj.getStudentNameAndId=sObj;
                                          
                 // use overriding here
//               also use object passing as a parameter
                                            testObj.creatTestResult(sObj);
                                            testObj.sendNumber();
                                            testObj.creatTestResult();
                                            
//                                            testObj.testResult123(0,0);
//                                            testObj.enterSubjectsMarks();
                                            testObj.reportCard();
//                            FileWriter resultCard=new FileWriter("C:\\Users\\hp2\\Documents\\NetBeansProjects\\CredibleCollegiateManagementSystem\\src\\List\\Parent List.txt",false);
//                try (BufferedWriter resultCardObject = new BufferedWriter(resultCard)) {
//                String    sendResultCardDataThroughFilling=testObj.reportCard();
//                    resultCardObject.write(sendResultCardDataThroughFilling);
//                    resultCardObject.close();
//                }
                                            
                                           // testObj.reportCard();
                                           break;
                                        }
                                    }
                        }
                      // System.out.println("\n\n Login success \n");
                        else
                            System.out.println("\n Login fail try again\n"+recieveTeacherLoginInfo);
              
                 break;}
                            
                       
                   //   boolean tloginInfo=  AdLog.AdministratorLoginCheck(tid, tpassword);
                       
                       
  //**************************************PARENTS LOGIN************************************************///////////////                   
                 case 4:
                     clone cloneObject=new clone();
                 {ParentLogin pLogin=new ParentLogin();
                  ParentList  parentObjectForItsLogin=new ParentList(); 
                          parentObjectForItsLogin  =  (ParentList)cloneObject.clone();
                          parentObjectForItsLogin=pObj;
                          
//                 pLogin.getPIdInfo=pObj; 
//                   pLogin = (ParentLogin)cloneObject.clone();
                     
                     // pLogin.getLoginDataOfTeachers();
                     System.out.println("ener your login id ");
                           String pId=in.next();
                     System.out.println("ener your login password");
                     String  pPassword=in.next();
                  
                        boolean recieveParentLoginInfo= pLogin.loginCecker(pId,pPassword,parentObjectForItsLogin);
                       if(recieveParentLoginInfo==true)
                       
                       { System.out.println(" you login as a parent"
                               + "press 1) FOR RESULT");
                       int parentInput=in.nextInt();
                                    switch(parentInput){
                                        case  1:{
                                            testObj.reportCard();
                                            break;}
                                        
                                }}
                     
                     else
                           System.out.println(" fail");
                        break;
                 }
//                 
//  /////*****************************    STUDENT LOGIN         ***************************/////////////////////               
                 case 5:{
//                 { System.out.println("ener your login id ");
//                           String sId=in.next();
//                     System.out.println("ener your login password");
//                     int  sPassword=in.nextInt();
//Login LObj;
                     StudentLogin sLogin=new StudentLogin();
                     sLogin.getSIdInfo=sObj;  
//                      sLogin.getLoginData();
                     System.out.println("ener your login id ");
                           String pId=in.next();
                     System.out.println("ener your login password");
                     String  pPassword=in.next();
                  
                        boolean recieveParentLoginInfo= sLogin.loginCecker(pId,pPassword);
                       if(recieveParentLoginInfo==true)
                            { System.out.println(" you login as a STUDENT"
                               + "press 1) FOR RESULT");
                              int studentInput=in.nextInt();
                                    switch(studentInput){
                                        case  1:{
                                            testObj.reportCard();
                                            
                                            break;}}
                            }
//                           System.out.println(" mubarak ho");
                     else
                           System.out.println(" fail");
                       break;
                     
                 }
             
             }
             
             
//              FileWriter students=new FileWriter("C:\\Users\\hp2\\Documents\\NetBeansProjects\\CredibleCollegiateManagementSystem\\src\\List\\Student List.txt",false);
//                 BufferedWriter studentsObject = new BufferedWriter(students);
//                    sendStudentDataThroughFilling=sObj.toString();
//                    studentsObject.write(sendStudentDataThroughFilling);
//                    studentsObject.close();
//                
      
              FileWriter teachers=new FileWriter("C:\\Users\\hp2\\Documents\\NetBeansProjects\\CredibleCollegiateManagementSystem\\src\\List\\Teacher List.txt",false);
                BufferedWriter teacherObject = new BufferedWriter(teachers); 
                    sendTeachersDataThroughFilling=tObj.toString();
                    teacherObject.write(sendTeachersDataThroughFilling);
                    teacherObject.close();
                
      
              FileWriter parents=new FileWriter("C:\\Users\\hp2\\Documents\\NetBeansProjects\\CredibleCollegiateManagementSystem\\src\\List\\Parent List.txt",false);
                BufferedWriter parentsObject = new BufferedWriter(parents);
                    sendParentsDataThroughFilling=pObj.toString();
                    parentsObject.write(sendParentsDataThroughFilling);
                    parentsObject.close();
                         
         }
          System.out.println("if you want to continue press 1 else any key"); 
          
   userEndingSelection =in.nextInt();
         }while(userEndingSelection==1);}
         catch(Exception e)
         {}
//         
    }
    
}
