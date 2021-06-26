import java.util.Scanner;
class Calculator
{
public static void main(String args[])
{
	Scanner obj=new Scanner(System.in);
	int result;
	System.out.println("Enter First No :");
	int fn=obj.nextInt();
	System.out.println("Enter Second No :");
	int sn=obj.nextInt();
	System.out.println("Selct Symbol +,-,*,/ :");
	String symbol=obj.next();
	switch(symbol)
	{
		case "+" :
		result=fn+sn;
		System.out.println(+result);
		break;
		case "-" :
		result=fn-sn;
		System.out.println(+result);
		break;
		case "*" :
		result=fn*sn;
		System.out.println(+result);
		break;
		case "/" :
		result=fn/sn;
		System.out.println(+result);
		break;
		default :
		System.out.println("You Have Enter Invalid Symbol?");


	}
}	
}