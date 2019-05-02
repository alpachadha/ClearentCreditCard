package main;

import ClearentInterestService.ClearentInterestcalculation;

public class ClearentCreditCard {
	
  
	
	public static void main(String args[]) {
		ClearentInterestcalculation clearentInterestcalculation = new ClearentInterestcalculation();
		//1 person has 1 wallet and 3 cards (1 Visa, 1 MC 1 Discover) – 
		//Each Card has a balance of $100 – calculate the total interest (simple interest) for this person and per card. 
		clearentInterestcalculation.testCase1();
		//1 person has 2 wallets  Wallet 1 has a Visa and Discover , wallet 2 a MC -  
		//each card has $100 balance - calculate the total interest(simple interest) for this person and interest per wallet
		clearentInterestcalculation.testCase2();
		
		//2 people have 1 wallet each,  person 1 has 1 wallet , with 2 cards MC and visa person 2 has 1 wallet – 1 visa and 1 MC -  
		//each card has $100 balance - calculate the total interest(simple interest) for each person and interest per wallet
		clearentInterestcalculation.testCase3();
		
	}
	

}
