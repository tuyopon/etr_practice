package quiz;
import java.util.Random;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		int k,s;
		Random rnd = new Random();
		int a = rnd.nextInt(99);
		int b = rnd.nextInt(99);
		Scanner scan = new Scanner(System.in);
		System.out.printf("%d + %d = ",a,b);
		k = scan.nextInt();
		s = a + b;
		if(s == k) {
			System.out.print("正解!!!");
		}else {
			System.out.print("不正解");
		}
	}

}
