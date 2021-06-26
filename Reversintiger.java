import java.util.Scanner;
class Reversintiger
{
	public static void main(String args[])
	{
		Scanner obj=new Scanner(System.in);
		System.out.println("Enbter the no you want to revers :");
		int no=obj.nextInt();
		int reminder,revers=0;
		while(no!=0)
		{
			reminder=no%10;
			revers=revers*10+reminder;
			no=no/10;
		}
	    System.out.println("******************************");
	   	System.out.println("Rvers of the no is :"+revers);

	}
}