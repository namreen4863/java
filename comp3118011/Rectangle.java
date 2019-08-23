import java.util.*;
class Rectangle
{
static int rectarea(int l,int b)
{
return(l*b);
}
public static void main(String[] args)
{
int r,l,b;
Scanner sc=new Scanner(System.in);
System.out.println("enter the length");
l=sc.nextInt();
System.out.println("enter the breadth");
b=sc.nextInt();
r=rectarea(l,b);
System.out.println("Area of Rectangle" +r);
System.out.println("Length = "+l);
System.out.println("Breadth = "+b);
}
}

