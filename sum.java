public class Sum2 {
	public static int output1;
	int x=0;
public static void main(String[] args) {
	Sum2 s=new Sum2();
	s.sumofdigits(1234);
	System.out.println(output1);
	
}
	public void sumofdigits(int input1)
	{
			int n=input1;
		
		while(n!=0)
		{
		x=x+n%10;
		n=n/10;
		}
		input1=input1/10;
		if(input1>0)
		{
			sumofdigits(input1);
		}
		output1=x;

	}

}
