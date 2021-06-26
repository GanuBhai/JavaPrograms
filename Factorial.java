import java.util.Scanner;
class Factorial
{
	public static void main(String args[])
	{
		Scanner obj=new Scanner(System.in);
		System.out.println("Enter the no of which you want to calculate Factorial");
		int factno=obj.nextInt();
		int fact=1;
		for(int i=1;i<=factno;i++)
		{
			fact=fact*i;
		}
		System.out.println("Factorial of"+ factno +"is ="+fact);
			}
		}