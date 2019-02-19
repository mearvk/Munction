package munction.modules.build;

import system.handlers.ProjectFileHandler;

import java.util.ArrayList;

public class MunctionContainer extends MunctionContainerAtom
{
	public ArrayList<MunctionProject> projects = new ArrayList<MunctionProject>();

	//

	public String munctionserver;

	public String namespace;

	public String projectURL;

	//

	public ProjectFileHandler handler;

	//

	public MunctionContainer(String munctionserver, String munctionname, String namespace, String projectURL)
	{
		this.munctionserver = munctionserver;

		this.namespace = namespace;

		this.projectURL = projectURL;

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
		this.munctionserver = "munction";

		this.namespace = "munction";

		this.projectURL = "./settings/config/project.xml";

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

