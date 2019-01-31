/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mvc;

import mvc.Model_MVC.Student;
import mvc.View_MVC.StudentView;

/**
 *
 * @author adam
 */
public class Controller_MVC {
  public class StudentController {
  private final Student model; 
  private final StudentView view;

   public StudentController(Student model, StudentView view){
      this.model = model;
      this.view = view;
   }

   public void setStudentName(String name){
      model.setName(name);		
   }

   public String getStudnetName(){
      return model.getName();		
   }

   public void setstudID(String studID){
      model.setstudID(studID);		
   }

   public String getstudID(){
      return model.getstudID();		
   }

   public void updateView(){				
      view.printStudnetDetails(model.getName(), model.getstudID());
   }	
}  
}  

