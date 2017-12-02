package ua.com.juja.core.nputOutput.Lab43EntityIOStreams.EntityIOStreamsPreviousSubsection;

import org.junit.Test;
import ua.com.juja.core.nputOutput.Lab43EntityIOStreams.EntityIOStreamsPreviousSubsection.EntityOutputStream;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;

import static junit.framework.TestCase.assertEquals;

public class TestPersonAndAge {

    @Test
    public void main() throws IOException {

        Person expectedPerson = new Person("John", 32);

        ByteArrayOutputStream outByteArray = new ByteArrayOutputStream();
        EntityOutputStream outEntity = new EntityOutputStream(outByteArray);

        outEntity.writePerson(expectedPerson);

        byte[] rawByteArray = outByteArray.toByteArray();


        //call
        ByteArrayInputStream in = new ByteArrayInputStream(rawByteArray);
        EntityInputStream stream = new EntityInputStream(in);

        Person actualPerson = stream.readPerson();

        //check
        assertEquals("Expected Person name equals ", expectedPerson.getName(), actualPerson.getName());


        assertEquals("Expected Person age equals ",expectedPerson.getAge(),actualPerson.getAge());

    }
}
