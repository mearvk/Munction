package munction.modules.build.examples.chatprogram;

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
		this.server = new MunctionServer(munctionserver);

		this.namespace = namespace;

		this.projectname = projectname;

		this.modulename = modulename;
	}

	public MunctionContainer()
	{
		this.server = new MunctionServer("default");

		this.namespace = "default";

		this.projectname = "default";

		this.modulename = "default";
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

