import java.util.*;
class Primeno
{
public static void main(String args[])
{
int i,n,c;
System.out.println("Prime numbers from 1 to 1000 are:\n");
n=1;
 while(n<1000)
{   
for(i=1;i<=n;i++)
{
 if(n%i==0)
{ 
   count++;//increment
}
 }
if(count==2)
{
System.out.println(n+"is prime number");
}
}
	