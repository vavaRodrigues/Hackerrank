package introduction;

import java.util.Scanner;

public class JavaEndOfFile {
	public static void main(String args[]){
		Scanner scan = new Scanner(System.in);
		int i = 1;

		while(scan.hasNext() == true){
			String str = scan.nextLine();
			System.out.println(i + " "+ str);
			i++;
		}
		
	}

}
