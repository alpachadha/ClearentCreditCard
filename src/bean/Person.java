package bean;

import java.util.List;

public class Person {
	private List<Wallet> walletList;
	private String emailAddress;
	
	/**
	 * @return the personId
	 */
	public List<Wallet> getWalletList() {
		return walletList;
	}
	/**
	 * @param personId the personId to set
	 */
	public void setWalletList(List<Wallet> walletList) {
		this.walletList = walletList;
	}
	/**
	 * @return the emailAddress
	 */
	public String getEmailAddress() {
		return emailAddress;
	}
	/**
	 * @param emailAddress the emailAddress to set
	 */
	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}
	
	
	
	

}
