
//4. WAP to accept a sentence and count the number of occurences of the given word.

import java.io.*;

class Main{


static int countoc(String str, String w)
{
	String a[] = str.split(" ");


	int count = 0;
	for (int i = 0; i < a.length; i++)
	{

	if (w.equals(a[i]))
		System.out.println("enter word for replace");
		String str = scn.next();
		w.equals(a[i])=str;
	}

	return count;
}

public static void main(String args[])
{
    Scanner scn = new Scanner(System.in); 
	String str = "My name is marinal my name is sauraj ";
	String w = "name";
	System.out.println(countoc(str, w));
}
}
