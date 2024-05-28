/* Write a Java Program to display the day of the week (Sunday, Monday 
etc.) based on the day number. (Use Switch Case)*/

class Q5 {
	public static void main(String args[]) {
		int day = 3;
		switch (day) {
			case 1:
				System.out.println("Mon");
				break;
			case 2:
				System.out.println("Tue");
				break;
			case 3:
				System.out.println("Wed");
				break;
			case 4:
				System.out.println("Thu");
				break;
			case 5:
				System.out.println("Fri");
				break;
			case 6:
				System.out.println("Sat");
				break;
			case 7:
				System.out.println("Sun");
				break;
			default:
				System.out.println("Invalid Input!");
		}
	}
}