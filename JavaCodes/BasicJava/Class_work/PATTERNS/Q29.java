package JavaCodes.BasicJava.Class_work.PATTERNS;

import java.util.Scanner;

public class Q29 {
            public static void main(String[] args) {
                Scanner scn = new Scanner(System.in);
                    int n = scn.nextInt();
                    int star = 1;
                    int space =n/2;
                    for( int i=1; i<=n; i++){
        
                        // space 
                        for( int csp=1; csp<=space;csp++){
                            System.out.print(" ");
        
                        }
                        // star
        //	            char x ='A';
                        //int x=1;
                        for(int cst = 1; cst<=star; cst++){
                            if(cst==1|| cst==star||i==1||i==n)
                            System.out.print("*");
                            else {
                                System.out.print(" ");
                            }
                            
        //	                if(cst<=star/2) {
        //	                	x++;
        //	                }else {
        //	                	x--;
        //	                }
                        }
                        
                        System.out.println();
        
                        if(i<=n/2){
                            space = space-1;
                            star=star+2;
                        }else{
                           space =space+1;
                           star = star-2; 
                        }
                    }
               } 
    }
}
