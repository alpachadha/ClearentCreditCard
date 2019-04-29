package main;

import java.math.BigDecimal;
import java.util.List;
import java.util.Vector;

import bean.CreditCard;
import bean.Person;
import bean.Wallet;
import constant.CardTypeInterestRate;

public class ClearentCreditCard {
	
  
	
	public static void main(String args[]) {
		//1 person has 1 wallet and 3 cards (1 Visa, 1 MC 1 Discover) – 
		//Each Card has a balance of $100 – calculate the total interest (simple interest) for this person and per card. 
		testCase1();
		//1 person has 2 wallets  Wallet 1 has a Visa and Discover , wallet 2 a MC -  
		//each card has $100 balance - calculate the total interest(simple interest) for this person and interest per wallet
		testCase2();
		
		//2 people have 1 wallet each,  person 1 has 1 wallet , with 2 cards MC and visa person 2 has 1 wallet – 1 visa and 1 MC -  
		//each card has $100 balance - calculate the total interest(simple interest) for each person and interest per wallet
		testCase3();
		
	}
	/**
	 * Test case 1
	 */
	private static void testCase1() {
		
		System.out.println("****************TEST CASE 1*************************************");
		Wallet wallet = new Wallet();		
		List<Person> personList = new Vector<Person>();
		List<Wallet> walletList = new Vector<Wallet>();
		Person person = new Person();
		//data set up
		
		wallet.setWalletId(10001);
		CreditCard creditCard = null;
		List<CreditCard> cardList = new  Vector<CreditCard>();		
		
		creditCard = addCardDetail(CardTypeInterestRate.VISA, new BigDecimal(100));
		cardList.add(creditCard);
		
		creditCard = addCardDetail(CardTypeInterestRate.MASTER_CARD,new BigDecimal(100));
		cardList.add(creditCard);
		
		creditCard = addCardDetail(CardTypeInterestRate.DISCOVER,new BigDecimal(100));
		cardList.add(creditCard);
		
		wallet.setCreditCard(cardList);
		
		walletList.add(wallet);
		
		person = addWalletDetails(person,walletList,"test1@Clearent.com");	
		personList.add(person);

		
		BigDecimal totalInterest = new BigDecimal(0);	
		
		//calculate the Interest
		interestCalculation(personList, totalInterest);
		
		
	}
	
	
	/**
	 * Test case 1
	 */
	private static void testCase2() {
		
		System.out.println("****************TEST CASE 2*************************************");
		Wallet wallet = new Wallet();		
		List<Person> personList = new Vector<Person>();
		List<Wallet> walletList = new Vector<Wallet>();
		Person person = new Person();
		
		
		//data set up		
		wallet.setWalletId(10001);
		CreditCard creditCard = null;
		List<CreditCard> cardList = new  Vector<CreditCard>();		
		
		creditCard = addCardDetail(CardTypeInterestRate.VISA, new BigDecimal(100));
		cardList.add(creditCard);
		
		creditCard = addCardDetail(CardTypeInterestRate.DISCOVER,new BigDecimal(100));
		cardList.add(creditCard);
		
		wallet.setCreditCard(cardList);
		
		walletList.add(wallet);
		
		
		
		Wallet wallet2 = new Wallet();	
		//data set up		
		wallet2.setWalletId(10002);
		CreditCard creditCard2 = null;
		List<CreditCard> cardList2 = new  Vector<CreditCard>();		
		
		creditCard2 = addCardDetail(CardTypeInterestRate.MASTER_CARD, new BigDecimal(100));
		cardList2.add(creditCard);
		
		creditCard2 = addCardDetail(CardTypeInterestRate.MASTER_CARD,new BigDecimal(100));
		cardList2.add(creditCard);
		wallet2.setCreditCard(cardList2);
		
		walletList.add(wallet2);
		
		person = addWalletDetails(person,walletList,"test2@Clearent.com");	
		personList.add(person);

		
		BigDecimal totalInterest = new BigDecimal(0);	
		
		//calculate the Interest
		interestCalculation(personList, totalInterest);
		
		
	}
	
