package ua.com.juja.core.Exceptions.Lab38.AccountManager;

public class AccountManager {
    public static boolean transfer(Account[] accounts, int[] delta) {
        for (int k = 0; k < accounts.length; k++){
            try {
                accounts[k].change(delta[k]);
            } catch (TryAgainException e) {
                e.printStackTrace();
            } catch (BlockAccountException e) {
                e.printStackTrace();
                return false;
            }
        }
        /*BODY*/

        return true;
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