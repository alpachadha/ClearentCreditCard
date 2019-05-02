package ClearentInterestService;

import java.math.BigDecimal;
import java.util.List;

import bean.CreditCard;
import bean.Person;
import bean.Wallet;
import service.ClearentServiceImpl;

public class ClearentInterestcalculation {
	/**
	 * 
	 * @param personList
	 * @param totalInterest
	 */
	public static void interestCalculation(List<Person> personList, BigDecimal totalInterest) {
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
	 * Test case 1
	 */
	public static void testCase1() {
		
		System.out.println("****************TEST CASE 1*************************************");
		List<Person> personList = ClearentServiceImpl.addTestCase1data();		
		BigDecimal totalInterest = new BigDecimal(0);			
		//calculate the Interest
		ClearentInterestcalculation.interestCalculation(personList, totalInterest);
		
		
	}

	
	
	
	/**
	 * Test case 1
	 */
	public static void testCase2() {
		
		System.out.println("****************TEST CASE 2*************************************");
		List<Person> personList = ClearentServiceImpl.addTestCase2data();		

		
		BigDecimal totalInterest = new BigDecimal(0);	
		
		//calculate the Interest
		ClearentInterestcalculation.interestCalculation(personList, totalInterest);
		
		
	}

	
	
	/**
	 * Test case 1
	 */
	public static void testCase3() {
		
		System.out.println("****************TEST CASE 3*************************************");
		List<Person> personList = ClearentServiceImpl.addTestCase3data();				
		BigDecimal totalInterest2 = new BigDecimal(0);			
		//calculate the Interest
		ClearentInterestcalculation.interestCalculation(personList, totalInterest2);
		
		
	}

	
	
	
	
}
