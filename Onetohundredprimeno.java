import java.util.Scanner;
class Onetohundredprimeno
{
	public static void main(String args[])
	
	{
		
	    Scanner obj=new Scanner(System.in);
	    System.out.println("*********************************************************************************");
	    System.out.println("Enter The no of which all the previous prime no you want to calculate :");
	    int no=obj.nextInt();
		for(int i=1;i<=no;i++)
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
				System.out.println("The Number"+""+i+""+"is a Prime Number");
			}
			
		}
	}
	
}