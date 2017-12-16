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
public class User {
  public  String name;
 public   String fatherName;
 protected  String adress;
 private  String contactNo;
   private  String id;
private    String password;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFatherName() {
        return fatherName;
    }

    public void setFatherName(String fatherName) {
        this.fatherName = fatherName;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public String getContactNo() {
        return contactNo;
    }

    public void setContactNo(String contactNo) {
        this.contactNo = contactNo;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

   



    @Override
    public String toString() {
        return  "name= " + name + ", fatherName= " + fatherName + ", adress= " + adress + ", contactNo= " + contactNo + ", id= " + id + ", password= " + password ;
    }
    
} 
    
    
    
    

    
