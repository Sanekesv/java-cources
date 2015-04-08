import com.company.day2.lab06.AppConfig;
import com.company.day2.lab06.Repository;
import junit.framework.TestCase;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@ContextConfiguration(classes = {
        AppConfig.class
})
@RunWith(SpringJUnit4ClassRunner.class)
public class RepositoryImplTest extends TestCase {
    @Autowired
    Repository repository;

    @Test
    public void testPersistMessage() throws Exception {
        repository.persistMessage("sdsfd");
    }
}