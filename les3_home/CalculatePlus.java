public class CalculatePlus {
	
	public static void main(String[] args) {
		int first = Integer.valueOf(args[0]);
		int second = Integer.valueOf(args[1]);
		int third = Integer.valueOf(args[2]);
		int fourth = Integer.valueOf(args[3]);
		System.out.println("Result1: " + (first + fourth));
		System.out.println("Result2: " + (second * third));
		System.out.println("Result3: " + (first - fourth));
		System.out.println("Result4: " + (first / fourth));
		System.out.println("Result5: " + Math.pow(first, fourth));
	}
	
}