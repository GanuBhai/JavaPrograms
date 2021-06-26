import java.util.*;
  
  public class Noofdigits{
  
  public static void main(String[] args) {
    // write your code here
    Scanner obj=new Scanner(System.in);
    int no=obj.nextInt();
    int count=0;
    while(no != 0)
    {
        no=no/10;
        count=count+1;
    }
    System.out.println(count);
   }
  }