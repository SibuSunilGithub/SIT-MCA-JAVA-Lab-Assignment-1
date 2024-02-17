class Q4{
	public static void main(String args[]){
		int num1 = 15, num2 = 30, num3 = 50;
		if(num1 > num2 && num1 > num3)
		{
			System.out.println(num1+" Is Largest");
		}
		else if(num2 > num1 && num2 > num3)
		{
			System.out.println(num2+" Is Largest");
		}
		else
		{
			System.out.println(num3+" Is Largest");
		}
	}
}