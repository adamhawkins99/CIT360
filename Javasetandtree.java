import java.util.*;
public class JavaSet {

  public static void main(String args[]) { 
      int count[] = {10, 1,2,14,3,5,4,8,6,11,7,12,13,9};
      Set<Integer> set = new HashSet<Integer>();
      try {
         for(int i = 0; i < 14; i++) {
            set.add(count[i]);
         }
         System.out.println(set);

         TreeSet sortedSet = new TreeSet<Integer>(set);
         System.out.println("The sorted list is:");
         System.out.println(sortedSet);

         System.out.println("The First element of the set is: "+ (Integer)sortedSet.first());
         System.out.println("The last element of the set is: "+ (Integer)sortedSet.last());
      }
      catch(Exception e) {}
   }
}
/**System out print would be:
[1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14]
The sorted list is:
[1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14]
The First element of the set is: 1
The last element of the set is: 14