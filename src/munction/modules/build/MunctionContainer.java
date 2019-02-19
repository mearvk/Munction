package munction.modules.build;

import java.util.ArrayList;

public class MunctionContainer extends MunctionContainerAtom
{
	public ArrayList<MunctionProject> projects = new ArrayList<MunctionProject>();

	//

	public MunctionContainer(String munctionserver, String namespace, String projectname, String modulename)
	{
		this.projects.add(new MunctionProject(munctionserver, namespace, projectname, modulename));
	}

	public MunctionContainer()
	{
		this.projects.add(new MunctionProject("munction","default","default","default"));
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

