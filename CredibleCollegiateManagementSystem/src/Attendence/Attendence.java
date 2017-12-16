/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Attendence;
import crediblecollegiatemanagementsystem.*;
import List.*;
import Login.*;
import java.util.Scanner;
/**
 *
 * @author hp2
 */
public class Attendence {
    
public   StudentList studentAttendence =new StudentList();
  Scanner input=new Scanner(System.in);
    public void takeAttendence()
    {
        LoginForm getSyudentNameAndId=new LoginForm();
        getSyudentNameAndId.objectAddition();
       studentAttendence= getSyudentNameAndId.sObj;
   String[]  getStudentName=new String[studentAttendence.count];
   String[]  getStudentID=new String[studentAttendence.count];
   String[] takeAttendence=new  String[studentAttendence.count];
//        System.out.println("no of present students sl dsl sod s dcs dcois dcoisb dc sd jds "+studentAttendence.count);
//        System.out.println("no of present students sl dsl sod s dcs dcois dcoisb dc sd jds "+getStudentName.length);
          
                
                for(int i=0;i<studentAttendence.count;i++)
        {   getStudentName[i]=studentAttendence.sList[i].getName();
            getStudentID[i]=studentAttendence.sList[i].getId();
        }
//        System.out.println("no of present students sl dsl sod s dcs dcois dcoisb dc sd jds "+studentAttendence.count);
//        System.out.println("no of present students sl dsl sod s dcs dcois dcoisb dc sd jds "+studentAttendence.count);
        
        System.out.println("Student name    "+"      id "+"       ATTENDENCE STATUS");
        for(int i=0;i<studentAttendence.count;i++)
        { System.out.print(getStudentName[i]+"                     "+ getStudentID[i]+"             ");      
          takeAttendence[i]=input.next();
        }
            int P=0,L=0,A=0;
        for(int i=0;i<studentAttendence.count;i++)
        {if("p".equalsIgnoreCase(takeAttendence[i]))
            P++;
        else if("a".equalsIgnoreCase(takeAttendence[i]))
            A++;
        else if("l".equalsIgnoreCase(takeAttendence[i]))
            L++;}
        System.out.println("TODAY ATTENDENCE REPORT IS ");
            System.out.println("no of present students  "+P+"no of ABSENT students "+A+"no of LEAVE TAKING students  "+L);
        
            }
        
    }

    

//}
