
package application_controller_pattern;
import java.util.ArrayList;
/**
 *
 * @author adam
 */
public interface Handler {
  public void handleIt(Integer position, ArrayList<String>... lists);
        
}
