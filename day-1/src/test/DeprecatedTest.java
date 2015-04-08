import com.company.day1.lab10.AwesomeClass;
import com.company.day1.lab10.NoOldClass;
import org.junit.Assert;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by Александр on 08.04.2015.
 */
public class DeprecatedTest {
    @Test
    public void deprecatedTest() {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("context10.xml");
        Object replacedBean = context.getBean("replacedBean");
        Assert.assertEquals(AwesomeClass.class, replacedBean.getClass());
        Object noReplaceBean = context.getBean("noOldClass");
        Assert.assertEquals(NoOldClass.class, noReplaceBean.getClass());

    }
}
