import java.util.*;
import java.util.Scanner; 
import java.nio.charset.*; 
class CouponNumber 
{ 
	static String getAlphaNumericString(int n) 
	{  
		byte[] array = new byte[256]; 
		new Random().nextBytes(array); 
		String randomString = new String(array, Charset.forName("UTF-8")); 
//A named mapping between sequences of sixteen-bit Unicode code units and sequences of bytes. 
		StringBuffer r = new StringBuffer(); 
		for (int k = 0; k < randomString.length(); k++) { 
			char ch = randomString.charAt(k); 
			if (((ch >= 'a' && ch <= 'z') 
				|| (ch >= 'A' && ch <= 'Z') 
				|| (ch >= '0' && ch <= '9')) 
				&& (n > 0)) 
				{ 
				r.append(ch); 
				n--; 
				} 
		}  
		return r.toString(); 
	} 

	public static void main(String[] args) 
	{  
		int n;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of distinct numbers wanted for the coupon" );
  		n=sc.nextInt();    
		System.out.println(getAlphaNumericString(n)); 
	} 
} 
