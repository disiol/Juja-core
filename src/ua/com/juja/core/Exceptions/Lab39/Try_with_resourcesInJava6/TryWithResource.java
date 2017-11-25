package ua.com.juja.core.Exceptions.Lab39.Try_with_resourcesInJava6;

public class TryWithResource {
    public static void twoResource(AutoCloseableFactory factoryA, AutoCloseableFactory factoryB, TryBody body) throws Throwable {


        AutoCloseable a = factoryA.create();
        try {
            a.close();
        } catch (Throwable e) {
            e.printStackTrace();
        }
        AutoCloseable b = factoryB.create();
        try {
            b.close();
        } catch (Throwable e) {
            e.printStackTrace();
        }

        try {
            body.runBody();

        } catch (Throwable throwable) {
            throwable.printStackTrace();
        }
    }
}

interface AutoCloseableFactory {
    public AutoCloseable create() throws Throwable;
}

interface TryBody {
    public void runBody() throws Throwable;
}