
package application_controller_pattern;
import java.util.ArrayList;
/**
 *
 * @author adam
 */
public class AddHandler implements Handler {
   
    
    @Override
    public void handleIt(Integer position, ArrayList<String>... lists) {
        
        Integer gunListPosition = position;
        ArrayList<String> gunList = lists[0];
        ArrayList<String> myGunCollection = lists[1];
        
        myGunCollection.add(gunList.get(gunListPosition));
        
        System.out.println(gunList.get(gunListPosition) + " has been added to your collection");
        
        System.out.println(myGunCollection + "\n");
        
    }
    
    
}
