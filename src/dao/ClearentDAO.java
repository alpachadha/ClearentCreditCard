package dao;

import java.math.BigDecimal;
import java.util.List;
import java.util.Vector;

import ClearentInterestService.ClearentInterestcalculation;
import bean.CreditCard;
import bean.Person;
import bean.Wallet;
import constant.CardTypeInterestRate;

public class ClearentDAO {
	
	public static List<Person> addTestCase1data() {
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
		return personList;
	}
	
	
	public static List<Person> addTestCase2data() {
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
		return personList;
	}
	
	private static List<Person> addTestCase3data() {
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
		ClearentInterestcalculation.interestCalculation(personList, totalInterest);
		
		
		
		
		
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
		return personList;
	}
	
	/**
	 * set up Wallet Details
	 * @param person
	 * @param walletList
	 * @param emailId
	 * @return
	 */
	public static Person addWalletDetails(Person person, List<Wallet>  walletList, String emailId ) {	
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
	public static CreditCard addCardDetail(CardTypeInterestRate visaTpe, BigDecimal balance) {
		CreditCard creditCard = new CreditCard();
		creditCard.setBalance(balance);
		creditCard.setCardType(visaTpe);
		return creditCard;
	}

}
