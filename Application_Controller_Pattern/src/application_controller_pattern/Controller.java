
package application_controller_pattern;

import java.util.ArrayList;
import java.util.HashMap;

/**
 *
 * @author adam
 */
public class Controller {
 private final HashMap<String, Handler> controlHash = new HashMap<>();
    
    public Controller() {
        
        AddHandler addHandler = new AddHandler();
        controlHash.put("Add Guns", addHandler);
        
        RemoveHandler removeHandler = new RemoveHandler();
        controlHash.put("Remove Guns", removeHandler);
        
    }
    
    public void handle(String command, Integer position, ArrayList<String>... lists) {
        
        Handler task = controlHash.get(command);
        
        task.handleIt(position, lists);
        
    }   
}
