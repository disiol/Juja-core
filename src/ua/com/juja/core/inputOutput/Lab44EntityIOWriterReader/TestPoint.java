package ua.com.juja.core.inputOutput.Lab44EntityIOWriterReader;

import org.junit.Test;

import java.io.IOException;
import java.io.StringReader;
import java.io.StringWriter;

import static junit.framework.TestCase.assertEquals;

public class TestPoint {

    @Test

    public  void TestPoint() throws IOException {
        Point expectedPoint = new Point(5, 10);
        StringWriter outStringWriter = new StringWriter();
        EntityOutputWriter writer = new EntityOutputWriter(outStringWriter);

        writer.writePoint(expectedPoint);
        String rawString = outStringWriter.toString();

        //call
        StringReader inStringReader = new StringReader(rawString);
        EntityInputReader reader = new EntityInputReader(inStringReader);
        Point actualPoint = reader.readPoint();

        // check
        assertEquals("Expected Point X equals", expectedPoint.getX(), actualPoint.getX());

        assertEquals("Expected Person Y equals ", expectedPoint.getY(), actualPoint.getY());
    }
}