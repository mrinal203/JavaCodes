import java.io.*;
import java.util.*;

public class rotate_array{
  public static void display(int[] a){
    StringBuilder sb = new StringBuilder();

    for(int val: a){
      sb.append(val + " ");
    }
    System.out.println(sb);
  }

  public static void rotate(int[] a, int k){
    // write your code here
    int index  = a.length - k;
     int size = a.length;
     int temp;
    for( int len = a.length; len>= index ; len --){

       for(int start = size ;start>=0; start--){
                       temp = a[start];
                       System.out.print(temp);
                       a[start]= a[start-1];
       }
               a[0]=temp;
    }

  }

public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    int n = Integer.parseInt(br.readLine());
    int[] a = new int[n];
    for(int i = 0; i < n; i++){
       a[i] = Integer.parseInt(br.readLine());
    }
    int k = Integer.parseInt(br.readLine());

    rotate(a, k);
    display(a);
 }

}