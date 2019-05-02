package TestCase;

import java.math.BigDecimal;

import org.junit.Assert;
import org.junit.Test;

import constant.CardTypeInterestRate;
import dao.ClearentDAO;

public class TestCaseCalculateInterest {
	 	@Test(expected = RuntimeException.class)
	    public final void addCardDetailTestCase() {	 		
	 		Assert.assertNotNull(null, ClearentDAO.addCardDetail(CardTypeInterestRate.VISA,new BigDecimal(100)));
	    }
	    
}
