import java.util.Scanner;
class Reversstring
{
	public static void main(String args[])
	{
		Scanner obj=new Scanner(System.in);
		System.out.println("Enter the name you want to revers:");
		String name=obj.nextLine();
		int lent=name.length();
		String revers="";
		for(int i=lent-1;i>=0;i--)
		{
			revers=revers+name.charAt(i);
          
		}
		System.out.println("**************************");
		System.out.println("Revers of the Name you enterd is->"+revers);
	}
}