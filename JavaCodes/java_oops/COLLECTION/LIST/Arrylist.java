package java_oops.COLLECTION.LIST;
import java.util.ArrayList;
public class Arrylist {
    public static void main(String[] args) {
        
        ArrayList a = new ArrayList();
        a.add(10);
        a.add(20);
        a.add("mrinal");
        a.add(70.98);
        System.out.println(a); // print all the element in array
        // if i print a particular element of arrayList the we use like
        System.out.println(a.get(1));
        System.out.println(a.get(2));
        System.out.println(a.get(3));
        //finding out size of collection 
        System.out.println(a.size());
        Collections.sort(a);
         System.out.println(a); 
        // a collection can we sorted only when there is homoginious data in it or else we will get Exception 
        //-----> Exception in thread "main" java.lang.ClassCastException: class java.lang.Integer cannot be cast to class java.lang.String (java.lang.Integer and java.lang.String are in module java.base of loader 'bootstrap')
	//at java.base/java.lang.String.compareTo(String.java:140)
       }
}

