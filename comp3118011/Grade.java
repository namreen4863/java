import java.util.*;
class Grade
{
public static void main(String args[])
{
int m;
System.out.println("enter your pointer");
Scanner sc = new Scanner(System.in);
m=sc.nextInt();
switch(m)
{
case 10:System.out.println("O");
            break;
case 9:System.out.println("A");
            break;
case 8:System.out.println("B");
             break;
case 7:System.out.println("C");
            break;
case 6:System.out.println("D");
            break;
case 5:System.out.println("E");
            break;
case 4:System.out.println("P");
            break;
default:System.out.println("F");
}
}
}
