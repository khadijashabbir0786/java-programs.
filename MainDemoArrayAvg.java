class MainDemoArrayAvg
{
	public static void main(String[] arg)
	{
		int[] m= new int[arg.length];
		int sum=0;
		double avg;
		//initialize array element through command line arg
		for(int i=0;i<m.length; i++)
		{
			m[i]=Integer.parseInt(arg[i]);	
		}
		//for Display 

		for(int i=0;i<m.length; i++)
		{
			System.out.println(m[i]);	
		}
		//sum
		for(int i=0;i<m.length; i++)
		{
			sum=sum + m[i];
		}
		avg = (double)sum / m.length;
		System.out.println("Average:"+ avg);			
	}

}