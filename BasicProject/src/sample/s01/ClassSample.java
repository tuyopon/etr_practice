package sample.s01;

public class ClassSample {

	public static void main(String[] args) {
		Countor countor1 = new Countor();
		Countor countor2 = new Countor();

		countor1.show();
		countor1.count();
		countor1.show();

		countor2.count();
		countor2.count();
		countor2.count();
		countor2.show();

	}

}
