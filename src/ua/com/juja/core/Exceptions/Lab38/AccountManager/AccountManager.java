package ua.com.juja.core.Exceptions.Lab38.AccountManager;

public class AccountManager {
    public static boolean transfer(Account[] accounts, int[] delta) {
        for (int k = 0; k < accounts.length; k++) {
            try {
                accounts[k].change(delta[k]);
            } catch (TryAgainException e) {
                e.printStackTrace();
                k -= 1;
            } catch (BlockAccountException e) {
                e.printStackTrace();
                cacheBack(accounts, delta, k);
                return false;
            }
        }
        /*BODY*/

        return true;
    }

    public static void cacheBack(Account[] accounts, int[] delta, int k) {
        for (int j = k - 1; j > -1; j--) {
            try {
                accounts[j].change(-delta[j]);
            } catch (TryAgainException ex) {
                j += 1;
            } catch (Exception ex) {

            }
        }
    }
}

abstract class Account {
    protected int amount;

    public Account(int amount) {
        this.amount = amount;
    }

    public abstract void change(int delta) throws TryAgainException, BlockAccountException;

    public int getAmount() {
        return amount;
    }
}


class TryAgainException extends Exception {

}

class BlockAccountException extends Exception {
}