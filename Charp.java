// Java program to read character using Scanner
// class
import java.util.Scanner;
public class Charp
{
  public static void main(String[] args)
  {
    // Declare the object and initialize with
    // predefined standard input object
    Scanner sc = new Scanner(System.in);

    // Character input
    String c = sc.next();

    // Print the read value
    int len=c.length();
    for(int i=0;i<len;i++)
    {
      System.out.println(c.charAt(i));

    }
  }
}
