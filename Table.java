import java.util.Scanner;
class Table 
{
	public static void main(String args[])
	{
		Scanner obj=new Scanner(System.in);
		System.out.println("Enter The no Of Which Table You Want To Calculat :");
		int tableno=obj.nextInt();
		for(int i=1;i<=10;i++)
		{
			int caltable=tableno*i;
			System.out.println(tableno+"*"+i+"="+caltable);
		}
	}
}