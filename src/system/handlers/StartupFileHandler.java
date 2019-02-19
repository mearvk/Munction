package system.handlers;

import java.io.File;
import java.io.FileNotFoundException;

public class StartupFileHandler
{
    private String startupURL;

    private File startupFile;

    public StartupFileHandler(String startupURL) throws FileNotFoundException
    {
        this.startupURL = startupURL;

        this.startupFile = new File(this.startupURL);
    }
}
