public class Binary {
	public static void main(String[] args) {
		int n;
		String a;
		Scanner s=new Scanner(System.in);
		System.out.println("enter the decimal number");
		n=s.nextInt();
		a=Integer.toBinaryString(n);
		System.out.println("binary value:"+a);
		s.close();
		
		
	}

}
