class Calc
{
	int a,b,add,sub,div,mul,mod;
	void addition(int a,int b)
	{
		 this.a = a;
		 this.b = b;
		add = this.a + this.b;
	}
	void substruction(int a,int b)
	{
		this.a = a;
		this.b = b;
		sub = this.a - this.b;
	}
	void Calc()
	{
		System.out.println("Addition = "+add);
		System.out.println("Substruction = "+sub);
	}

}
class Final
{
	public static void main(String arg[])
	{
		Calc obj = new Calc();
		obj.addition(2,5);
		obj.substruction(4,2);
		obj.Calc();
	}
}