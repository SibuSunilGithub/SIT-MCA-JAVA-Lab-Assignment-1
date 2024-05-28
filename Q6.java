// Write a Java Program to count the number of digits in a given number.

class Q6 {
	public static void main(String args[]) {
		int num = 7463, count = 0;
		while (num != 0) {
			num /= 10;
			count++;
		}
		System.out.println("Number Of Digits Is: " + count);
	}
}