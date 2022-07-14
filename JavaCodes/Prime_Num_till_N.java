import java.util.*;

public class Main{
    public static void main(String[] args) {
        // write your code here
        Scanner scn = new Scanner(System.in);
        int low = scn.nextInt();
        int high = scn.nextInt();
        int count=0;
        for(int j= low ; j<=high; j ++){
              int num=j;
            for (int i=2 ; i*i<=num ;i++){
                if( num % i == 0){
                    count = 1;
                    break;
                }
                else {
                    count=0;
                }
                
            }
            if(count== 0){
                    System.out.println(num);
                    
                }
        }
    }
}