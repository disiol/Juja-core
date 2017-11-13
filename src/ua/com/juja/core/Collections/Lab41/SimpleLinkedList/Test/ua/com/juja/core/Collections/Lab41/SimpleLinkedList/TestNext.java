package ua.com.juja.core.Collections.Lab41.SimpleLinkedList;

import org.junit.Test;
import ua.com.juja.core.Collections.Lab40.SimpleArrayList.SimpleArrayList;

import java.util.Iterator;
import java.util.NoSuchElementException;

import static org.junit.Assert.*;

public class TestNext {


    @Test

    public void Test() {

        Iterator<Integer> iterator;
        Integer testOneElement = 1;

        // list is one element
        SimpleArrayList<Integer> simpleArrayList = new SimpleArrayList<>();

        simpleArrayList.add(testOneElement);

        //call and check
        iterator = null;
        try {
            iterator = simpleArrayList.iterator();
        } catch (UnsupportedOperationException u) {
            throw new AssertionError("Iterator not implemented");
        }


        assertNotNull("Iterator must be no equals null", iterator);

        // call before get element
        assertTrue("hasNext() must be returned true if list is not empty", iterator.hasNext());

        // get element
        boolean isExceptionMethodNext = false;
        Integer actualResultNext = null;
        try {
            actualResultNext = iterator.next();
        } catch (NoSuchElementException e) {
            isExceptionMethodNext = true;
        }

        //call after get one element

        assertFalse("hasNext() must be returned false if no element", iterator.hasNext());


        if (isExceptionMethodNext)
            throw new AssertionError("next() must be throw NoSuchElementException if no element");

        if (actualResultNext.compareTo(testOneElement) != 0)
            throw new AssertionError("OneElement must be equals " + testOneElement.toString() + " but found " + actualResultNext.toString());


    }
}
