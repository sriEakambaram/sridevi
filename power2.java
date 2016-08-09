public class Power2 {
	    static int output;
		public static void main(String[] args) {
			Power2 p=new Power2();
			p.nextValue(1234);
			System.out.println(output);

		}
		public int power(int a,int b)
		{
			int result = 1;
			for (int i = 0; i < b; i++) {
			   result *= a;
			}
			
			return result;
		}
		public int nextValue(int input1)
		{  
			int p=input1;
			int q;
			int r;
			int sum=0;
			int sum1=0;
			int rev=0;
			int count=0;
			while(p!=0)
			{
				sum1=p%10;
				p=p/10;
				rev=rev*10+sum1;
				count++;
			}
	        int out=rev;
			while(out!=0)
			{
				p=out%10;
				out=out/10;
				if(count==1)
				{
				r=rev%10;
				}
				else{
				r=out%10;
				}
				sum=sum+power(p,r);
				count--;
			}
			output=sum;
			return output;
		}

	}
