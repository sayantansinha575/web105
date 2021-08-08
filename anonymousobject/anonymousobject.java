class Anonymous
{
	void fact(int n)
	{
		int fact =1;
		int i;
		for(i=1;i<=n;i++)
		{
			fact = fact*i;
		}
		System.out.print("Factorial value = "+fact);
	}
	public static void main(String[] args) {
		new Anonymous().fact(3);
		
	}
}

