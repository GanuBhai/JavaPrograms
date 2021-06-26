import java.util.Scanner;
class Graterno
{
	public static void main(String args[])
	{
		Scanner obj=new Scanner(System.in);
		System.out.println("Enter First No :");
		int fn=obj.nextInt();
		System.out.println("Enter SEcond No :");
		int sn=obj.nextInt();
		System.out.println("**************************************");
		if(fn>sn)
			{
			System.out.println("First No is Grater"); 
			}

			else
			{
				System.out.println("Second No is Grater");
			}
	}
}