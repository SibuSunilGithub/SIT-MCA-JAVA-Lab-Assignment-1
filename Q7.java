// Write a Java Program to reverse a given number.

class Q7 {
	public static void main(String args[]) {
		int num = 765124, dgt, rev = 0;
		while (num != 0) {
			dgt = num % 10;
			num /= 10;
			rev = (rev * 10) + dgt;
		}
		System.out.println("Reverse Is: " + rev);
	}
}