import java.util.*;
  
  public class Prime{
  
  public static void main(String[] args) {
      Scanner scn = new Scanner(System.in);
  
       // write ur code here
       
       System.out.println("how many no you want to be testd :");
       int t=scn.nextInt();
       
       for(int i=1;i<=t;i++)
       {
           System.out.println("enter no :");
           int n=scn.nextInt();
           int temp=0;

           
                for(int j=2;j<n;j++)
                {
               if(n%j==0)
               {
                   temp=temp+1;
               }
               
                }
               if(temp>0)
                { 
                    System.out.println("not prime");
                }
                else
                {
                    System.out.println("prime");
                }
       
       }
  
   }
  }