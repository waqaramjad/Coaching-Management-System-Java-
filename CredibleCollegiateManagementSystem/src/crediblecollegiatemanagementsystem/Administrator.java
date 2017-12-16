/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package crediblecollegiatemanagementsystem;

/**
 *
 * @author hp2
 */
public class Administrator extends  User {
    
    
    
      public  Administrator(final String name,final String fatherName,String adress,String contactNo,
                final  String id,String password) 
   
    {
    
        this.name=name;
        this.fatherName=fatherName;
        this.adress=adress;
        this.setId(id);
        this.setContactNo(contactNo);
        this.setPassword(password);
    }

    @Override
    public String toString() {
        return "Administrator{" +super.toString()+ '}';
    }

}
