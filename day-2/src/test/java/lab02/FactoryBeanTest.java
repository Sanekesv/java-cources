import org.junit.Assert;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by Александр on 08.04.2015.
 */
public class FactoryBeanTest {
    @Test
    public void testFactoryBean() {

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("context02.xml");
        StringBuilder bean = context.getBean(StringBuilder.class);
        Assert.assertNotNull(bean);
        Assert.assertEquals(bean.getClass(), StringBuilder.class);
    }
}
