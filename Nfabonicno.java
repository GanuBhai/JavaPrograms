import java.util.*;
  
  public class Nfabonicno{
  
  public static void main(String[] args) {
      // write your code here
      Scanner obj=new Scanner(System.in);
      int no=obj.nextInt();
      int result,first=0,second=1;
       System.out.println(first);
        System.out.println(second);
      for(int i=2;i<no;i++)
      { 
        result=first+second;
        System.out.println(result);
        first=second;
        second=result;
          
      }
   }
  }