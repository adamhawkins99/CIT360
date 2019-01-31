/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mvc;

/**
 *
 * @author adam
 */
public class Model_MVC {
   public class Student {
   private String studID;
   private String name;
   
   public String getstudID() {
      return studID;
   }
   
   public void setstudID(String studID) {
      this.studID = studID;
   }
   
   public String getName() {
      return name;
   }
   
   public void setName(String name) {
      this.name = name;
   }
}
}  

