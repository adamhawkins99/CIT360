/* 
 * The Java ExecutorService is a construct that allows you to pass a task to be executed by a thread asynchronously. 
 * The executor service creates and maintains a reusable pool of threads for executing submitted tasks.
 */
package week3;
import java.util.concurrent.*;
/**
 *
 * @author adam
 */
public class ExecutorExample {
public static void main(String[] args) {
        //created executor service
        ExecutorService executor = Executors.newFixedThreadPool(5);

        // Runnable, return void, nothing, submit and run the task async
        executor.submit(() -> System.out.println("Watch me run now!"));

        // Callable, return a future, submit and run the task async
        Future<Integer> futureTask1 = executor.submit(() -> {
            System.out.println("Here I call the task.");
            return 1 + 1;
        });
       
        //I use the Try and catch block here in order to handle any exceptions that may occur.
        try {

            otherTask("Before");

            // block until future returned a result, 
            // timeout if the future takes more than 5 seconds to return the result
            Integer result = futureTask1.get(5, TimeUnit.SECONDS);

            System.out.println("Get another one : " + result);

            otherTask("After Future Result");


        } catch (InterruptedException e) {// thread was interrupted
            e.printStackTrace();
        } catch (ExecutionException e) {// thread threw an exception
            e.printStackTrace();
        } catch (TimeoutException e) {// timeout before the future task is complete
            e.printStackTrace();
        } finally {

            // Must shut it down so it stops, otherwise crash.
            executor.shutdown();

        }

    }

    private static void otherTask(String name) {
        System.out.println("I'm other task! " + name);
    }
}    

