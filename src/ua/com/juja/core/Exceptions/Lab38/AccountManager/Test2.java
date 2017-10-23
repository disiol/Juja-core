package ua.com.juja.core.Exceptions.Lab38.AccountManager;

import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class Test2 {
    private static boolean actualResultTransfer;
    private int accountSum0;
    private int accountSum1;
    private int accountSum2;
    private Account[] testAccounts = new Account[3];


    @Before
    public void call() {
        int[] testDelta = {100, 343, 245};

        this.accountSum0 = 10;
        this.accountSum1 = 25;
        this.accountSum2 = 64;

        Account noExceptionAccount0 = new Account(accountSum0) {
            @Override
            public void change(int delta) throws TryAgainException, BlockAccountException {
                this.amount = amount + delta;
            }
        };


        Account noExceptionAccount1 = new Account(accountSum1) {
            @Override
            public void change(int delta) throws TryAgainException, BlockAccountException {
                amount = amount + delta;
            }
        };


        Account blockExceptionAccount = new Account(accountSum2) {
            @Override
            public void change(int delta) throws TryAgainException, BlockAccountException {
                throw new BlockAccountException();
            }
        };
        testAccounts[0] = noExceptionAccount0;
        testAccounts[1] = noExceptionAccount1;
        testAccounts[2] = blockExceptionAccount;

        // call
        actualResultTransfer = AccountManager.transfer(testAccounts, testDelta);

        //check


    }

    @Test

    public void checkEquals() {
        int expected = accountSum0;
        int actual = testAccounts[0].getAmount();
        assertEquals("Account should not be changed and should be equals " + expected, expected, actual);
    }

    @Test

    public void checkEquals_2() {
        int expected = accountSum1;
        int actual = testAccounts[1].getAmount();
        assertEquals("Account should not be changed and should be equals " + expected, expected, actual);
    }

    @Test

    public void checkEquals_3() {
        int expected = accountSum2;
        int actual = testAccounts[2].getAmount();
        assertEquals("Account should not be changed and should be equals " + expected, expected, actual);
    }

    @Test
    public void checkTrue() {
        assertFalse("should to be result transfer is false but found true", actualResultTransfer);
    }
}