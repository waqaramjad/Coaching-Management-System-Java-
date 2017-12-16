/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Login;

import List.*;

/**
 *
 * @author hp2
 */
public class ParentLogin extends Login {
    
    
//     public  ParentList getPIdInfo=new ParentList();
//     public void getLoginDataOfTeachers()
//     {
//         
//     String[] saveIdInfo=new String[getIdInfo.count];
//     String[] savePassInfo=new String[getIdInfo.count];
//     
//     for(int i=0;i<3;i++)
//     {
//     saveIdInfo[i]=getIdInfo.pList[i].getId();
//    savePassInfo[i]=getIdInfo.pList[i].getPassword();
//    
//         System.out.println("id parents"+saveIdInfo[i]);
//         System.out.println("pass parents"+savePassInfo[i]);
//          }
//        }
     
     // login checker
     public boolean loginCecker(String id,String pass,ParentList getPIdInfo)
     {
//         sout   
//        boolean savePss=false; 
//        boolean saveId=false;
        for(int i=0;i<getPIdInfo.count;i++) {  
        saveId=id.equalsIgnoreCase(getPIdInfo.pList[i].getId());
        if(saveId==true){
          saveId=true;
        break;}
        else
         saveId=false;
      }
//         System.out.println("\n\n pass parents c ha s ahds ////////// \n "+saveId);
        
      for(int i=0;i<getPIdInfo.count;i++) {  
      savePss=pass.equalsIgnoreCase(getPIdInfo.pList[i].getPassword());
      if(savePss==true){
          savePss=true;
      break;}
       else
         savePss=false;
     
      }
//         System.out.println("\n\n pass parents c ha s ahds ////////// \n "+savePss);
      
    boolean  returnInfo;
if((savePss==true)&&(saveId==true))
       returnInfo=true;
      else
        returnInfo=false;
      return  returnInfo;     
      


//
     }
}
