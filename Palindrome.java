class Palindrome
{
public static void main(String args[])
{
int n;
n=Integer.ParseInt(args[0]);
int m=n;
while(n!=0)
{
int x=n%10;
rev=rev*10+x;
n=n/10;
}
if(m==rev)
{
System.out.println("palindrome");
}
else
{
System.out.println("not palindrome"0;
}
}
}
