import java.util.*;
class Reverse
{
public static void main(String args[])
{
Scanner s=new Scanner(System.in);
System.out.println("enter the numbers");
int n=s.nextInt();
int x=0;
int rev=0;
while(n!=0)
{
x=n%10;
n=n/10;
rev=rev*10+x;
}
System.out.println("reverse number:"+rev);
}
}
