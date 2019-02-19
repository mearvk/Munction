package munction.modules.build;

import munction.modules.server.MunctionServer;
import system.handlers.StartupFileHandler;

import java.io.FileNotFoundException;

public class MunctionProject
{
    public MunctionServer server;

    public String namespace;

    public String projectname;

    public String modulename;

    public String startupURL;

    //

    public StartupFileHandler handler;

    //

    public MunctionProject(String munctionserver, String namespace, String projectname, String modulename, String startupURL)
    {
        try
        {
            this.server = new MunctionServer(munctionserver, 3434);

            this.namespace = namespace;

            this.projectname = projectname;

            this.modulename = modulename;

            this.startupURL = startupURL;

            //

            this.handler = new StartupFileHandler(this.startupURL);
        }
        catch(FileNotFoundException fnfe)
        {
            MunctionException.relist(fnfe, "{MUNCTION}/munctioncontainer", "constructor", true, true);
        }
        catch(Exception e)
        {
            MunctionException.relist(e, "{MUNCTION}/munctioncontainer", "constructor", true, true);
        }
    }

    public MunctionProject()
    {
        try
        {
            this.server = new MunctionServer("munction",3434);

            this.namespace = "default";

            this.projectname = "default";

            this.modulename = "default";

            this.startupURL = "./settings/config/startup.xml";

            //

            this.handler = new StartupFileHandler(this.startupURL);
        }
        catch(FileNotFoundException fnfe)
        {
            MunctionException.relist(fnfe, "{MUNCTION}/munctioncontainer", "constructor", true);
        }
        catch(Exception e)
        {
            MunctionException.relist(e, "{MUNCTION}/munctioncontainer", "constructor", true);
        }
    }
}
