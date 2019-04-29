package bean;

import java.math.BigDecimal;

import constant.CardTypeInterestRate;

public class CreditCard {
	BigDecimal interestRate;
	BigDecimal balance;
	private CardTypeInterestRate cardType;
	
	/**
	 * @return the interestRate
	 */
	public BigDecimal getInterestRate() {
		return interestRate;
	}
	/**
	 * @param interestRate the interestRate to set
	 */
	public void setInterestRate(BigDecimal interestRate) {
		this.interestRate = interestRate;
	}
	/**
	 * @return the balance
	 */
	public BigDecimal getBalance() {
		return balance;
	}
	/**
	 * @param balance the balance to set
	 */
	public void setBalance(BigDecimal balance) {
		this.balance = balance;
	}
	/**
	 * @return the cardType
	 */
	public CardTypeInterestRate getCardType() {
		return cardType;
	}
	/**
	 * @param cardType the cardType to set
	 */
	public void setCardType(CardTypeInterestRate cardType) {
		this.cardType = cardType;
	}

	
	
	
}
