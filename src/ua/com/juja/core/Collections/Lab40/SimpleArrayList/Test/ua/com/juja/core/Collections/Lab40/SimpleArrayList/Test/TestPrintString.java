package ua.com.juja.core.Collections.Lab40.SimpleArrayList.Test;

import org.junit.Test;
import ua.com.juja.core.Collections.Lab40.SimpleArrayList.SimpleArrayList;

import java.util.Arrays;

import static junit.framework.TestCase.assertEquals;

public class TestPrintString {

    @Test
    public  void TestPrintString() {
        Integer[] expectedElements = {1, 2, 3, 4, 5, 6, 7};
        String expectedPrintString = "[1, 2, 3, 4, 5, 6, 7]";

        SimpleArrayList<Integer> simpleArrayList = new SimpleArrayList<>();

        for (int i = 0; i < expectedElements.length; i++) {
            simpleArrayList.add(expectedElements[i]);
        }

        //call

        String actualPrintString = simpleArrayList.toString();

        //check

        assertEquals("Should be printed " + expectedPrintString + " but printed " + actualPrintString,
                Arrays.toString(expectedElements), actualPrintString);

    }
}
