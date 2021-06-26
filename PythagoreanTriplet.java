import java.util.*;
  
  public class PythagoreanTriplet{
  
  public static void main(String[] args) {
    // write your code here 
    Scanner obj=new Scanner(System.in);
    int h=obj.nextInt();
    int b=obj.nextInt();
    int p=obj.nextInt();
    h=h*h;
    p=p*p;
    b=b*b;
    if (h>b && h>p)
    {
      if(h==(p+b))
      {
        System.out.println("true");
      }
      else
      {
        System.out.println("false");
      }
    }

    else if (b>h && b>p)
    {
      if(b==(p+h))
      {
        System.out.println("true");
      }
      else
      {
        System.out.println("false");
      }
    }

    else
    {
      if(p==(h+b))
      {
        System.out.println("true");
      }
      else
      {
        System.out.println("false");
      }
    }

   }
  }