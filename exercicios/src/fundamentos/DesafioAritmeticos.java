package fundamentos;

public class DesafioAritmeticos {
	public static void main(String[] args) {

		double p1 = Math.pow((6 * (3 + 2)), 2);

		double p2 = p1 / (3 * 2);

		double p3 = Math.pow(((1 - 5) * (2 - 7) / 2), 2);

		double p4 = p2 - p3;

		double p5 = Math.pow(p4, 3) / Math.pow(10, 3);
		System.out.println(p5);

	}
}
