package JavaDSA;

import java.util.Scanner;

public class ReverseNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number:");
		int num =sc.nextInt();
		                               // Logic-1(Using Algorithm)
		
//		
//		int rev=0;
//		while(num!=0)
//		{
//			rev = rev*10+num%10;
//			num=num/10;	
//		}
//		System.out.println("Reverse Of A Number Is:" +rev);
		
		
		                              // Logic-2 ( Using String BufferClass)
		
//		StringBuffer rev;
//		StringBuffer sb= new StringBuffer(String.valueOf(num));
//		StringBuffer rev1=sb.reverse();
//		System.out.println("Reverse Of A Number Is:" +rev1);
 
		
	                                  // Logic-3 (Using StringBuilder Class)
		
//		StringBuilder sbl= new StringBuilder();
//		sbl.append(num);
//		StringBuilder rev=sbl.reverse();
//		System.out.println("Reverse Of A Number Is:" +rev);
		
	}

}
