import java.util.Scanner;
class Userinput
{
public static void main(String arg[])
{
Scanner obj=new Scanner(System.in);
System.out.println("Enter Your Name :");
String name=obj.nextLine();
System.out.println("Enter Your Age :");
int age=obj.nextInt();
System.out.println("Enter Your Gender :");
char gender=obj.next().charAt(0);
System.out.println("Enter your Ph.no :");
long phno=obj.nextLong();

System.out.println("****************************************");
System.out.println("Name :"+name);
System.out.println("Age :"+age);
System.out.println("Gender :"+gender);
System.out.println("Phone Number :"+phno);




}
}