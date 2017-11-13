package ua.com.juja.core.Collections.Lab41.SimpleLinkedList;

import org.junit.Before;
import java.util.Iterator;
import java.util.NoSuchElementException;

import static junit.framework.TestCase.assertNotNull;
import static org.junit.Assert.assertFalse;

public class TestEmptyList {

    private Iterator<Integer> iterator = null;

    @Before
    public void before() {
        //empty list
        SimpleLinkedList<Integer> simpleLinkedList = new SimpleLinkedList<>();

        //call and check

        try {
            iterator = simpleLinkedList.iterator();
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