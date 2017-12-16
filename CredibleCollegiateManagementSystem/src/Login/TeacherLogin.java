/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Login;
//import crediblecollegiatemanagementsystem.Teacher;
import List.*;

/**
 *
 * @author hp2
 */
public class TeacherLogin extends Login {
 

    public  TeacherList getTIdInfo=new TeacherList();
//     public void getLoginDataOfTeachers()
//     {
//     String[] saveIdInfo=new String[getIdInfo.count];
//     String[] savePassInfo=new String[getIdInfo.count];
//     
//     for(int i=0;i<getIdInfo.count;i++)
//     {
//     saveIdInfo[i]=getIdInfo2.tList[i].getId();
//    savePassInfo[i]=getIdInfo.tList[i].getPassword();
//          }
//        }
     
     // login checker
     public boolean loginCecker(String id,String pass)
     {
        boolean savePss=false; 
        boolean saveId=false;
        for(int i=0;i<getTIdInfo.count;i++) {  
        saveId=pass.equalsIgnoreCase(getTIdInfo.tList[i].getId());
        if(saveId==true){
          saveId=true;
        break;}
        
      }
      for(int i=0;i<getTIdInfo.count;i++) {  
      savePss=id.equalsIgnoreCase(getTIdInfo.tList[i].getPassword());
      if(savePss==true){
          savePss=true;
      break;}
     
      }
      
    boolean  returnInfo;
if((savePss==true)&&(saveId==true))
       returnInfo=true;
      else
        returnInfo=false;
      return  returnInfo;     
      


//
     }
        

    
}
