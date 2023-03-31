import java.util.Arrays;
import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
		Scanner fs = new Scanner(System.in);
		int T = 1;
		T = fs.nextInt();
		for (int tc = 1; tc <= T; tc++) {
			int n = fs.nextInt();
			char[] s = fs.next().toCharArray();
			Arrays.sort(s);
			System.out.println(String.valueOf(s).equals("Timru") ? "YES" : "NO");
		}
		fs.close();
	}
}
