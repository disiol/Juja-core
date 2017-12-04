package ua.com.juja.core.inputOutput.Lab45FilterByteInputStream;

import org.junit.Test;

import java.io.*;
import java.util.Arrays;

import static junit.framework.TestCase.assertEquals;

public class TestDataEquals {

    @Test
    public void testDataEquals() throws IOException {
        final int BUFF_LEN = 4;
        final byte FILTER_CRITERIA = 0;

        final byte[] DATA = {
                1, 0, 0, 2, 34, 5, 6, 7, 78, 8, 9, 0, 2, 3, 5, 6, 7, 7
        };

        byte[] expectedOutData = {
                1, 2, 34, 5, 6, 7, 78, 8, 9, 2, 3, 5, 6, 7, 7
        };

        //call
        byte[] actualOutData = null;

        ByteArrayInputStream dataInputStream = new ByteArrayInputStream(DATA);

        ByteArrayOutputStream dataOutputStream = new ByteArrayOutputStream();
        ByteFilter.filter(dataInputStream, dataOutputStream, BUFF_LEN, FILTER_CRITERIA);
        actualOutData = dataOutputStream.toByteArray();

        //check

        assertEquals("DATA equals " + Arrays.toString(DATA), Arrays.toString(expectedOutData), Arrays.toString(actualOutData));
    }
}
