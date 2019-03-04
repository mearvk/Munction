package munction.localized;

import java.net.URL;

public class MunctionDriverCustomExtent
{
    public String classpath = "C:\\Users\\Mr. Max Rupplin\\IdeaProjects\\Munction\\src";

    public URL classpathUrl;

    public MunctionDriverCustomExtent()
    {
        try
        {
            this.classpathUrl = new URL("file", "localhost", classpath);
        }
        catch(Exception exception)
        {
            MunctionException.relist(exception, "","", true, true);
        }
    }
}
