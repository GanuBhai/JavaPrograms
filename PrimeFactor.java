import java.util.*;

public class PrimeFactor{

public static void main(String[] args) {
  // write your code here 
  Scanner obj=new Scanner(System.in);
  int no=obj.nextInt();
  for(int i=2;no>1;i++)
  {  
      while(no%i==0)
        {
            no=no/i;
            System.out.println(i);
            System.out.println(no);
        }  
  }
 }
}