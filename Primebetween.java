import java.util.*;

public class Primebetween{
    public static void main(String[] args) {
        // write your code here
        Scanner obj=new Scanner(System.in);
        int low=obj.nextInt();
        int high=obj.nextInt();
        for(int i=low;i<=high;i++)
        
        {   
            int temp=0;
            for(int j=2;j<i;j++)
            {
                if(i%j==0)
                {
                    temp=temp+1;
                }
                
            }
            if(temp==0)
            {
                System.out.println(i);
            }
            
        }
    }
}