
package junit;

/**
 *
 * @author adam
 */
public class JUnit {
private int ans;
    
    public JUnit(){
        ans = 0;
    }
    
    public int add(int a, int b){
        ans = a + b;
        return ans;
    }
    
    public int sub(int a, int b){
        ans = a - b;
        return ans;
    }
    
    public int add(int t){
        ans += t;
        return ans;
    }
    
    public int sub(int t){
        ans += t;
        return ans;
    }
    
    public int ans(){
        return ans;
    }
    
    public void clear(){
        ans = 0;
    }
}
