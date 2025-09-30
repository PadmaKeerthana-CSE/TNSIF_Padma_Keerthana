package basic.java;
import java.util.*;

public class AdditionScanner {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter the numbers:");
		int a=s.nextInt();
		int b=s.nextInt();
		int c=a+b;
		System.out.println("Addition of a= "+a+" and b="+b+" is "+c);

	}

}
