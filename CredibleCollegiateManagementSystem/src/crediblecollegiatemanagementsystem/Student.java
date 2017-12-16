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
public class Student extends User {
    String studyClass;
    String course;
    String result;
     String feeStatus;
    // String password;
     
     String[] Attendence=new String[30];
   //  String Id;
     int classRollNo;
    public Student() {
    }
    
    
   int i=0;

    public Student(final String name,final String fatherName,String  adress,String contactNo,
                  final  String Id,String password, String studyClass,String course,String feeStatus ,int classRollNo  ) 
    {
    
        this.name=name;
        this.fatherName=fatherName;
        this.adress=adress;
        this.studyClass= studyClass;
        this.feeStatus=feeStatus;
        this.course=course;
        this.classRollNo=classRollNo;
         this.setId(Id);
        this.setContactNo(contactNo);
        this.setPassword(password);        
        
//        {this.Attendence[i]=Attendence;
//        i++;}
//        this.Attendence[0]="A";
        
    }

    public String getStudyClass() {
        return studyClass;
    }

    public void setStudyClass(String studyClass) {
        this.studyClass = studyClass;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }

    public String getFeeStatus() {
        return feeStatus;
    }

    public void setFee(String feeStatus) {
        this.feeStatus = feeStatus;
    }

    public int getClassRollNo() {
        return classRollNo;
    }

    public void setClassRollNo(int classRollNo) {
        this.classRollNo = classRollNo;
    }

    public String[] getAttendence() {
        return Attendence;
    }

    @Override
    public String toString() {
        return super.toString()+  "studyClass= " + studyClass + ", course= " + course  + ", fee= " + feeStatus +System.getProperty("line.separator");
    }


    

    
      
    
}
