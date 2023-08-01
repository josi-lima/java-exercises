import java.util.Scanner;

public class PrintElements {
    public static void main(String args[]) {    
      // Create a new scanner object
      Scanner scan = new Scanner(System.in); 

      // Scan the integer which is in the first line of the input
      int i = scan.nextInt(); 

      // Scan the double which is on the second line
      double d = scan.nextDouble(); 

      /* 
      * At this point, the scanner is still on the second line at the end
      * of the double, so we need to move the scanner to the next line
      * scans to the end of the previous line which contains the double. 
      */
      scan.nextLine();    

      // reads the complete next line which contains the string sentence            
      String s = scan.nextLine();  
      
      scan.close();

      System.out.println("String: " + s);
      System.out.println("Double: " + d);
      System.out.println("Int: " + i);
  }
}
