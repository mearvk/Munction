package munction.localized;

import munction.modules.server.MunctionServer;
import system.handlers.ProjectFileHandler;

import java.util.ArrayList;
import java.util.Date;

public class MunctionContainer extends MunctionContainerAtom
{
	public MunctionServer server;

	//

	static
	{
		System.staticref("xmnx://munctioncontainer","xmnx://munctioncontainer", MunctionContainer.class);
	}

	//

	public MunctionContainer(String servername, String munctionname, String namespace, String projectURL)
	{
		System.reference.ref("xmnx://munctioncontainer","xmnx://munctioncontainer", this);

		try
		{
			this.server = new MunctionServer(servername,3434);

			this.server.munctionname = munctionname;

			this.server.namespace = namespace;

			this.server.projecturl = projectURL;

			//

			this.server.extender.notify("{MUNCTIONSERVER}","{MUNCTION}","MunctionContainer created ["+java.lang.System.currentTimeMillis()+"]");
		}
		catch(Exception exception)
		{
			MunctionException.relist(exception,"{MUNCTION}/MunctionContainer.class","constructor",true,true);
		}


		//

		try
		{
			this.handler = new ProjectFileHandler();

			this.handler.setprojectfile(projectURL);

			this.handler.setprojectlist(this.projects);

			this.handler.build();
		}
		catch(Exception exception)
		{
			MunctionException.relist(exception,"{MUNCTION}/MunctionContainer.class","constructor",true,true);
		}
	}

	public MunctionContainer()
	{
		try
		{
			this.server = new MunctionServer(servername,3434);

			this.servername = "munction";

			this.namespace = "munction";

			this.projectURL = "./settings/config/project.xml";

			//

			this.server.extender.notify("{MUNCTIONSERVER}","{MUNCTION}", "MunctionContainer created ["+new Date(java.lang.System.currentTimeMillis())+"]");
		}
		catch(Exception exception)
		{
			MunctionException.relist(exception,"{MUNCTION}/MunctionContainer.class","constructor",true,true);
		}

		//

		try
		{
			this.handler = new ProjectFileHandler();

			this.handler.setprojectfile(projectURL);

			this.handler.setprojectlist(this.projects);

			this.handler.build();
		}
		catch(Exception exception)
		{
			MunctionException.relist(exception,"{MUNCTION}/MunctionContainer.klass","constructor",true,true);
		}
	}

	public void setprojectURL(String url)
	{
		this.server.extender.register("{SERVERURL}", url);
	}

	public void setnamespace(String namespace)
	{
		this.server.extender.register("{NAMESPACE}", namespace);
	}

	public void setservername(String servername)
	{
		this.server.extender.register("{SERVERNAME}", servername);
	}

	public void cord(MunctionAspectContainer aspect, Integer order)
	{

	}
}

class MunctionContainerAtom
{
	public ApplicationContainer applicationinterface = new ApplicationContainer();

	public ProjectFileHandler handler;

	public String servername;

	public String namespace;

	public String projectURL;

	public ArrayList<MunctionProject> projects = new ArrayList<MunctionProject>();

	//

	static
	{
		System.staticref("xmnx://munctioncontaineratom","xmnx://munctioncontaineratom", MunctionContainerAtom.class);
	}

	public MunctionContainerAtom()
	{
		java.lang.System.out.println("[munction] munction container started.");
	}
}

