import java.util.*;

public class Patt_17 {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int star =1 ;
        int space =  n/2;
        for( int row = 1; row <= n ; row ++){
             
              for(int csp = 1;csp<= space; csp++){
                   System.out.print("\t");
              }
               

                 for(int cst = 1; cst<= star; cst++){
                System.out.print("*\t");
            }

            System.out.println();
            // update 

            if(row<= n/2){
                star++;
            }else{
                star--;
            }
            if( row == (n/2)+1){

                for (int i=1;i<=n;i++){
                    System.out.print("*\t");
                }
            }

        }
       

    }
}