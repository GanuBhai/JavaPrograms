import java.util.*;
import java.time.LocalDate;

public class Star2 {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        LocalDate obj=LocalDate.now();
        System.out.println(obj);

        // write ur code here
        int no=scn.nextInt();
        for(int i=no;i>=1;i--)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print("*\t");
            }
            System.out.println("");
        }

    }
}