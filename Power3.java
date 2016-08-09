public class Power3
 {

	static int output1;
	public static void main(String[] args) {
		Power3 p=new Power3();
		p.sumOfItsPosition(122334);
		System.out.println(output1);
	}
	public int power(int a,int b)
	{
		int result = 1;
		for (int i = 1; i <= b; i++) {
		   result *= a;
		}
		
		return result;
	}
	public int sumOfItsPosition(int input)
	{
		int p=input;
		int q=input;
		 int count=0;
		 int sum1=0;
		while(p!=0)
		{
			p=p/10;
			count+=1;
			
		}
		
		while(q!=0)
		{
			int n=q%10;
			sum1=sum1+(power(n,count));
			q=q/10;
			count--;
		}
		output1=sum1;
		return output1;
	}

}

