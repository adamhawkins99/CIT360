
package application_controller_pattern;

import java.util.ArrayList;
        
public class Application_Controller_Pattern {

 public static void main(String[] args) {
        
        Controller controller = new Controller();
    
        ArrayList<String> gunList = new ArrayList<>();
        ArrayList<String> myGunCollection = new ArrayList<>();
        String command;
        Integer gunListPosition, myGunCollectionPosition;
        
        gunList.add("001 Glock");
        gunList.add("002 SigSauer");
        gunList.add("003 Remington");
        gunList.add("004 Smith&Wesson");
        gunList.add("005 Kimber");
        gunList.add("006 AK47");
        gunList.add("007 AR15");
        gunList.add("008 Ruger");
        gunList.add("009 Benelli");
        
        // Add SigSauer to my collection
        System.out.println("Add SigSauer to our collection");
        command = "Add Guns";
        gunListPosition = 1;
        controller.handle(command, gunListPosition, gunList, myGunCollection);
        
        // Add AK47 to my collection
        System.out.println("Add AK47 to our collection");
        command = "Add Guns";
        gunListPosition = 5;
        controller.handle(command, gunListPosition, gunList, myGunCollection);
        
        // Add AR15 to my collection
        System.out.println("Add AR15 to our collection");
        command = "Add Guns";
        gunListPosition = 6;
        controller.handle(command, gunListPosition, gunList, myGunCollection);
        
        // Remove AR15 from my collection
        System.out.println("Remove AR15 from our selection");
        command = "Remove Guns";
        myGunCollectionPosition = 2;
        controller.handle(command, myGunCollectionPosition, myGunCollection);
        
        // Attempt to use a controller command that doesn't exist
        System.out.println("Attempt to use an invalid command");
        command = "Duplicate Guns";
        myGunCollectionPosition = 2;
        controller.handle(command, gunListPosition, myGunCollection);
        
    }
    
}