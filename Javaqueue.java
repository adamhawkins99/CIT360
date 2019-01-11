import java.util.LinkedList;
import java.util.Queue;

public class JavaQueue {
    public static void main(String[] args) {
        // Create the queue and list
        Queue<String> waitingQueue = new LinkedList<>();

        // Adding items to the queue
        waitingQueue.add("CIT230");
        waitingQueue.add("CIT360");
        waitingQueue.add("CIT225");
        waitingQueue.add("CIT241");
        waitingQueue.add("CIT240");

        System.out.println("Classes I still need to take : " + waitingQueue);

        // Removing an element from the Queue using remove() 
        String name = waitingQueue.remove();
        System.out.println("Removed from WaitingQueue : " + name + " | New WaitingQueue : " + waitingQueue);

        // Removing an element from the Queue using poll()
        name = waitingQueue.poll();
        System.out.println("Removed from WaitingQueue : " + name + " | New WaitingQueue : " + waitingQueue);
    }
}
/**Result would be:
Classes I still need to take : [CIT230, CIT360, CIT225, CIT241, CIT240]
Removed from WaitingQueue : CIT230 | New WaitingQueue : [CIT360, CIT225, CIT241, CIT240]
Removed from WaitingQueue : CIT360 | New WaitingQueue : [CIT225, CIT241, CIT240] */