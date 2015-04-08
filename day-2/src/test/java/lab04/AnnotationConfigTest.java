import com.company.day2.lab04.Quoter;
import org.junit.Assert;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Map;

public class AnnotationConfigTest {


    @Test
    public void test() {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext("foo.bar.day02.lab04");
        Map<String, Quoter> beansOfType = context.getBeansOfType(Quoter.class);
        Assert.assertEquals(2, beansOfType.size());
        Assert.assertEquals("I'll be back", beansOfType.get("terminatorQuoter").sayQuote());
    }
}