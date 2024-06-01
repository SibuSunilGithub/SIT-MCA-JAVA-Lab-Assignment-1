// Write a Java Program to find the sum of the following series.

class Q9 {
	public static void main(String args[]) {
		float n = 5, i;
		float sum = 1;
		for (i = 2; i <= n; i++) {
			sum += (1 / i);
		}
		System.out.println("Sum = " + sum);
	}
}