public class SisStickGame {

	public static void main(String args[]){
	java.util.Scanner scan  = new java.util.Scanner(System.in);
	
	  int totalStick=21;
	// final int magicLogicNumber=5; 
	 final int MAGIC_LOGIC_NUMBER=5; 
	 //constant variable  //re assign not allowed
	  int guestUserPick;
	  int hostUserPick;
	  
	  String rules ="Rules:## total user 2  :   GuestPlayer     hostPlayer\n"+
				 "## GuestPlayer  always start\n"+
				 "## Any player pick 1 or 2 or 3 or 4 stick at a time\n"+
				 "## The player who will pick last stick will looser...";
				 
				 
	   System.out.println("____________________________________"); 
	   System.out.println(rules);
	   System.out.println("____________________________________"); 
	  System.out.println("Total Stick " + totalStick);
	  //round1#####
	    System.out.println("****************round#1**********");
		 System.out.println("guest pick stick bw (1-4)");
		//guest pick
		 guestUserPick = scan.nextInt();
		 totalStick = totalStick - guestUserPick;
		 System.out.println("after guest pick remaining stick = " + totalStick);
		 
		//host pick
		hostUserPick = MAGIC_LOGIC_NUMBER - guestUserPick;
		System.out.println("Host stick pick is   " + hostUserPick);
		totalStick = totalStick - hostUserPick;
		System.out.println("after host pick remaining stick = " + totalStick);
		
		
	  //round2#####
	    System.out.println("****************round#2**********");
	   		 System.out.println("guest pick stick bw (1-4)");
		//guest pick
		 guestUserPick = scan.nextInt();
		 totalStick = totalStick - guestUserPick;
		 System.out.println("after guest pick remaining stick = " + totalStick);
		 
		//host pick
		hostUserPick = MAGIC_LOGIC_NUMBER - guestUserPick;
		System.out.println("Host stick pick is   " + hostUserPick);
		totalStick = totalStick - hostUserPick;
		System.out.println("after host pick remaining stick = " + totalStick);

	  //round3#####
	    System.out.println("****************round#3**********");
	  
		 System.out.println("guest pick stick bw (1-4)");
		//guest pick
		 guestUserPick = scan.nextInt();
		 totalStick = totalStick - guestUserPick;
		 System.out.println("after guest pick remaining stick = " + totalStick);
		 
		//host pick
		hostUserPick = MAGIC_LOGIC_NUMBER - guestUserPick;
		System.out.println("Host stick pick is   " + hostUserPick);
		totalStick = totalStick - hostUserPick;
		System.out.println("after host pick remaining stick = " + totalStick);

		
	  //round4#####
	    System.out.println("****************round#4**********");
		 System.out.println("guest pick stick bw (1-4)");
		//guest pick
		 guestUserPick = scan.nextInt();
		 totalStick = totalStick - guestUserPick;
		 System.out.println("after guest pick remaining stick = " + totalStick);
		 
		//host pick 
		hostUserPick = MAGIC_LOGIC_NUMBER - guestUserPick;
		System.out.println("Host stick pick is   " + hostUserPick);
		totalStick = totalStick - hostUserPick;
		System.out.println("after host pick remaining stick = " + totalStick);

		
		//we know 
	  System.out.println("__________________________________");
      System.out.println("Guest user Lose the game");
	  System.out.println("try again.....for  better luck ");
	  System.out.println("__________________________________");
 
	  
	}//end main

}//end class