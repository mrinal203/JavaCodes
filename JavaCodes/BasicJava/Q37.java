
//import java.io.InputStream;
import java.util.Scanner;
public class Q37 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int a = scn.nextInt();
        int b = scn.nextInt();
        int c = scn.nextInt();
        if(a>b){
            if(a>c){
                System.out.println(a);
            }else{
                System.out.println(c);
            }
        }else if(b>c){
            System.out.println(b);
        }else {
        	System.out.println(c);
        }



    }

	
}