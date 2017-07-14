package BigNumber;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Scanner;

public class JavaBigInteger {
	public static void main(String args[]){
		Scanner scan = new Scanner(System.in);
		BigInteger multi= new BigInteger("0");
		BigInteger soma= new BigInteger("0");
		BigInteger a = scan.nextBigInteger();
		BigInteger b = scan.nextBigInteger();
		soma = a.add(b);
		multi=a.multiply(b);
		System.out.println(soma);
		System.out.println(multi);
		
	}

}
