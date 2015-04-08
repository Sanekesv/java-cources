import com.company.day2.lab03.SpeakingRobot;
import org.junit.Assert;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by Александр on 08.04.2015.
 */
public class PrototypeTest {
    @Test
    public void test(){
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("day02/context03.xml");
        SpeakingRobot bean = context.getBean(SpeakingRobot.class);
        Assert.assertEquals(bean.speak(), bean.speak());
    }
}
