package system.startup;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Startup
{
    public static void main(String...args)
    {
        new Startup();
    }

    public Startup()
    {
        BeanFactory factory = new ClassPathXmlApplicationContext("/home/xenu/IdeaProjects/Munction/data/META-INF/beans.xml");
    }
}
