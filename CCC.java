//@author Micah Wasmuth

import java.util.*;
import java.io.*;

public class CCC {
	static String option;
	
	public static void main(String[] args) throws InterruptedException {
		animation();
		enterOption();
		choice(option);
	}
	
	public static void animation() throws InterruptedException {
		String s1 = "$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$\n$                                                     $\n$                                                     $\n$    Written by: Micah Wasmuth                        $\n$                                                     $\n$                                                     $\n$                CrEdIt CaRd ChEcKeR                  $\n$                                                     $\n$                                                     $\n$                                                     $\n$                           1234123412341234          $\n$                                                     $\n$                              1/23      123          $\n$                                                     $\n$                                                     $\n$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$";
		
		String s2 = "_______________________________________________________\n|                                                     |\n|                                                     |\n|    Written by: Micah Wasmuth                        |\n|                                                     |\n|                                                     |\n|                cReDiT cArD cHeCkEr                  |\n|                                                     |\n|                                                     |\n|                                                     |\n|                           4312431243124312          |\n|                                                     |\n|                              1/23      123          |\n|                                                     |\n|                                                     |\n|_____________________________________________________|";
		
		System.out.println();
		
		for (int i = 0; i < 10; i++) {
			System.out.print("\033[H\033[2J");  
    			System.out.flush();
			
			System.out.print(s1);
			Thread.sleep(500);
			
			System.out.print("\033[H\033[2J");  
    			System.out.flush();
			
			System.out.print(s2);
			Thread.sleep(500);
		}
		System.out.print("\033[H\033[2J");  
    		System.out.flush();
			
	}
	
	public static void enterOption() {
		Scanner in = new Scanner(System.in);
		
		System.out.println();
		System.out.println("1. Card Checker");
		System.out.println("2. Help");
		System.out.println("3. Credits");
		System.out.println("4. Exit");
		System.out.println();
		System.out.print("Please choose an option: ");
		option = in.nextLine();
		System.out.println();
	}
	
	public static void choice(String o) throws InterruptedException {
		Scanner in = new Scanner(System.in);
		switch (o) {
			case "1" :
				Check.main();
				System.out.println();
				System.out.print("Press enter to continue: ");
				in.nextLine();
				System.out.print("\033[H\033[2J");  
    				System.out.flush();
				enterOption();
				choice(option);
				break;
			
			case "2" :
				System.out.println("This program verifies if a credit card number\nyou enter in is valid. This does not mean it\nis an actual card, but it does mean that it can\nbe. It has been tested with MasterCard, Discover,\nVisa, and American Express card types. All you have to\ndo is enter in a number and it will automatically\ncheck if it is valid or not.");
				System.out.println();
				System.out.print("Press enter to continue: ");
				in.nextLine();
				System.out.print("\033[H\033[2J");  
    				System.out.flush();
				enterOption();
				choice(option);
				break;
			
			case "3" :
				System.out.println("This program was created by Micah Wasmuth and\nMicah Wasmuth only. Do not copy this code without\nmy permission. For any suggestions please email me\nat micahwasmuth@gmail.com. Thanks!");
				System.out.println();
				System.out.print("Press enter to continue: ");
				in.nextLine();
				System.out.print("\033[H\033[2J");  
    				System.out.flush();
				enterOption();
				choice(option);
				break;
				
			case "4" :
				break;
			
			default :
				System.out.println("Invalid option.");
				Thread.sleep(1250);
				System.out.print("\033[H\033[2J");  
    				System.out.flush();
				enterOption();
				choice(option);
				break;
		}
	}
}





class Check {
	private static int[] card;
	private static String input;

	public static void main() {
		enterCard();
		assemble(input);
		firstCheck(card);
	}

	public static void enterCard() {
		Scanner in = new Scanner(System.in);
		do {
			System.out.print("Please enter in a credit card number (13, 15, or 16 digits): ");
			input = in.nextLine();
			System.out.println();
		}
		while (input.length() != 13 && input.length() != 15 && input.length() != 16);
		
		card = new int[input.length()];
	}
	
	public static void assemble(String s) {
		String[] parts = s.split("");
		
		for(int i = 0; i < s.length(); i++) {
   			card[i] = Integer.parseInt(parts[i]);
		}
	}
	
	public static void firstCheck(int[] arr) {
		switch (arr[0]) {
			case 4 :
				if (input.length() == 15) {
					System.out.println("That is an invalid credit card number.");	
				}
				else {
					
				}
				break;
			
			case 5 :
				if (arr[1] == 0 || arr[1] == 1 || arr[1] == 2 || arr[1] == 3 || arr[1] == 4 || arr[1] == 5) {
					if (input.length() == 16) {
						
					}
					else {
						System.out.println("That is an invalid credit card number.");
					}
				}
				else {
					System.out.println("That is an invalid credit card number.");
				}
				break;
				
			case 3 :
				if (arr[1] == 4 || arr[1] == 7) {
					if (input.length() == 15) {
						
					}
					else {
						System.out.println("That is an invalid credit card number.");
					}
				}
				else {
					System.out.println("That is an invalid credit card number.");
				}
				break;
				
			case 6 :
				if (input.length() == 16) {

				}
				else {
					System.out.println("That is an invalid credit card number.");
				}
				break;
			
			default :
				System.out.println("That is an invalid credit card number.");
				break;
		}
	}
}





