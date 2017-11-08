package ua.com.juja.core.Collections.Lab40.SimpleArrayList.Test;

import org.junit.Before;
import ua.com.juja.core.Collections.Lab40.SimpleArrayList.SimpleArrayList;

import java.util.Iterator;
import java.util.NoSuchElementException;

import static junit.framework.TestCase.assertNotNull;
import static org.junit.Assert.assertFalse;

public class TestEmptyList {

    private Iterator<Integer> iterator;

    @Before
    public void before() {
        //empty list
        SimpleArrayList<Integer> simpleArrayList = new SimpleArrayList<>();

        //call and check

        try {
            iterator = simpleArrayList.iterator();
        } catch (UnsupportedOperationException u) {
            throw new AssertionError("Iterator not implemented");
        }
    }


    @org.junit.Test

    public void Test_hasNext() {
        assertFalse("hasNext() must be returned false if no element", iterator.hasNext());
    }

    @org.junit.Test

    public void Test_NotNull_iterator() {
        assertNotNull("Iterator must be no equals null", iterator);
    }


    @org.junit.Test(expected = NoSuchElementException.class)
    public void Test_NoSuchElementException_if_no_element() {

        iterator.next();
    }


}