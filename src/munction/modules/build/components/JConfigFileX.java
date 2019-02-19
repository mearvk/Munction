package munction.modules.build.components;

import java.io.File;

public class JConfigFileX
{
    public File file;

    public JConfigFileX(File file)
    {
        this.file = file;
    }

    public JConfigFileX(String url)
    {
        try
        {
            this.file = new File(url);
        }
        catch(Exception e)
        {
            return;
        }
    }

}
