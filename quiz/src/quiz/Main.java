package quiz;

class mondai {
	void a() {
	System.out.print("50円玉や100円玉にも使われている「白銅」は、銅とどんな金属との合金？\n");
	System.out.print("①亜鉛　②錫(すず)　③ニッケル　④クロム\n");
	}
	void b() {
		System.out.print("三角形の三辺の長さから面積を求める公式は「〇〇〇の公式」。〇〇〇に入る言葉は何？\n");
		System.out.print("①ヘロン　②ハロン　③ホロン　④ソロン\n");

	}
	void c() {
		System.out.print("陰極線は何という粒子の流れ？\n");
		System.out.print("①陽子　②分子　③原子　④電子\n");
	}

}

public class Main {

	public static void main(String[] args) {
		mondai mondai = new mondai();
		mondai.a();
		mondai.b();
		mondai.c();
	}

}
