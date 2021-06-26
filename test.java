import java.io.*;
class test
{
public static void main(String args[])
{
String s="";
DataInputStream d=new DataInputStream(System.in);
try
{
System.out.println("Enter Your Name :");
s=d.readLine();
}
catch(Exception e)
{}
System.out.println(s+"Welcom to java");
}
}