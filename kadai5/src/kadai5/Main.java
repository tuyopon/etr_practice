package kadai5;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner scanner = new Scanner(System.in);
		System.out.printf("入力:");
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		System.out.printf("足し算：%d\n",a+b);
		System.out.printf("引き算：%d\n",a-b);
		System.out.printf("掛け算：%d\n",a*b);
		System.out.printf("割り算：%d\n",a/b);
		scanner.close();

	}

}
