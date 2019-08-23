import java.util.*;
import java.io.*;
class Input
{
 public static void main(String args[]) throws IOException
{ 
int a,b, p=0,q=0;
float n,z;
//command line arguement
 a=Integer.parseInt(args[0]);
 b=Integer.parseInt(args[1]);
System.out.println(a);
System.out.println(b);
//isr
InputStreamReader isr=new InputStreamReader(System.in);
BufferedReader br=new BufferedReader(isr);
System.out.println("enter your name");
String name=br.readLine();
System.out.println("how are you"+name);
//sc
Scanner sc=new Scanner(System.in);
System.out.println("enter a no.");
n=sc.nextFloat();
System.out.println(n);
//right shift
p=a >>3;
q=b >>2;
System.out.println(Integer.toBinaryString(p));
System.out.println(Integer.toBinaryString(q));
}
}
 

