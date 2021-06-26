import java.util.*;

public class Star4
{

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        
        int no=scn.nextInt();
        for(int i=1;i<=no;i++)
        {
            for(int j=no;j>i;j--)
            {
                System.out.print("\t*");
            }
            for(int k=1;k<=i;k++)
            {
                System.out.print("\t");

            }
            System.out.println("");

        }

    }
}