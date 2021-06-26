import java.util.Scanner;
class PepcodingFact
{
	public static void main(String[] args)
	{
		Scanner obj=new Scanner(System.in);
		int num=obj.nextInt();
		int r=obj.nextInt();

        int j=fact(num);
        int k=fact(num-r);
        int npr=j/k;
        System.out.println("nPr"+npr);
	}
	public static int fact(int n)
	{    
		int factori=1;
		for(int i=1;i<=n;i++)
		{
			factori=factori*i;
		}
		return factori;
	}
}