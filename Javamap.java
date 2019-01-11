import java.util.*;
public class JavaMap {

   public static void main(String[] args) {
      Map m1 = new HashMap(); 
      m1.put("Java Collections", "1");
      m1.put("Threads, Executors, and Runnables", "2");
      m1.put("Application Controller Pattern", "3");
      m1.put("MVC", "3");
      m1.put("Hibernate", "4");
      m1.put("QCJSON and JSON", "4");
      m1.put("Android HttpUrlConnection", "5");
      m1.put("Servlets", "6");
      m1.put("JUnit Tests", "7");
      m1.put("System Level Tests", "8");
      m1.put("Use Case Diagrams", "9");
      m1.put("Use Case Documents", "9");
      m1.put("State Diagrams", "10");
      m1.put("Sequence Diagrams", "10");

      System.out.println();
      System.out.println(" Coding Topics Assigned to Week ");
      System.out.print("\t" + m1);
   }
}
/**Result would be
Coding Topics Assigned to Week 
	{System Level Tests=8, Hibernate=4, Sequence Diagrams=10, Threads, Executors, and Runnables=2, QCJSON and JSON=4, State Diagrams=10, Use Case Diagrams=9, Use Case Documents=9, Android HttpUrlConnection=5, JUnit Tests=7, Application Controller Pattern=3, Java Collections=1, MVC=3, Servlets=6}
 */