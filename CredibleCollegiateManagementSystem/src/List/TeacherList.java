/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package List;

import crediblecollegiatemanagementsystem.*;
import java.io.BufferedReader;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author hp2
 */
public class TeacherList implements List{
  public User[] tList;
  StudentList s=new StudentList();

 public int count=0;
    public TeacherList()
    {
       this.tList = new Teacher[0];
      
    }
    
    public void add(String name,String fatherName,String adress,String contactNo, String id,String password)
    {
       if (count==tList.length)
           increaseSize();
       tList[this.count]=new Teacher(name,fatherName,adress,contactNo,id,password);
       count++;
    }
 
    public void increaseSize()
    {
      User[] temp = new Teacher[tList.length+1];
      for(int i=0;i<tList.length;i++)
      {
         temp[i]=tList[i];
      }
      this.tList=temp;
    } 
    public void delete(String name)
    {
      int i=find(name);
      if (i==-1)
      {
       JOptionPane.showMessageDialog(null,"not found");

      }
      else
      {
         Scanner sc= new Scanner(System.in);
          int z = Integer.parseInt(JOptionPane.showInputDialog("Press 1-to Confirm OR any key to Terminate Process"));

         if(z==1)
            for(int w=i;w<this.tList.length-1;w++)
            {
                tList[w]=tList[w+1];
            }
                                      JOptionPane.showMessageDialog(null,"Teacher Deleted");
            this.count--;
      }

    }
    public int find(String name)
    { 
        for(int i=0;i<tList.length;i++)
        {
            if(tList[i].getName().equalsIgnoreCase(name))
            {
              JOptionPane.showMessageDialog(null,"Your student is Here: "+tList[i].toString()+"\n");

//                System.out.println("Your teacher is Here: "+tList[i].toString()+"\n");
                return i;
            }}
             
//                System.out.println("NOT FOUND");
        
     return -1;
    }
    
    public void deleteTeacherFromFile(String TeacherName)
        {
        try{
                BufferedReader file = new BufferedReader(new FileReader("C:\\Users\\hp2\\Documents\\NetBeansProjects\\CredibleCollegiateManagementSystem\\src\\List\\Teacher List.txt"));
                String line;
                String input = "";
                int  CheckForTrueValue=0;
                while ((line = file.readLine()) != null) 
                {
                    //System.out.println(line);
                    if (line.contains(TeacherName))
                    {
                        line = "";
                        System.out.println("Line deleted.");
                         JOptionPane.showMessageDialog(null,"Teacher Deleted"+"\n");

                        CheckForTrueValue++;
                    }
                    input += line + '\n';
                }
                                if(CheckForTrueValue==0)
                                          JOptionPane.showMessageDialog(null,"Teacher  NotFound"+"\n");
                FileOutputStream File = new FileOutputStream("C:\\Users\\hp2\\Documents\\NetBeansProjects\\CredibleCollegiateManagementSystem\\src\\List\\Teacher List.txt");
                File.write(input.getBytes());
                file.close();
                File.close();
        }
        catch(IOException e)
        {}
            }
    
    public void findTeacher(String name)
    {
    
    try{
                BufferedReader file = new BufferedReader(new FileReader("C:\\Users\\hp2\\Documents\\NetBeansProjects\\CredibleCollegiateManagementSystem\\src\\List\\Teacher List.txt"));
                String line;
                int noResultFound=0;
                while ((line = file.readLine()) != null) 
                {
                    
                    if (line.contains(name))
                    {
                        
//                        System.out.println("this is your teacher \n\n "+line);
                       JOptionPane.showMessageDialog(null,"this is your teacher \n\n "+line);

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
        String TeachertList;
        TeachertList="Your TEACHER  LIST is here\n";
        TeachertList+="---------------------\n\n";
               for(int i=0;i<count;i++)
               {
                  TeachertList+=tList[i].toString()+"\n";
               }
    return TeachertList;
    }
    
    // filling
    
//    Teacher teacherFiling=new Teacher();
//   String a= teacherFiling.
    
//    public Object clone()throws CloneNotSupportedException{  
//return super.clone();  
//}  
}
