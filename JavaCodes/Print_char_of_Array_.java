// 2. WAP to initialized a character array with all 26 letters of

// alphabet, then accept a letter and display its position in the alphabet.
import java.io.*;
import java.util.*;

public class Print_char_of_Array_ {

  public static void main(String[] args) {
    char[] arr = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
    
		Scanner scanner = new Scanner(System.in); 
      char ch = scanner.next().charAt(0);
      int count = 0;
      for (char c = 'a'; c <= ch; c++){
          count++;
      }
    
      System.out.println(count);
    }
		
	}