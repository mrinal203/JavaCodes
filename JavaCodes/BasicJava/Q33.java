package JavaCodes.BasicJava;
// find duck number 
// find the first digit of number ? 

   



import java.util.Scanner;

public class Q33 {
    static int Count_dig_of_no(int n){
        int count=0;
        do{
            n=n/10;
            count++;
        }
        return count;
    }
    static boolean Find_Duck_no(int n,int size){
        int ct=0;
        int firstDigit = Integer.parseInt(Integer.toString(n).substring(0, 1));
        if(firstDigit==0){
            return false;

        }
            for(int i=1;i<size;i++){
                int dig = Integer.parseInt(Integer.toString(n).substring(1, i));
                if(dig==0){
                    ct++;
                }
            }
            if(ct>0){
                return true;
            }
        }
    
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int count_dig = Count_dig_of_no(n);
       boolean b= Find_Duck_no(n,count_dig);
       if(b){
        System.out.println("yes");
       }

    }
}
