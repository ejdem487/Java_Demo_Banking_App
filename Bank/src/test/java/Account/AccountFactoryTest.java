package Account;

import junit.framework.TestCase;
import org.junit.Test;

public class AccountFactoryTest extends TestCase {
    @Test
    public void testCreatePremiumAccount() {
        Account testacc = AccountFactory.createPremiumAccount();
        assertEquals(testacc.getAccountNumber(),1200);
    }
}