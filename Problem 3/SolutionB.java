/*************************************************************
 Purpose/Description: A java class to efficiently calculate xponentiation 
 using a recurssive implementation of the expo by square algorithm
 Author’s Panther ID: 6231951
 Certification:I hereby certify that this work is my own and
 none of it is the work of any other person.
**************************************************************/

class SolutionB {
	static long N = 1000000007L; // prime modulo value

	static long exponentiation(long base, long exp)
	{
		if (exp == 0)
		{
			return 1;
		}

		if (exp == 1)
		{
			return base % N;
		}
		long t = exponentiation(base, exp / 2);
		t = (t * t) % N;

		// if exponent is even value
		if (exp % 2 == 0){
			return t;
		}
		// if exponent is odd value
		else{
			return ((base % N) * t) % N;
		}
	}
	
	public static void main(String[] args)
	{
		long base = 5;
		long exp = 100000;

		long modulo = exponentiation(base, exp);
		System.out.println(modulo);
	}
}
