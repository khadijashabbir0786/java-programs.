class array
{
	void display(int x[][])
	{
		for(int i=0; i<2; i++)
		{
			for (int j=0; j<2; j++)
			{
				System.out.println(x[i][j]);
			}
		}
	}
}
public class test
{
	public static void main(String args[])
	{
		int x[][]= {{100,200},{300,400}};
		array obj= new array();
		obj.display(x);
	}
}