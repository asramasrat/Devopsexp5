class P3
{
	public static void main(String[] args) {
		int num = Integer.parseInt(args[0]);
		if(num < 0)
			System.out.println("Invalid Input");
		else
		{
			double fact = 1;
			for(int i=1; i<=num; i++)
			{
				fact *= i;
			}
			System.out.println("Factorial: "+fact);
		}
	}
}