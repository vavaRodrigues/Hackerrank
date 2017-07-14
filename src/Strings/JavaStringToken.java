package Strings;

import java.io.*;
import java.util.*;

public class JavaStringToken {
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		String s = scan.nextLine();
		String[] tokens = s.split("[ !,?._@']");

		int ans = 0;

		for (String token : tokens){

			if (token.length() > 0) {
				ans++;
			}
		}	
		System.out.println(ans);

		for (String token : tokens) {
			if (token.length() > 0)
				System.out.println(token);
		}

	}
}
