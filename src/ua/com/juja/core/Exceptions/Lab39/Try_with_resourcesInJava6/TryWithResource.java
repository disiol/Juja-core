package ua.com.juja.core.Exceptions.Lab39.Try_with_resourcesInJava6;

public class TryWithResource {
    public static void twoResource(AutoCloseableFactory factoryA, AutoCloseableFactory factoryB, TryBody body) throws Throwable {
     //TODO
        AutoCloseable a = null;

        AutoCloseable b = null;


        try {
            a = factoryA.create();
            body.runBody();
            try {
                try {
                    b = factoryB.create();
                } catch (Throwable throwable) {
                    throwable.printStackTrace();
                }
            } catch (Throwable bodyExB) {
                try {
                    if (b!= null) {
                        b.close();
                    }
                } catch (Throwable closeExB) {
                    bodyExB.addSuppressed(closeExB);
                }

                throw bodyExB;
            }
        } catch (Throwable bodyExA) {
            try {
                if(a !=null) {
                    a.close();
                }

            } catch (Throwable closeExA) {
                bodyExA.addSuppressed(closeExA);
            }

            throw bodyExA;
        }







    }
}

