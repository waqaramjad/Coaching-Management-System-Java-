/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package crediblecollegiatemanagementsystem;

import List.ParentList;

/**
 *
 * @author hp2
 */
public class clone implements Cloneable {
    
     @Override
    public  Object clone() throws CloneNotSupportedException{

  //Deep copy
      ParentList getPIdInfo=new ParentList();

//  Person p = new Person(name, car.getName());
//
  return getPIdInfo;
    }
}
