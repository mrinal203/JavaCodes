import java.io.*;
import java.util.*;

public class Display_Array{

    public static void main(String[] args)  {
        Scanner scn = new Scanner(System.in);
        int n= scn.nextInt();
        int arr[] = new int[n];
        for(int i = 0;i <n; i++){
            arr[i] = scn.nextInt();
        }
        displayArr(arr , 0);
        // write your code here
    }

    public static void displayArr(int[] arr, int idx){
    if(idx == arr.length){
        return ;
    }
       System.out.println(arr[idx]);
       displayArr(arr, idx+1); 
    }

}