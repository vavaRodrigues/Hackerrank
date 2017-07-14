import java.util.Scanner;

public class StringSimilares {
	public static int calcularString(String str) {
		char[] arr = str.toCharArray();
		int len = arr.length;
		int count = len;
		for (int i = 1; i < len; i++) {
			int qtd = len - i;
			int j = 0;
			for (; j < qtd; j++)
				if (arr[j] != arr[j + i]) {
					break;
				}
			count += j;
		}
		return count;
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		for (int i = 0; i < n; i++) {
			String str = scanner.next();
			System.out.println(calcularString(str));
		}
	}

}
