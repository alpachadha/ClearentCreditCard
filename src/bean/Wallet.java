package bean;

import java.util.List;

public class Wallet {
	private Integer walletId;
	private List<CreditCard> creditCard;
	
	/**
	 * @return the walletId
	 */
	public Integer getWalletId() {
		return walletId;
	}
	/**
	 * @param walletId the walletId to set
	 */
	public void setWalletId(Integer walletId) {
		this.walletId = walletId;
	}

	/**
	 * @return the creditCard
	 */
	public List<CreditCard> getCreditCard() {
		return creditCard;
	}
	/**
	 * @param creditCard the creditCard to set
	 */
	public void setCreditCard(List<CreditCard> creditCard) {
		this.creditCard = creditCard;
	}
	
}
