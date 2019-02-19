package munction.modules.build;

import munction.modules.server.MunctionServer;
import system.handlers.ProjectFileHandler;

import java.util.ArrayList;

public class MunctionContainer extends MunctionContainerAtom
{
	public ArrayList<MunctionProject> projects = new ArrayList<MunctionProject>();

	//

	public MunctionServer munctionserver;

	//

	public String servername;

	public String namespace;

	public String projectURL;

	//

	public ProjectFileHandler handler;

	//

	public MunctionContainer(String munctionserver, String munctionname, String namespace, String projectURL)
	{
		this.servername = munctionserver;

		this.namespace = namespace;

		this.projectURL = projectURL;

		//

		try
		{
			this.munctionserver = new MunctionServer(munctionserver, 3434);
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
		this.servername = "munction";

		this.namespace = "munction";

		this.projectURL = "./settings/config/project.xml";

		//

		try
		{
			this.munctionserver = new MunctionServer(servername, 3434);
		}
		catch(Exception exception)
		{
			MunctionException.relist(exception,"{MUNCTION}/MunctionContainer.class","constructor",true,true);
		}

		//

		try
		{

		}
		catch(Exception exception)
		{
			MunctionException.relist(exception,"{MUNCTION}/MunctionContainer.klass","constructor",true,true);
		}

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
}

class MunctionContainerAtom
{
	public ApplicationContainer applicationinterface = new ApplicationContainer();

	//

	public MunctionContainerAtom()
	{
		//security manager

		java.lang.System.out.println("Munction container starting...");
	}
}

