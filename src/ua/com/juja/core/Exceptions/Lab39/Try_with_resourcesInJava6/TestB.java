package ua.com.juja.core.Exceptions.Lab39.Try_with_resourcesInJava6;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static junit.framework.TestCase.assertEquals;

public class TestB {

    @Test

    public void main() {
        //prepare
        final List<String> actualHistoryCall = new ArrayList<String>();
        final List<String> expectedExceptionTextAndOrder = new ArrayList<String>();
        expectedExceptionTextAndOrder.add("Error factoryB.createB");
        expectedExceptionTextAndOrder.add("Error closeA");
        List<String> expectedHistoryCall = Arrays.asList("factoryA.createA", "factoryB.createB", "A.close");

        final AutoCloseable resourceA = new AutoCloseable() {
            @Override
            public void close() throws Exception {
                actualHistoryCall.add("A.close");
                throw new Error(expectedExceptionTextAndOrder.get(1));
            }
        };

        final AutoCloseable resourceB = new AutoCloseable() {
            @Override
            public void close() throws Exception {
                actualHistoryCall.add("B.close");
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
                throw new Error(expectedExceptionTextAndOrder.get(0));
            }


        };

        TryBody tryBody = new TryBody() {
            @Override
            public void runBody() {
                actualHistoryCall.add("TryBody.runBody");
                //NOP
            }
        };

        //call and  check
        try {
            TryWithResource.twoResource(factoryA, factoryB, tryBody);
        } catch (Throwable e) {

            assertEquals("Not correct main exception", expectedExceptionTextAndOrder.get(0).toString(), e.getMessage());

            assertEquals("Should be suppressed exceptions", 1, e.getSuppressed().length);

            if (!expectedExceptionTextAndOrder.get(1).equals(e.getSuppressed()[0].getMessage()))
                assertEquals("Not correct suppressed exception should to be " + expectedExceptionTextAndOrder.get(1) +
                        " but found " + e.getSuppressed()[0].getMessage(),expectedExceptionTextAndOrder.get(1),e.getSuppressed()[0].getMessage());
        }


            assertEquals("Not correct order call should be ",expectedHistoryCall,actualHistoryCall);


    }
}
