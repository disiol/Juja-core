package ua.com.juja.core.Collections.Lab40.SimpleArrayList;

import org.junit.Test;

import java.util.Iterator;

import static junit.framework.TestCase.*;

public class TestRemove {
    @Test
    public  void testRemove() {

        Integer[] listElements = {1, 2, 3, 4, 5, 6, 7};
        Integer[] expectedElements = {2, 3, 4, 5, 6, 7};

        SimpleArrayList<Integer> arrayList = new SimpleArrayList<>();

        for (int i = 0; i < listElements.length; i++) {
            arrayList.add(listElements[i]);
        }

        SimpleArrayList<Integer> expectedArrayList = new SimpleArrayList<>();

        for (int i = 0; i < expectedElements.length; i++) {
            expectedArrayList.add(expectedElements[i]);
        }


        //call and check
        Iterator<Integer> iterator = null;
        try {
            iterator = arrayList.iterator();
        } catch (UnsupportedOperationException u) {
            throw new AssertionError("Iterator not implemented");
        }

            assertNotNull("Iterator must be no equals null",iterator);

        try {
            iterator.next();
            iterator.remove();
        } catch (IllegalStateException e) {
            throw new AssertionError("Non-expected throw IllegalStateException form iterator.remove()");
        }



            assertEquals("actual data is not equal to expected data",expectedArrayList,arrayList);


    }
}