package ua.com.juja.core.inputOutput.Lab44EntityIOWriterReader;

import java.io.IOException;
import java.io.StringReader;
import java.io.StringWriter;

import org.junit.Test;

import static junit.framework.TestCase.assertEquals;


public class TestPerson {

    @Test
    public void TestPerson() throws IOException {
        Person expectedPerson = new Person("John", 32);

        StringWriter outStringWriter = new StringWriter();
        EntityOutputWriter writer = new EntityOutputWriter(outStringWriter);

        writer.writePerson(expectedPerson);
        String rawString = outStringWriter.toString();


        //call
        StringReader inStringReader = new StringReader(rawString);

        EntityInputReader reader = new EntityInputReader(inStringReader);

        Person actualPerson = reader.readPerson();

        //check

        assertEquals("Expected Person name equals ", expectedPerson.getName(), actualPerson.getName());


        assertEquals("Expected Person age equals ", expectedPerson.getAge(), actualPerson.getAge());
    }
}
