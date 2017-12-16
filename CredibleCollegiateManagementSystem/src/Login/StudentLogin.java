/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Login;

import List.StudentList;

/**
 *
 * @author hp2
 */
public class StudentLogin extends Login  {
    public  StudentList getSIdInfo=new StudentList();
  //  public StudentList getIdInfo=new StudentList();
//     public void getLoginDataOfTeachers()
//     {
//         
//     String[] saveIdInfo=new String[getIdInfo.count];
//     String[] savePassInfo=new String[getIdInfo.count];
//     
//     for(int i=0;i<getIdInfo.count;i++)
//     {
//     saveIdInfo[i]=getIdInfo.sList[i].getId();
//    savePassInfo[i]=getIdInfo.sList[i].getPassword();
//          }
//        }
     
     // login checker
     public boolean loginCecker(String id,String pass)
     {
        boolean savePss=false; 
        boolean saveId=false;
        for(int i=0;i<getSIdInfo.count;i++) {  
        saveId=id.equalsIgnoreCase(getSIdInfo.sList[i].getId());
        if(saveId==true){
          saveId=true;
        break;}
        else 
          continue;
      }
      for(int i=0;i<getSIdInfo.count;i++) {  
      savePss=pass.equalsIgnoreCase(getSIdInfo.sList[i].getPassword());
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
