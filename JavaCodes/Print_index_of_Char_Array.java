
import java.io.*;
import java.util.*;

public class Print_index_of_Char_Array  {

  public static void main(String[] args) {
    char[] arr = "abcdefghijklmnopqrstuvwxyz".toCharArray();
    
		Scanner scn = new Scanner(System.in);
		int  num = scn.nextInt();
    if(num >=1 && num<=26){
      System.out.println(arr[num-1]);
    }
		
	}

}