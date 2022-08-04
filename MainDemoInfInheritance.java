interface MyInf2 extends MyInf
{
	double compute(double n);
		
}
interface MyInf
{
	double sum(double a, double b);
	void show();
}
class MyClass implements  MyInf2
{
	double ans;
	public double sum(double x, double y)
	{
		ans=x + y;
		return ans;
	}
	public double compute(double num)
	{
		return num * num;
	}
	public void show()
	{
		System.out.println("Answer:"+ ans);
	}
}
class MainDemoInfInheritance {
	public static void main(String[] arg)
	{
		MyClass o1= new MyClass();
		double ans1=o1.sum(10,20);
		o1.show();
		System.out.println("Compute Method:"+ o1.compute(6));
		
	}

}