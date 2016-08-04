import.java.util.*;
class Armstrong
{
public static void main(String args[])
{
int a;
Scanner s=new Scanner(System.in);
a=s.nextInt();
int b=0;
int c=0;
while(a!=0)
{
b=a%10;
a=a/10;
c+=b*b*b;
}
System.out.println(c);
}}
