// Display Triangle Number Pattern 
class Q10 {
	public static void main(String args[]) {
		int bit = 1, i, j;
		for (i = 0; i < 5; i++) {
			for (j = 0; j <= i; j++) {
				System.out.print(" " + bit);
				bit++;
			}
			System.out.print("\n");
		}
	}
}