//One way to create a thread in java is to implement the Runnable Interface
package week3;

/**
 *
 * @author adam
 */
public class Runnables {
 public void run() {
        System.out.println("Inside : " + Thread.currentThread().getName());
    }

    public static void main(String[] args) {
        System.out.println("Inside : " + Thread.currentThread().getName());
        System.out.println("Creating thread...");
        Thread thread = new Thread();
        System.out.println("Starting thread...");
        thread.start();
    }
    
}
//Output Would Be:
//Inside : main
//Creating thread...
//Starting thread...
//BUILD SUCCESSFUL (total time: 0 seconds)