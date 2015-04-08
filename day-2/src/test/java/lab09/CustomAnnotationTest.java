import com.company.day2.lab09.AppConfig;
import com.company.day2.lab09.Dao;
import com.company.day2.lab09.Derby;
import com.company.day2.lab09.Oracle;
import junit.framework.TestCase;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@ContextConfiguration(classes = {
        AppConfig.class
})
@RunWith(SpringJUnit4ClassRunner.class)
public class CustomAnnotationTest extends TestCase {

    @Autowired
    @Derby
    Dao derbyDaofds;

    @Autowired
    @Oracle
    Dao oracleDasdfsdfo;


    @Test
    public void testAnnotation() throws Exception {
        Assert.assertNotEquals(derbyDaofds.getClass(), oracleDasdfsdfo.getClass());
    }
}