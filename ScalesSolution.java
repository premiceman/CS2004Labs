import java.util.ArrayList;

public class ScalesSolution
{
	private static String scasol;
	//Creates a new scales solution based on a string parameter
	//The string parameter is checked to see if it contains all zeros and ones
	//Otherwise the random binary string generator is used (n = length of parameter)
	public ScalesSolution(String s)
	{
		boolean ok = true;
		int n = s.length();
		for(int i=0;i<n;++i)
		{
			char si = s.charAt(i);
			if (si != '0' && si != '1') ok = false;
		}
		if (ok)
		{
			scasol = s;
		}
		else
		{
			scasol = RandomBinaryString(n);
		}
	}
	private static String RandomBinaryString(int n)
	{
		String s = new String();
		//Code goes here
		//Create a random binary string of just ones and zeros of length n
		for(int i = 0; i < n; i++)
		{
			int newval = CS2004.UI(0, 1);
			String intstring = Integer.toString(newval);
			s = s + intstring;
		}
		System.out.println(s.length() + " is the length of string s");
		System.out.println(s);
		return(s);
	}
	
	
	public ScalesSolution(int n) 
	{
		scasol = RandomBinaryString(n);	
		System.out.println(scasol.length() + " is the length of scasol");
	}
	//This is the fitness function for the Scales problem
	//This function returns -1 if the number of weights is less than
	//the size of the current solution
	public static double ScalesFitness(ArrayList<Double> weights)
	{
		if (scasol.length() > weights.size()) return(-1);
		double lhs = 0.0,rhs = 0.0;
		int n = scasol.length();
		
		//Code goes here
		//Check each element of scasol for a 0 (lhs) and 1 (rhs) add the weight wi
		//to variables lhs and rhs as appropriate
		for(int i = 0; i < n; i ++)
		{	
			if(scasol.charAt(i)=='0') 
			{
				lhs=lhs+weights.get(i);
			}
			 if(scasol.charAt(i)=='1')
			 {
				rhs=rhs+weights.get(i);
			 }
		}
		System.out.println(lhs - rhs);
		return(Math.abs(lhs-rhs));
	}
	//Display the string without a new line
	public void print()
	{
		System.out.print(scasol);
	}
	//Display the string with a new line
	public void println()
	{
		print();
		System.out.println();
	}
	
	public void SmallChange(String str)
	//Take a random number between 1 and the nth element in the array. Take that elemtn
	//change that element, run a fitness test
	{
		int leng = str.length();
		String newstr = new String();
		int x = (int) (1 + Math.random() * leng - 1);
		for(int i = 0; i < leng; i ++)
		{
			char thischar = str.charAt(i);
			if(i == x)
			{
				if(thischar == '0')
				{
					thischar = '1';
					newstr += thischar;
					System.out.println("zero");
				}
				else
				{
					thischar = '0';
					newstr += thischar;
					System.out.println("one" + x + " is the value of x");
				}
			}
			else
			{
				newstr += thischar;
			}
		}
		System.out.println(x + " is the random value " + newstr + " is the new string ");
		return newstr;
	}
}