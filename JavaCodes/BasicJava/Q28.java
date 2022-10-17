package JavaCodes.BasicJava;
// Q28. Write a java program to check whether the user entered number is automorphic or not?
// Explanation: Automorphic number are those numbers whose square ends with the same number itself. 
// For example, 25 = 625 It is an automorphic number.
// Input: 76
// Output: Automorphic Number

import java.util.Scanner;

// Output: Not an automorphic number
// Input: 12

public class Q28 {
    // number should be min 2 digit 
    
    // squre of number of last two digit should be eqal to number
    Static int Find_Square(int n){
          int sqr = n*n;
      return sqr;

    }
    Static int final_Lastdigt(int sq){
      int i=2;
      while(i>0){
        
      }

    }
    public static void main(String[] args) {
        
    
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    // code for only two digit number
    int sq = Find_Square(n);
    int  l = find_Lastdigt(sq);
    }
}
