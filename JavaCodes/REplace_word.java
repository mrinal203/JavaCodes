//5. WAP to accept a sentence and find the occurences of a word and

//replace them with another word.
import java.util.*;

class REplace_word{

static void change(String s, String s1, String s2)
{
	
	String ans = "";

	
	for (int i = 0; i < s.length(); i++) {

	int k = 0;

	if (s.charAt(i) == s1.charAt(k)
		&& i + s1.length() <= s.length()) {

		int j;
		for (j = i; j < i + s1.length(); j++) {

		if (s.charAt(j) != s1.charAt(k)) {
			break;
		}
		else {
			k = k + 1;
		}
		}
		if (j == i + s1.length()) {
		ans += (s2);
		i = j - 1;
        }
		else {
		ans += (s.charAt(i));
		}
	}

	else {
		ans += (s.charAt(i));
	}
    }
	System.out.print(ans);
}
public static void main(String[] args)
{
	String S = "my name is mrinal";
	String S1 = "is";
	String S2 = "sauraj";
	change(S, S1, S2);
}
}