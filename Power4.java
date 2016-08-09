public class Power {
	
	int count=0;
	int sum=0;
	public static int output1;
	
public static void main(String[] args) 
{
	Power p=new Power();
	System.out.println(p.sum(1234));
}
public int power(int a,int b)
{
	int result=1;
	for(int i=0;i<b;i++)
		result *=a;

	return result;
}
public int sum(int input)
{
	int p=input;
	int q=input;
	while(p!=0)
	{
		p=p/10;
		count++;
	}
	while(q!=0)
	{
		int n=q%10;
		sum=sum+(power(n,count));
		
		q=q/10;
	}
	output1=sum;
	return output1;
}


}

	
