import org.junit.Test;
import ua.com.juja.core.Exceptions.Lab39.Try_with_resourcesInJava6.AutoCloseableFactory;
import ua.com.juja.core.Exceptions.Lab39.Try_with_resourcesInJava6.TryBody;
import ua.com.juja.core.Exceptions.Lab39.Try_with_resourcesInJava6.TryWithResource;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static junit.framework.TestCase.assertEquals;

public class TestTryBody {
    @Test
    public void main() throws Throwable {
        //prepare
        final List<String> actualHistoryCall = new ArrayList<String>();
        final List<String> expectedExceptionTextAndOrder = new ArrayList<String>();
        expectedExceptionTextAndOrder.add("Error TryBody.runBody");
        expectedExceptionTextAndOrder.add("Error closeB");


        List<String> expectedHistoryCall = Arrays.asList("factoryA.createA", "factoryB.createB", "TryBody.runBody", "B.close", "A.close");

        final AutoCloseable resourceA = new AutoCloseable() {
            @Override
            public void close() throws Exception {
                actualHistoryCall.add("A.close");

            }
        };

        final AutoCloseable resourceB = new AutoCloseable() {
            @Override
            public void close() throws Exception {
                actualHistoryCall.add("B.close");
                throw new Error(expectedExceptionTextAndOrder.get(1));
            }
        };

        AutoCloseableFactory factoryA = new AutoCloseableFactory() {
            @Override
            public AutoCloseable create() throws Throwable {
                actualHistoryCall.add("factoryA.createA");
                return resourceA;

            }


        };

        AutoCloseableFactory factoryB = new AutoCloseableFactory() {
            @Override
            public AutoCloseable create() {
                actualHistoryCall.add("factoryB.createB");
                return resourceB;
            }


        };

        TryBody tryBody = new TryBody() {
            @Override
            public void runBody() {
                actualHistoryCall.add("TryBody.runBody");
                throw new Error(expectedExceptionTextAndOrder.get(0));
            }
        };

        //call and  check
        try {
            TryWithResource.twoResource(factoryA, factoryB, tryBody);
        } catch (Error e) {
            assertEquals("Not correct main exception should to be ", expectedExceptionTextAndOrder.get(0), e.getMessage());

            assertEquals("Should to be suppressed exceptions", 1, e.getSuppressed().length);
             assertEquals("Should to be suppressed exceptions ",expectedExceptionTextAndOrder.get(1),e.getSuppressed().length);
        }

             assertEquals("Not correct order call should be ",expectedHistoryCall,actualHistoryCall);

        System.out.print("OK");
    }
}

