//Threads Example. 
// A thread in Java is an independent path of execution, some can run concurrently.

package week3;

/**
 *
 * @author adam
 */
public class Threads {

   public static void main(String[] args) {

    //Here is where we start the runnable task
    Runnable task = () -> {
        String threadName = Thread.currentThread().getName();
        System.out.println("Hi " + threadName);
    };
    
    task.run();
    
    Thread thread;
        thread = new Thread(task);
    thread.start();
    
    System.out.println("Watch me Finish!");
}
}

