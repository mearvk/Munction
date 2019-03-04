package munction.localized;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;

public class StandardMunctionClassloaderExtender
{
    public void standardload(String classname)
    {
        try
        {
            Class klass = Class.forName(classname);

            for(Field field : klass.getDeclaredFields())
            {
                for(Annotation annotation : klass.getDeclaredAnnotations())
                {
                    java.lang.System.out.println(annotation);
                }
            }
        }
        catch(ClassNotFoundException cnfe)
        {
            java.lang.System.err.println("TBD: "+cnfe);
        }
        catch(Exception exception)
        {
            MunctionException.relist(exception,"","", true,true);
        }
    }
}
