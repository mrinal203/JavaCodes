
// 3. WAP to accept a string and count the number of occurences of

// the given character.
public class Number_of_occurence
{
	public static int count(String s, char c)
	{
		int res = 0;

		for (int i=0; i<s.length(); i++)
		{
		
			if (s.charAt(i) == c)
			res++;
		}
		return res;
	}
	
	public static void main(String args[])
	{
		String str= "MynameisMrinal";
		char c = 'M';
		System.out.println(count(str, c));
	}
}