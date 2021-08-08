class Parametercons
{
	int i;
	void Parametercons(int i)
	{
		this.i = i;
	}
	void display()
	{
		System.out.print("I variable value = "+i);
	}
}
class Final
{
	public static void main(String arg[])
	{
		Parametercons obj = new Parametercons();
		obj.Parametercons(2);
		obj.display();
	}
}