	/**
	 * Test case 1
	 */
	private static void testCase3() {
		
		System.out.println("****************TEST CASE 3*************************************");
		Wallet wallet = new Wallet();		
		List<Person> personList = new Vector<Person>();
		List<Wallet> walletList = new Vector<Wallet>();
		Person person = new Person();
		
		
		//data set up		
		wallet.setWalletId(10003);
		CreditCard creditCard = null;
		List<CreditCard> cardList = new  Vector<CreditCard>();				
		creditCard = addCardDetail(CardTypeInterestRate.MASTER_CARD, new BigDecimal(100));
		cardList.add(creditCard);
		
		creditCard = addCardDetail(CardTypeInterestRate.MASTER_CARD,new BigDecimal(100));
		cardList.add(creditCard);
		
		wallet.setCreditCard(cardList);
		
		walletList.add(wallet);
		
		person = addWalletDetails(person,walletList,"test3.1@Clearent.com");	
		personList.add(person);
		
		BigDecimal totalInterest = new BigDecimal(0);			
		//calculate the Interest
		interestCalculation(personList, totalInterest);
		
		
		
		
		
		Wallet wallet2 = new Wallet();	
		person = new Person();
		List<Wallet> walletList2 = new Vector<Wallet>();
		//data set up		
		wallet2.setWalletId(10004);
		CreditCard creditCard2 = null;
		List<CreditCard> cardList2 = new  Vector<CreditCard>();		
		
		creditCard2 = addCardDetail(CardTypeInterestRate.VISA, new BigDecimal(100));
		cardList2.add(creditCard);
		
		creditCard2 = addCardDetail(CardTypeInterestRate.VISA,new BigDecimal(100));
		cardList2.add(creditCard);
		
		wallet2.setCreditCard(cardList2);
		
		walletList2.add(wallet2);
		
		
		person = addWalletDetails(person,walletList2,"test3.2@Clearent.com");	
		personList.add(person);
		
		
		BigDecimal totalInterest2 = new BigDecimal(0);	
		
		//calculate the Interest
		interestCalculation(personList, totalInterest2);
		
		
	}
	/**
	 * 
	 * @param personList
	 * @param totalInterest
	 */
	private static void interestCalculation(List<Person> personList, BigDecimal totalInterest) {
		for(Person personDetail : personList) {		
		
			for(Wallet walletInterest : personDetail.getWalletList()) {
				
				for (CreditCard card : walletInterest.getCreditCard()) {
					BigDecimal simpleInterest = new BigDecimal(0);
					//formula for simple Interest = Principal*rate*time
					simpleInterest = (card.getBalance().multiply((new BigDecimal((card.getCardType().getValue())))).multiply(new BigDecimal(1)).divide(new BigDecimal(100)));
					totalInterest = totalInterest.add(simpleInterest);				
				}
						
				System.out.println("Person : "+personDetail.getEmailAddress() +" Wallet  : " +walletInterest.getWalletId()+ "  Interest-> " + totalInterest);
			}
		
		}
		
	}
	
	
	/**
	 * set up Wallet Details
	 * @param person
	 * @param walletList
	 * @param emailId
	 * @return
	 */
	private static Person addWalletDetails(Person person, List<Wallet>  walletList, String emailId ) {	
		person.setWalletList(walletList);
		person.setEmailAddress(emailId);//extra paramter for person Info, we can add more details 			
		return person;
	}
	
	
	/**
	 * set balance and card type interest details
	 * @param visaTpe
	 * @param balance
	 * @return
	 */
	private static CreditCard addCardDetail(CardTypeInterestRate visaTpe, BigDecimal balance) {
		CreditCard creditCard = new CreditCard();
		creditCard.setBalance(balance);
		creditCard.setCardType(visaTpe);
		return creditCard;
	}

}
