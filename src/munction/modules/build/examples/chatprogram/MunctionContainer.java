package munction.modules.build.examples.chatprogram;

import munction.modules.build.MunctionException;
import munction.modules.server.MunctionServer;

public class MunctionContainer extends MunctionContainerAtom
{
	public MunctionServer server;

	public String namespace;

	public String projectname;

	public String modulename;

	//

	public MunctionContainer(String munctionserver, String namespace, String projectname, String modulename)
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

	public MunctionContainer()
	{
		try
		{
			this.server = new MunctionServer("default",3434);

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

class MunctionContainerAtom
{
	public ApplicationContainer applicationinterface = new ApplicationContainer();

	//

	public MunctionContainerAtom()
	{

	}
}

