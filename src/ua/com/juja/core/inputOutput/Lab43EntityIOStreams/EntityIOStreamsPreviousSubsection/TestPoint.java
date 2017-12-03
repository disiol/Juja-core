package ua.com.juja.core.inputOutput.Lab43EntityIOStreams.EntityIOStreamsPreviousSubsection;

import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;

import static junit.framework.TestCase.assertEquals;

public class TestPoint {

    @Test
    public  void main() throws IOException {
        Point expectedPoint = new Point(5, 10);


        ByteArrayOutputStream outByteArray = new ByteArrayOutputStream();
        EntityOutputStream outEntity = new EntityOutputStream(outByteArray);

        outEntity.writePoint(expectedPoint);

        byte[] rawByteArray = outByteArray.toByteArray();


        //call
        ByteArrayInputStream in = new ByteArrayInputStream(rawByteArray);
        EntityInputStream stream = new EntityInputStream(in);

        Point actualPoint = stream.readPoint();

        //check


            assertEquals("Expected Point X equals",expectedPoint.getX(),actualPoint.getX());


            assertEquals("Expected Person Y equals ",expectedPoint.getY(),actualPoint.getY());


    }
}