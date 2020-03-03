import java.util.ArrayList;

public class Lab8 {
	
	public static void main(String args[])
	{
		/*for(int i=0;i<10;++i)
		{
			int x = CS2004.UI(0, 1);
			System.out.println(x);
		}*/
		ArrayList<Double> MyArr = new ArrayList<Double>();
		
		ArrayList<Double> MyArr2 = new ArrayList<Double>();
		
		MyArr.add(1.00);
		MyArr.add(2.00);
		MyArr.add(3.00);
		MyArr.add(4.00);
		MyArr.add(5.00);
		MyArr.add(6.00);
		MyArr.add(7.00);
		MyArr.add(8.00);
		MyArr.add(9.00);
		MyArr.add(10.00);
		
		int MyLength = MyArr.size();
		ScalesSolution s = new ScalesSolution(MyLength);
		double fitness = ScalesSolution.ScalesFitness(MyArr);
		System.out.println(fitness + " is the fitness");
		
		MyArr2 = CS2004.ReadNumberFile("1000 Primes.txt");
		double fitness2 = ScalesSolution.ScalesFitness(MyArr2);
		System.out.println(fitness2 + " is the second fitness");
		//s.println();
		
		
		
		


	}

}
