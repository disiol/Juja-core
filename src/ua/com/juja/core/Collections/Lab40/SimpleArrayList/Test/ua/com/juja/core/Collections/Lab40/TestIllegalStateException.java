package ua.com.juja.core.Collections.Lab40.SimpleArrayList.Test.ua.com.juja.core.Collections.Lab40;

import ua.com.juja.core.Collections.Lab40.SimpleArrayList.SimpleArrayList;

import java.util.Iterator;

import static junit.framework.TestCase.assertTrue;

public class TestIllegalStateException {
    @org.junit.Test
    public void TestIllegalStateException() {

        Integer[] expectedElements = {1, 2, 3, 4, 5, 6, 7};

        SimpleArrayList<Integer> simpleArrayList = new SimpleArrayList<>();

        for (int i = 0; i < expectedElements.length; i++) {
            simpleArrayList.add(expectedElements[i]);
        }

        //call and check
        Iterator<Integer> iterator = null;
        try {
            iterator = simpleArrayList.iterator();
        } catch (UnsupportedOperationException u) {
            throw new AssertionError("Iterator not implemented");
        }

        if (iterator == null)
            throw new AssertionError("Iterator must be no equals null");

        boolean isException = false;
        try {
            iterator.remove();
        } catch (IllegalStateException e) {
            isException = true;
        }

        assertTrue("Expected throw IllegalStateException form iterator.remove()", isException);

    }
}