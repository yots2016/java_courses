public class CalculatePlus {
	
	public static void main(String[] args) {
		double first = Integer.valueOf(args[0]);
		double second = Integer.valueOf(args[1]);
		double third = Integer.valueOf(args[2]);
		double fourth = Integer.valueOf(args[3]);
		System.out.println("Result1: " + (first + fourth));
		System.out.println("Result2: " + (second * third));
		System.out.println("Result3: " + (first - fourth));
		System.out.println("Result4: " + (first / fourth));
		System.out.println("Result5: " + Math.pow(first, fourth));
	}
	
}