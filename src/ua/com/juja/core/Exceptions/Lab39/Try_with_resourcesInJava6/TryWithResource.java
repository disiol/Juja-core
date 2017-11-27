package ua.com.juja.core.Exceptions.Lab39.Try_with_resourcesInJava6;
public class TryWithResource {
    public static void twoResource(AutoCloseableFactory factoryA, AutoCloseableFactory factoryB, TryBody body) throws Throwable {
        try (AutoCloseable a = factoryA.create();

             AutoCloseable b = factoryB.create()

        ) {

            body.runBody();

        }
    }
}

interface AutoCloseableFactory {
    public AutoCloseable create() throws Throwable;
}

interface TryBody {
    public void runBody() throws Throwable;
}