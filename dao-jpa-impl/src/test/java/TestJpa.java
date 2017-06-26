import org.apache.log4j.BasicConfigurator;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestJpa
{
    @Test
    public void testJpa()
    {
        BasicConfigurator.configure();
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("classpath:**/*.xml");
        for (String names : context.getBeanDefinitionNames())
        {
            System.out.println(names);
        }
    }
}
