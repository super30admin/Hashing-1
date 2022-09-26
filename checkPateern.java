class pattern
{

	// Function to check if characters in the input string
	// follows the same order as determined by characters
	// present in the given pattern
	static boolean checkPattern(String str, String pattern)
	{
		// len stores length of the given pattern
		int len = pattern.length();

		// if length of pattern is more than length of
		// input string, return false;
		if (str.length() < len)
		{
			return false;
		}

		for (int i = 0; i < len - 1; i++)
		{
			// x, y are two adjacent characters in pattern
			char x = pattern.charAt(i);
			char y = pattern.charAt(i + 1);

			// find index of last occurrence of character x
			// in the input string
			int last = str.lastIndexOf(x);

			// find index of first occurrence of character y
			// in the input string
			int first = str.indexOf(y);

			// return false if x or y are not present in the
			// input string OR last occurrence of x is after
			// the first occurrence of y in the input string
			if (last == -1 || first
					== -1 || last > first)
			{
				return false;
			}
		}

		// return true if string matches the pattern
		return true;
	}

	// Driver code
	public static void main(String[] args)
	{
		String str = "engineers rock";
		String pattern = "gsr";

		System.out.println(checkPattern(str, pattern));
	}
}
