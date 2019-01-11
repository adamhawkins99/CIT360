import java.util.*;
public class JavaLists {

   public static void main(String[] args) {
      List a1 = new ArrayList();
      a1.add("Java Collections");
      a1.add("Threads, Executors, and Runnables");
      a1.add("Application Controller Pattern"); 
      a1.add("MVC"); 
      a1.add("Hibernate"); 
      a1.add("QCJSON and JSON"); 
      a1.add("Android HttpUrlConnection"); 
      a1.add("Servlets"); 
      a1.add("JUnit Tests"); 
      a1.add("System Level Tests"); 
      a1.add("Use Case Diagrams"); 
      a1.add("Use Case Documents"); 
      a1.add("State Diagrams"); 
      a1.add("Sequence Diagrams"); 
      System.out.println(" ArrayList Coding Topics");
      System.out.print("\t" + a1);

      List l1 = new LinkedList();
      l1.add("Java Collections");
      l1.add("Threads, Executors, and Runnables");
      l1.add("Application Controller Pattern"); 
      l1.add("MVC"); 
      l1.add("Hibernate"); 
      l1.add("QCJSON and JSON"); 
      l1.add("Android HttpUrlConnection"); 
      l1.add("Servlets"); 
      l1.add("JUnit Tests"); 
      l1.add("System Level Tests"); 
      l1.add("Use Case Diagrams"); 
      l1.add("Use Case Documents"); 
      l1.add("State Diagrams"); 
      l1.add("Sequence Diagrams"); 
      System.out.println();
      System.out.println(" LinkedList Coding Topics");
      System.out.print("\t" + l1);
   }
}
/**System out print would be:
 ArrayList Coding Topics
	[Java Collections, Threads, Executors, and Runnables, Application Controller Pattern, MVC, Hibernate, QCJSON and JSON, Android HttpUrlConnection, Servlets, JUnit Tests, System Level Tests, Use Case Diagrams, Use Case Documents, State Diagrams, Sequence Diagrams]
 LinkedList Coding Topics
	[Java Collections, Threads, Executors, and Runnables, Application Controller Pattern, MVC, Hibernate, QCJSON and JSON, Android HttpUrlConnection, Servlets, JUnit Tests, System Level Tests, Use Case Diagrams, Use Case Documents, State Diagrams, Sequence Diagrams]