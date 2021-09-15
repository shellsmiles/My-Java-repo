/* Class: CMSC203 CRN 22381
 Program: Assignment #1
 Instructor: Prof. Alexander
 Programmer: Yana Li
 Summary of Description: Guide users to diagnosing the WiFi problem step by step.
*/


import java.util.Scanner;

public class WiFiDiagnosis {

	public static void main(String[] args) {
		
		System.out.println("If you have a problem with internet connectivity, " +
						   "this WiFi Diagnosis might work.");
		Scanner kb= new Scanner (System.in);
		
		
		// the first step: 
		System.out.println ("First step: reboot your computer. \n" +
				            "Are you able to connect with the Internet? (yes or no)");
		
		String answer1= kb. nextLine ();
		if ( answer1.equalsIgnoreCase ("yes") )
			System.out.println ("Checking the router's cables seemed to work.");

		
		 // the second step:
		else if ( answer1.equalsIgnoreCase ("no"))
			System.out.println ("Second step: reboot your computer. \n" +
									"Now are you able to connect with the Internet? (yes or no)"); 	
		
		String answer2= kb. nextLine ();
		if ( answer2.equalsIgnoreCase ("yes") )	
			System.out.println ("Checking the router's cables seemed to work."); 
		
		
		
		// the third step:
		else if (answer2.equalsIgnoreCase ("no"))
			System.out.println ("Third step: make sure the cables to your router are plugged" +
					           " in firmly and your router is getting power. \n" +
							   "Now are you able to connect with the Internet? (yes or no)");
		
		String answer3= kb. nextLine ();
		if ( answer3.equalsIgnoreCase ("yes") )
			System.out.println ("Checking the router's cables seemed to work.");
		 
		
		
		// the forth step:
		else if (answer3.equalsIgnoreCase ("no"))
			System.out.println ("Fourth step: move your computer closer to your router. \n" +
							    "Now are you able to connect with the Internet? (yes or no)");
		
		String answer4= kb. nextLine ();
		if ( answer4.equalsIgnoreCase ("yes") )
			System.out.println ("Checking the router's cables seemed to work.");
		 	
		
		
		// the fifth step:
		else if (answer3.equalsIgnoreCase ("no"))
			System.out.println ("Fifth step: contact your ISP. \n" +
							    "Make sure your ISP is hooked up to your router.");
	}
}
