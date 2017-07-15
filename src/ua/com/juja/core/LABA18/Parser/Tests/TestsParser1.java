import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ua.com.juja.core.LABA18.Parser.Parser1;


/**
 * Created by Denis Oleynyk on 15.07.17.
 * mail: deoniisii@gmail.com
 */
public class TestsParser1 {


    @Test
    public void Test1() {
        Parser1 parser1 = new Parser1();
        Assertions.assertEquals(123, Parser1.eval("123"),">> 123 = ");

    }

    @Test
    public void Test2() {
        Parser1 parser1 = new Parser1();
        Assertions.assertEquals(6, Parser1.eval("2*3"));

    }

    @Test
    public void Test3() {
        Parser1 parser1 = new Parser1();
        Assertions.assertEquals(8, Parser1.eval("123"));

    }@Test
    public void Test4() {
        Parser1 parser1 = new Parser1();
        Assertions.assertEquals(2, Parser1.eval("123"));

    }
}
