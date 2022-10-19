package BasicJava;

import java.util.Scanner;

public class Q48 {
   int  id=0;
    String firstName;
   String lastName;
   String  birthDate;

   void Id_(){
       id=id++;
   }
    Q48(String Fname , String Lname , Sreing Bdy){
        this.firstName = Fname;
        this.lastName = Lname;
        this.birthDate = Bdy;
         this.Id_();
            
    }  
    public static void main(String[] args) {
        Q48 a1 = new Q48(Sauraj, "mrinal", "16_05_1999");
        Q48 a2 = new Q48(Sauraj, "mrinal", "16_05_1999");
        Q48 a3 = new Q48(Sauraj, "mrinal", "16_05_1999");
        Q48 a4 = new Q48(Sauraj, "mrinal", "16_05_1999");
        Q48 a[] ={a1,a2,a3,a4};
        for( int i=0;i<a.length;i++){
       System.out.println(a[i].id);
       System.out.println(a[i].firstName);
       System.out.println(a[i].lastName);
       System.out.println(a[i].birthDate);
        }
    }  
}
