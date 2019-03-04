package munction.localized;

public class StandardMunctionClassloaderExtender
{
    public void standardload(String classname)
    {
        try
        {
            Class.forName(classname);
        }
        catch(Exception exception)
        {
            MunctionException.relist(exception,"","", true,true);
        }
    }
}
