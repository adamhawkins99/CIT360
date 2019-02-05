
package application_controller_pattern;
import java.util.ArrayList;
/**
 *
 * @author adam
 */
public class RemoveHandler implements Handler {
    
    @Override
    public void handleIt(Integer position, ArrayList<String>... lists) {
        
        Integer myGunCollectionPosition = position;
        ArrayList<String> myGunCollection = lists[0];
        
        System.out.println(myGunCollection.get(myGunCollectionPosition) + " has been removed");
        myGunCollection.remove(myGunCollection.get(myGunCollectionPosition));
        
        System.out.println(myGunCollection + "\n");
        
    }
    
}