/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Login;

/**
 *
 * @author hp2
 */
public class AdministratorLogin extends Login {
    
      public boolean AdministratorLoginCheck(String Id,String pass)
    {
      String AdID="a";
      String  Psswor="a";
      
      boolean idInfo,passInfo,returnInfo;
      
      passInfo=(Psswor.equalsIgnoreCase(pass));
      idInfo=(AdID.equalsIgnoreCase(Id));
        //System.out.println("pass info"+idInfo);
//        idInfo= id.
      
//      if(AdID==Id)
//                {idInfo=true;}
//      else
//       idInfo=false;
//        System.out.println(" info"+passInfo);
      
      if((passInfo==true)&&(idInfo==true))
       returnInfo=true;
      else
        returnInfo=false;
      //  System.out.println("return  info"+returnInfo);
      
      return  returnInfo;
    }
}


