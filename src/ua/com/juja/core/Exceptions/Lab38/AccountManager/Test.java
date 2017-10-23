package ua.com.juja.core.Exceptions.Lab38.AccountManager;

import org.junit.Before;

import static junit.framework.TestCase.assertEquals;
import static org.junit.Assert.assertTrue;


public class Test {
    private static boolean actualResultTransfer;
    Account[] testAccounts = new Account[3];
    int[] testDelta = {100, -343, 245};
    private int amountAcc1;
    private int amountAcc2;
    private int amountAcc3;


    @Before
    public void call() {

        amountAcc1 = 10;
        amountAcc2 = 5;
        amountAcc3 = 25;


        Account account1 = new Account(amountAcc1) {
            @Override
            public void change(int delta) throws TryAgainException, BlockAccountException {
                amount = amount + delta;
            }
        };

        Account account2 = new Account(amountAcc2) {
            @Override
            public void change(int delta) throws TryAgainException, BlockAccountException {
                amount = amount + delta;
            }
        };

        Account account3 = new Account(amountAcc3) {
            @Override
            public void change(int delta) throws TryAgainException, BlockAccountException {

                amount = amount + delta;
            }
        };

        testAccounts[0] = account1;
        testAccounts[1] = account2;
        testAccounts[2] = account3;


        actualResultTransfer = AccountManager.transfer(testAccounts, testDelta);

    }

    //check

    @org.junit.Test

    public void checkForEquals_1() {
        int expected = testDelta[0] + amountAcc1;
        int actual = testAccounts[0].getAmount();
        assertEquals("Account should be equals " + expected, expected, actual);
    }

    @org.junit.Test

    public void checkForEquals_2() {
        int expected = testDelta[1] + amountAcc2;
        int actual = testAccounts[1].getAmount();
        assertEquals("Account should be equals " + expected, expected, actual);
    }

    @org.junit.Test

    public void checkForEquals_3() {
        int expected = testDelta[2] + amountAcc3;
        int actual = testAccounts[2].getAmount();
        assertEquals("Account should be equals " + expected, expected, actual);
    }

    @org.junit.Test

    public void checkTrue() {
        assertTrue("should to be result transfer is true but found false", actualResultTransfer);
    }
}
