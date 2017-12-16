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
public class Teacher extends User{
    
   // int personalContactNo;
  //  String id;
    

    public Teacher() 
    {
    }

    public Teacher(final String name, final String fatherName, String adress, String contactNo, final   String id, String password) {
        this.name=name;
        this.fatherName=fatherName;
        this.adress=adress;
        this.setId(id);
        this.setContactNo(contactNo);
        this.setPassword(password);
    }

//    public int getPersonalContactNo() {
//        return personalContactNo;
//    }
//
//    public void setPersonalContactNo(int personalContactNo) {
//        this.personalContactNo = personalContactNo;
//    }

//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public String getFatherName() {
//        return fatherName;
//    }
//
//    public void setFatherName(String fatherName) {
//        this.fatherName = fatherName;
//    }
//
//    public String getAdress() {
//        return adress;
//    }
//
//    public void setAdress(String adress) {
//        this.adress = adress;
//    }

//    public int getContactNo() {
//        return contactNo;
//    }
//
//    public void setContactNo(int contactNo) {
//        this.contactNo = contactNo;
//    }
//
//    public String getId() {
//        return id;
//    }
//;
//    public void setId(String id) {
//        this.id = id;
//    }
//
//    public String getPassword() {
//        return password;
//    }
//
//    public void setPassword(String password) {
//        this.password = password;
//    }

    @Override
    public String toString() {
        return super.toString()+System.getProperty("line.separator");//+"Teacher{" + "personalContactNo=" + personalContactNo + ", id=" + id + '}';
    }

    
}
