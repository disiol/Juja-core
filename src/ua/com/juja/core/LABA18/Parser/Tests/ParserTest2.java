import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ua.com.juja.core.LABA18.Parser.Parser1;
import ua.com.juja.core.LABA18.Parser.Parser2;

/**
 * Created by Denis Oleynyk on 15.07.17.
 * mail: deoniisii@gmail.com
 */
public class ParserTest2 {
    @Test
    public void Test1() {
        Parser2 parser2 = new Parser2();
        Assertions.assertEquals(123, Parser2.eval("123"),">> 123 = ");

    }

    @Test
    public void Test2() {
        Parser2 parser2 = new Parser2();
        Assertions.assertEquals(6, Parser2.eval("2*3"));

    }

    @Test
    public void Test3() {
        Parser2 parser2 = new Parser2();
        Assertions.assertEquals(8, Parser2.eval("123"));

    }@Test
    public void Test4() {
        Parser2 parser2 = new Parser2();
        Assertions.assertEquals(2, Parser2.eval("123"));

    }
}
