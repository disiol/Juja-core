package ua.com.juja.core.Exceptions.Lab39.Try_with_resourcesInJava6;

public class TryWithResource {
    public static void twoResource(AutoCloseableFactory factoryA, AutoCloseableFactory factoryB, TryBody body) throws Throwable {

        AutoCloseable a = null;

        AutoCloseable b = null;


        try {
            a = factoryA.create();
            try {
                b = factoryB.create();
            } catch (Throwable throwable) {
                try {
                    if (b!= null) {
                        b.close();
                    }
                } catch (Throwable closeEx) {
                    closeEx.addSuppressed(closeEx);
                }

                throw throwable;
            }
            body.runBody();
        } catch (Throwable bodyEx) {
            try {
                if(a !=null) {
                    a.close();
                }

            } catch (Throwable closeEx) {
                bodyEx.addSuppressed(closeEx);
            }

            throw bodyEx;
        }







    }
}

