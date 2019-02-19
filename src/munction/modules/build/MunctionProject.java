package munction.modules.build;

import munction.modules.server.MunctionServer;

public class MunctionProject
{
    public MunctionServer server;

    public String namespace;

    public String projectname;

    public String modulename;

    //

    public MunctionProject(String munctionserver, String namespace, String projectname, String modulename)
    {
        try
        {
            this.server = new MunctionServer(munctionserver, 3434);

            this.namespace = namespace;

            this.projectname = projectname;

            this.modulename = modulename;
        }
        catch(Exception e)
        {
            MunctionException.relist(e, "{MUNCTION}/munctioncontainer", "constructor", true);
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
        }
        catch(Exception e)
        {
            MunctionException.relist(e, "{MUNCTION}/munctioncontainer", "constructor", true);
        }
    }
}
