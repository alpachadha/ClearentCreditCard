package constant;

import java.util.HashMap;
import java.util.Map;

//set card type with interest value

public enum CardTypeInterestRate {
	 	VISA(10),
	 	MASTER_CARD(5),
	    DISCOVER(1);

	    private int value;
	    private static Map map = new HashMap<>();

	    private CardTypeInterestRate(int value) {
	        this.value = value;
	    }

	    static {
	        for (CardTypeInterestRate cardType : CardTypeInterestRate.values()) {
	            map.put(cardType.value, cardType);
	        }
	    }

	    public static CardTypeInterestRate valueOf(int cardType) {
	        return (CardTypeInterestRate) map.get(cardType);
	    }

	    public int getValue() {
	        return value;
	    }
}
