import java.util.*;
public class Oddoreven {
public static void main(String[] args) {
	int n;
	Scanner s=new Scanner(System.in);
	System.out.println("enter the number:");
	n=s.nextInt();
	if(n%2==0)
	{
		System.out.println("even");
	}
	else 
	{
		System.out.println("odd");
	}
	
		s.close();

	}

}
