/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package List;

/**
 *
 * @author hp2
 */
import crediblecollegiatemanagementsystem.*;
import java.io.BufferedReader;
import java.io.*;
import java.io.FileReader;
import java.util.Scanner;
import javax.swing.JOptionPane;
public class StudentList implements List {
    
    
public Student[] sList;  
 public int count=0;
 // constructor
    public StudentList()
    {
       this.sList = new Student[0];
       
       
       
    }
    
 
    // add function
    public void add(String name,String fatherName,String adress,String contactNo,
                    String id,String password, String studyClass,String course,String feeStatus ,int classRollNo )
    {
       if (count==sList.length)
           increaseSize();
       sList[this.count]=new Student(name,fatherName,adress,contactNo,
                    id,password,  studyClass,course,feeStatus ,classRollNo);
       count++;
    }
    
//    public void setsList(Student[] sList) {
//        this.sList = sList;
//    }
    


    public void increaseSize()
    {
      Student[] temp = new Student[sList.length+1];
      for(int i=0;i<sList.length;i++)
      {
         temp[i]=sList[i];
      }
      this.sList=temp;
    } 

    public void delete(String name)
    {
      int i=find(name);
      if (i==-1)
      {
                                JOptionPane.showMessageDialog(null,"not found");

//        System.out.println("not found");
      }
      else
          {
         Scanner sc= new Scanner(System.in);
        
          int z = Integer.parseInt(JOptionPane.showInputDialog("Press 1-to Confirm OR any key to Terminate Process"));
         if(z==1)
            for(int w=i;w<this.sList.length-1;w++)
            {
                sList[w]=sList[w+1];
            }
            this.count--;
                                            JOptionPane.showMessageDialog(null,"Student Deleted");
      }

    }

    public int find(String name)
    { 
        for(int i=0;i<sList.length;i++)
        {
            if(sList[i].getName().equalsIgnoreCase(name))
            {
                      JOptionPane.showMessageDialog(null,"Your student is Here: "+sList[i].toString()+"\n");
  
//                System.out.println("Your student is Here: "+sList[i].toString()+"\n");
                return i;
               
            }}
             
                                    
 
//                System.out.println("NOT FOUND");
        
     return -1;
    }
    
    // delete data from files
    
    public void deleteSrudentsFromFile(String StudentName)
        {
        try{
                BufferedReader file = new BufferedReader(new FileReader("C:\\Users\\hp2\\Documents\\NetBeansProjects\\CredibleCollegiateManagementSystem\\src\\List\\Student List.txt"));
                String line;
                String input = "";
               int  CheckForTrueValue=0;
                while ((line = file.readLine()) != null) 
                {
                    //System.out.println(line);
                    if (line.contains(StudentName))
                    {
                        line = "";
//                        System.out.println("Line deleted.");
                      JOptionPane.showMessageDialog(null," Student deleted"+"\n");
                      CheckForTrueValue++;
                    }
                    input += line + '\n';
                }
                if(CheckForTrueValue==0)
                                          JOptionPane.showMessageDialog(null," Student NotFound"+"\n");

                    
                FileOutputStream File = new FileOutputStream("C:\\Users\\hp2\\Documents\\NetBeansProjects\\CredibleCollegiateManagementSystem\\src\\List\\Student List.txt");
                File.write(input.getBytes());
                file.close();
                File.close();
        }
        catch(IOException e)
        {}
            }
    
     public void findStudent(String name)
    {
    
    try{
                BufferedReader file = new BufferedReader(new FileReader("C:\\Users\\hp2\\Documents\\NetBeansProjects\\CredibleCollegiateManagementSystem\\src\\List\\Student List.txt"));
                String line;
                int noResultFound=0;
                while ((line = file.readLine()) != null) 
                {
                    
                    if (line.contains(name))
                    {
                       
//                        System.out.println("this is your Student \n\n "+line);
                     JOptionPane.showMessageDialog(null,"this is your Student \n\n "+line);

                       noResultFound++; 
                    }
                }
                if(noResultFound==0)
              JOptionPane.showMessageDialog(null,"Sorry no Result Found");

//                System.out.println("Sorry no Result Found");
                file.close();
        }
        catch(IOException e)
        {}
        }

@Override
    public String toString() 
    {
        
        String stdentList;
        stdentList="Your student  LIST is here\n";
        stdentList+="---------------------\n\n"+System.getProperty("line.separator");
               for(int i=0;i<count;i++)
               {
                  stdentList+=sList[i].toString()+"\n";
               }
    return stdentList;
    }
}
