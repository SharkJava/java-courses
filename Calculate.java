public class Calculate {

	public static void main(String[] arg) {
		System.out.println("Calculate...");
		double first = Double.valueOf(arg[0]);
		double second = Double.valueOf(arg[1]);
		System.out.println("Result: " + first / second);

		long a = Long.valueOf(arg[2]);
		long b = Long.valueOf(arg[3]);
		System.out.println("Result 2: " +  Math.pow(a, b));

	}

}