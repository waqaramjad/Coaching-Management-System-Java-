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
public class ParentList implements List,Cloneable{
 
  public User[] pList; 
   public int count;
    public ParentList()
    {
      this.pList = new Parent[0];
       this.count=0;
    }
    public void add(String name,String fatherName,String adress,String contactNo,String id,String password)
    {
       if (count==pList.length)
           increaseSize();
       pList[this.count]=new    Parent(name,fatherName, adress,contactNo, id,password);
       count++;
    }
 
    public void increaseSize()
    {
        User[] temp = new  Parent[pList.length+1];
      for(int i=0;i<pList.length;i++)
      {
         temp[i]=pList[i];
      }
      this.pList=temp;
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
            for(int w=i;w<this.pList.length-1;w++)
            {
                pList[w]=pList[w+1];
            }
             JOptionPane.showMessageDialog(null,"Parent Deleted");
   
         this.count--;
            
      }
    }
  @Override
    public int find(String name)
    { 
        for(int i=0;i<pList.length;i++)
        {
            if(pList[i].getName().equalsIgnoreCase(name))
            {
                   JOptionPane.showMessageDialog(null,"Your student is Here: "+pList[i].toString()+"\n");

                return i;
            }
          
        }
     return -1;
    }
    
     public void deleteParentFromFile(String ParentName)
        {
        try{
                BufferedReader file = new BufferedReader(new FileReader("C:\\Users\\hp2\\Documents\\NetBeansProjects\\CredibleCollegiateManagementSystem\\src\\List\\Parent List.txt"));
                String line;
                String input = "";
                int  CheckForTrueValue=0;
                while ((line = file.readLine()) != null) 
                {
                    //System.out.println(line);
                    if (line.contains(ParentName))
                    {
                        line = "";
//                        System.out.println("Line deleted.");
                                                    JOptionPane.showMessageDialog(null,"Parent Deleted");
                     CheckForTrueValue++;
                    }
                    input += line + '\n';
                    
                }
                 if(CheckForTrueValue==0)
                                          JOptionPane.showMessageDialog(null,"Parent NotFound"+"\n");
                FileOutputStream File = new FileOutputStream("C:\\Users\\hp2\\Documents\\NetBeansProjects\\CredibleCollegiateManagementSystem\\src\\List\\Parent List.txt");
                File.write(input.getBytes());
                file.close();
                File.close();
        }
        catch(IOException e)
        {}
            }
     
      public void findParent(String name)
    {
    
    try{
                BufferedReader file = new BufferedReader(new FileReader("C:\\Users\\hp2\\Documents\\NetBeansProjects\\CredibleCollegiateManagementSystem\\src\\List\\Parent List.txt"));
                String line;
                int noResultFound=0;
                while ((line = file.readLine()) != null) 
                {
                    
                    if (line.contains(name))
                    {
                        
//                        System.out.println("this is your Parent \n\n "+line);
                 JOptionPane.showMessageDialog(null,"this is your Parent \n\n "+line);

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
        String ParentList;
        ParentList="Your parent  LIST is here\n";
        ParentList+="---------------------\n\n";
               for(int i=0;i<count;i++)
               {
                  ParentList+=pList[i].toString()+"\n";
               }
    return ParentList;
    }
    
    
    
     
    public Object clone()throws CloneNotSupportedException{  
return super.clone();  
}  
    }
    
   

