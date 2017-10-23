package ua.com.juja.core.Exceptions.Lab38.AccountManager;

public class AccountManager {
    public static boolean transfer(Account[] accounts, int[] delta) {
        for (int index = 0; index < accounts.length; index++) {
            try {
                accounts[index].change(delta[index]);
            } catch (TryAgainException e) {
                e.printStackTrace();
                index -= 1;
            } catch (BlockAccountException e) {
                e.printStackTrace();
                cacheBack(accounts, delta, index);
                return false;
            }
        }
        /*BODY*/

        return true;
    }

    public static void cacheBack(Account[] accounts, int[] delta, int index) {
        for (int indexCacheBack = index - 1; indexCacheBack > -1; indexCacheBack--) {
            try {
                accounts[indexCacheBack].change(-delta[indexCacheBack]);
            } catch (TryAgainException ex) {
                indexCacheBack += 1;
            } catch (Exception ex) {
                //do nothing

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