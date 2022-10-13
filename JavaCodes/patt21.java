public class patt21 {
    

	public static void main(String[] args) {
      int temp=2,k=2;
      for( int i=1; i<=4;i++){
           
          for( int j=1;j<=i;j++){
              System.out.print(" "+(temp-j));
              
          }
           //k=k+i;
          temp = temp+k;
          k++;
         
          System.out.println();
      }
	}
}
